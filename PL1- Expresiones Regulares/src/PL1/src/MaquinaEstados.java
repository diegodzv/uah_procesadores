// src/MaquinaEstados.java
import java.util.function.Function;

public class MaquinaEstados {
    private final AFD afd;
    private int estadoActual;
    private final Function<Character, Character> mapper; // transforma input -> símbolo del AFD

    /** Excepción lanzada cuando no existe transición. */
    public static class TransicionNoDefinidaException extends Exception {
        public TransicionNoDefinidaException(String msg) { super(msg); }
    }

    /**
     * Constructor.
     * @param afd El autómata (matriz, alfabeto, etc.)
     * @param mapper Función que mapea el carácter real a un símbolo del alfabeto del AFD.
     */
    public MaquinaEstados(AFD afd, Function<Character, Character> mapper) {
        this.afd = afd;
        this.mapper = mapper != null ? mapper : (c -> c);
        this.estadoActual = afd.getEstadoInicial();
    }

    /** Inicializa la máquina (estadoActual := estado inicial del AFD). */
    public void inicializar() {
        this.estadoActual = afd.getEstadoInicial();
    }

    /**
     * Consume un carácter: aplica el mapper para obtener el símbolo del AFD
     * y actualiza el estadoActual, o lanza TransicionNoDefinidaException si no existe.
     */
    public void acepta(char caracter) throws TransicionNoDefinidaException {
        char simbolo = mapper.apply(caracter);
        Integer siguiente = afd.getSiguienteEstado(estadoActual, simbolo);
        if (siguiente == null) {
            throw new TransicionNoDefinidaException(
                "No hay transición desde el estado " + estadoActual + " con símbolo '" + simbolo + "' (entrada '" + caracter + "')");
        }
        this.estadoActual = siguiente;
    }

    /** Devuelve true si el estado actual es final. */
    public boolean esFinal() {
        return afd.esFinal(estadoActual);
    }

    /**
     * Recorre la cadena y devuelve true si la AFD acepta la cadena completa.
     * Si en cualquier momento no existe transición para un símbolo, devuelve false.
     *
     */
    public boolean compruebaCadena(String input) {
        inicializar();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            try {
                acepta(c);
            } catch (TransicionNoDefinidaException ex) {
                // transición no definida => rechazo
                return false;
            }
        }
        return esFinal();
    }

    /** Devuelve el estado actual (útil para debugging). */
    public int getEstadoActual() {
        return estadoActual;
    }
}
