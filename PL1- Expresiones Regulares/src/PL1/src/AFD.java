// src/AFD.java
import java.util.*;

public class AFD {
    private final List<Character> alfabeto; // lista de símbolos del alfabeto
    private final List<Integer> estados;    // lista de estados (ints)
    private int estadoInicial;
    private final Set<Integer> estadosFinales;
    private final Map<Integer, Map<Character, Integer>> matriz;     // la "matriz" dinámica

    public AFD() {
        this.alfabeto = new ArrayList<>();
        this.estados = new ArrayList<>();
        this.estadoInicial = 0;
        this.estadosFinales = new HashSet<>();
        this.matriz = new HashMap<>();
    }

    // ----- Métodos para cargar estructura -----

    /** Añade un símbolo al alfabeto (si no existe). */
    public void cargarAlfabeto(Character c) {
        if (!alfabeto.contains(c)) alfabeto.add(c);
    }

    /** Añade una lista de símbolos al alfabeto. */
    public void cargarAlfabeto(Collection<Character> cs) {
        for (Character c : cs) cargarAlfabeto(c);
    }

    /** Añade un estado (por ejemplo 0...n-1). */
    public void addEstado(int q) {
        if (!estados.contains(q)) {
            estados.add(q);
        }
    }

    /** Añade varios estados consecutivos del from (inclusive) al to (inclusive). */
    public void addEstadosConsecutivos(int from, int to) {
        for (int q = from; q <= to; q++) addEstado(q);
    }

    /** Establece el estado inicial. */
    public void establecerQi(int q) {
        if (!estados.contains(q)) addEstado(q);
        this.estadoInicial = q;
    }

    /** Marca un estado como final. */
    public void establecerQf(int q) {
        if (!estados.contains(q)) addEstado(q);
        estadosFinales.add(q);
    }

    /** Elimina un estado final (si existía). */
    public void quitarQf(int q) {
        estadosFinales.remove(q);
    }

    // ----- Inicialización y carga de la "matriz" -----

    /**
     * Inicializa la matriz creando por cada estado una fila (mapa vacío).
     * Se debe llamar a este método después de crear estados y alfabeto (o cada vez
     * que se añadan estados nuevos).
     */
    public void inicializarMatriz() {
        for (Integer q : estados) {
            if (!matriz.containsKey(q)) {
                matriz.put(q, new HashMap<>()); // fila vacía
            }
        }
    }

    /**
     * Rellena la transición desde estado 'origen' con el símbolo 'simbolo' hacia 'destino'.
     * Si la fila no existe, la crea (por eso es robusto).
     */
    public void cargarTransicion(int origen, Character simbolo, Integer destino) {
        if (!estados.contains(origen)) addEstado(origen);
        if (!estados.contains(destino)) addEstado(destino);
        cargarAlfabeto(simbolo);
        matriz.computeIfAbsent(origen, k -> new HashMap<>())
              .put(simbolo, destino);
    }

    /**
     * Obtiene la transición: para estadoActual y caracter devuelve el estado destino
     * o null si no existe.
     */
    public Integer getSiguienteEstado(int estadoActual, Character caracter) {
        Map<Character, Integer> fila = matriz.get(estadoActual);
        if (fila == null) return null;
        return fila.get(caracter); // puede ser null si no existe transición
    }

    // ----- Consultas -----

    public boolean esFinal(int estado) {
        return estadosFinales.contains(estado);
    }

    public int getEstadoInicial() {
        return estadoInicial;
    }

    public List<Character> getAlfabeto() {
        return Collections.unmodifiableList(alfabeto);
    }

    public List<Integer> getEstados() {
        return Collections.unmodifiableList(estados);
    }

    public Set<Integer> getEstadosFinales() {
        return Collections.unmodifiableSet(estadosFinales);
    }

    public Map<Integer, Map<Character, Integer>> getMatriz() {
        return Collections.unmodifiableMap(matriz);
    }

    // ----- Representación para depuración -----
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AFD:\n");
        sb.append("Alfabeto: ").append(alfabeto).append("\n");
        sb.append("Estados: ").append(estados).append("\n");
        sb.append("EstadoInicial: ").append(estadoInicial).append("\n");
        sb.append("EstadosFinales: ").append(estadosFinales).append("\n");
        sb.append("Matriz(transiciones):\n");
        for (Integer q : estados) {
            sb.append(" q").append(q).append(" -> ");
            Map<Character, Integer> fila = matriz.get(q);
            if (fila == null) { sb.append("{}\n"); continue; }
            sb.append(fila.toString()).append("\n");
        }
        return sb.toString();
    }
}
