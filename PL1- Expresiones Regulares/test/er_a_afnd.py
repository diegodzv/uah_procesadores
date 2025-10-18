class AFN:
    def __init__(self):
        self.states = []
        self.transitions = {}
        self.start_state = None
        self.accept_states = set()

    def add_state(self):
        """Crea un nuevo estado y lo añade al conjunto de estados."""
        state_id = len(self.states)
        self.states.append(state_id)
        self.transitions[state_id] = {}
        return state_id

    def add_transition(self, from_state, symbol, to_state):
        """Agrega una transición desde un estado a otro usando un símbolo."""
        if symbol in self.transitions[from_state]:
            self.transitions[from_state][symbol].append(to_state)
        else:
            self.transitions[from_state][symbol] = [to_state]

    def set_start_state(self, state):
        """Define el estado de inicio."""
        self.start_state = state

    def set_accept_state(self, state):
        """Define el estado de aceptación."""
        self.accept_states.add(state)

    @staticmethod
    def basic(symbol):
        """Crea un AFN básico para un símbolo único."""
        afn = AFN()
        start = afn.add_state()
        accept = afn.add_state()
        afn.add_transition(start, symbol, accept)
        afn.set_start_state(start)
        afn.set_accept_state(accept)
        return afn

    def concatenate(self, other):
        """Concatenación de dos AFN."""
        for state in other.states:
            new_state = len(self.states)
            self.states.append(new_state)
            self.transitions[new_state] = {symbol: targets[:] for symbol, targets in other.transitions[state].items()}
            if state in other.accept_states:
                self.accept_states.add(new_state)

    @staticmethod
    def union(afn1, afn2):
        """Realiza la unión entre dos AFN usando un nuevo estado inicial."""
        new_afn = AFN()
        start = new_afn.add_state()
        
        # Concatenar ambos AFN y crear transiciones epsilon desde el nuevo estado inicial
        new_afn.concatenate(afn1)
        new_afn.concatenate(afn2)
        new_afn.add_transition(start, 'ε', afn1.start_state)
        new_afn.add_transition(start, 'ε', afn2.start_state)
        new_afn.set_start_state(start)

        return new_afn
