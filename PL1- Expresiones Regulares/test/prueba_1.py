class Automata:
    def __init__(self, alphabet, regex):
        self.alphabet = alphabet
        self.regex = regex
        self.afn = {}
        self.afd = {}
        self.simplified_afd = {}
        self.state_matrix = []
        self.start_state = None
        self.accept_states = []

    def create_afn(self):
        current_state = 0
        self.start_state = current_state
        self.afn[current_state] = {}
        stack = []

        for i, char in enumerate(self.regex):
            if char in self.alphabet:
                next_state = current_state + 1
                if current_state not in self.afn:
                    self.afn[current_state] = {}
                self.afn[current_state][char] = [next_state]
                current_state = next_state
                stack.append(current_state)

            elif char == '?':  # Soporte para el operador opcional
                last_state = stack.pop()
                self.afn[last_state] = self.afn.get(last_state, {})
                # Permitir que el símbolo sea opcional
                self.afn[current_state].update(self.afn.get(last_state, {}))

            elif char == '*':  # Soporte para el operador de repetición
                last_state = stack.pop()
                self.afn[last_state] = self.afn.get(last_state, {})
                # Añadir transición de retorno al inicio del bloque `*`
                self.afn[current_state][self.regex[i - 1]] = [last_state]

        self.accept_states = [current_state]
        print("AFN creado con éxito:", self.afn)

    def afn_to_afd(self):
        initial_closure = self.epsilon_closure([self.start_state])
        afd_states = {frozenset(initial_closure): 0}
        unprocessed = [initial_closure]
        afd_transitions = {}
        new_state_index = 1

        while unprocessed:
            current_set = unprocessed.pop(0)
            current_frozenset = frozenset(current_set)
            afd_transitions[afd_states[current_frozenset]] = {}

            for symbol in self.alphabet:
                next_set = set()
                for state in current_set:
                    if state in self.afn and symbol in self.afn[state]:
                        for trans_state in self.afn[state][symbol]:
                            next_set.update(self.epsilon_closure([trans_state]))
                if next_set:
                    next_frozenset = frozenset(next_set)
                    if next_frozenset not in afd_states:
                        afd_states[next_frozenset] = new_state_index
                        unprocessed.append(next_set)
                        new_state_index += 1
                    afd_transitions[afd_states[current_frozenset]][symbol] = afd_states[next_frozenset]
        
        # Almacenar AFD final y asignar el estado inicial y de aceptación
        self.afd = afd_transitions
        self.start_state = 0
        self.accept_states = [state for closure, state in afd_states.items() if any(s in self.accept_states for s in closure)]
        print("AFD generado con éxito:", self.afd)

    def epsilon_closure(self, states):
        closure = set(states)
        stack = list(states)
        while stack:
            state = stack.pop()
            if state in self.afn and 'ε' in self.afn[state]:
                for next_state in self.afn[state]['ε']:
                    if next_state not in closure:
                        closure.add(next_state)
                        stack.append(next_state)
        return closure

    def simplify_afd(self):
        # Simplifica el AFD eliminando estados no accesibles
        pass  # Se podría implementar como paso adicional

    def generate_state_matrix(self):
        max_state = max(self.afd.keys())
        self.state_matrix = [{} for _ in range(max_state + 1)]
        for state, transitions in self.afd.items():
            for symbol, target_state in transitions.items():
                self.state_matrix[state][symbol] = target_state
        print("Matriz de estados generada:", self.state_matrix)

    def generate_valid_strings(self, max_length, max_count):
        results = []
        self._dfs_generate(self.start_state, "", max_length, results, max_count)
        return results

    def _dfs_generate(self, current_state, current_string, max_length, results, max_count):
        if len(current_string) > max_length or len(results) >= max_count:
            return
        if current_state in self.accept_states:
            results.append(current_string)
        
        for symbol in self.alphabet:
            next_state = self.state_matrix[current_state].get(symbol)
            if next_state is not None:
                self._dfs_generate(next_state, current_string + symbol, max_length, results, max_count)

def get_alphabet():
    return input("Introduce los caracteres que formarán el alfabeto, separados por comas: ").split(',')

def get_regex():
    return input("Introduce la expresión regular a estudiar: ")

def main():
    alphabet = get_alphabet()
    regex = get_regex()

    max_length = int(input("Introduce la longitud máxima de las cadenas válidas: "))
    max_count = int(input("Introduce el número máximo de cadenas a generar: "))

    automata = Automata(alphabet, regex)
    automata.create_afn()
    automata.afn_to_afd()
    automata.simplify_afd()
    automata.generate_state_matrix()

    valid_strings = automata.generate_valid_strings(max_length, max_count)
    print("Cadenas válidas generadas:")
    for s in valid_strings:
        print(s)

if __name__ == "__main__":
    main()
