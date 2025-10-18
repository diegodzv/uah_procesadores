// File: Main.java
import java.util.*;

/**
 * Demo que construye varios AFDs (ejemplos) y permite probar cadenas.
 * - Caso (a) Identificador usando tokens 'L' (letter) y 'D' (digit).
 * - Caso (b) Par de 'a' en alfabeto {'a','b'}.
 * - Caso (c) Float/Int usando tokens 'D' (digit) y '.' literal.
 *
 * Compilar:
 *   javac AFD.java MaquinaEstados.java Main.java
 * Ejecutar:
 *   java Main
 */
public class Main {

    // Mapper helper: convierte caracteres reales a símbolos del AFD:
    // - identityMapper: no hace nada
    private static final java.util.function.Function<Character, Character> identityMapper = c -> c;

    // Mapper que transforma letras -> 'L', dígitos -> 'D', resto identity
    private static final java.util.function.Function<Character, Character> letterDigitMapper = ch -> {
        if (Character.isLetter(ch)) return 'L';
        if (Character.isDigit(ch)) return 'D';
        return ch;
    };

    // Mapper que transforma dígitos -> 'D', '.' -> '.', resto identity
    private static final java.util.function.Function<Character, Character> floatMapper = ch -> {
        if (Character.isDigit(ch)) return 'D';
        if (ch == '.') return '.';
        return ch;
    };

    /** Construye el AFD del caso (b): par de 'a' en {a,b}. */
    private static AFD construirParA() {
        AFD afd = new AFD();
        // alfabeto {a,b}
        afd.cargarAlfabeto('a'); afd.cargarAlfabeto('b');

        // Estados 0 (par) y 1 (impar)
        afd.addEstadosConsecutivos(0, 1);
        afd.inicializarMatriz();
        afd.establecerQi(0);
        afd.establecerQf(0); // q0 es final (0 a's -> par)

        // transiciones:
        // q0 -a-> q1, q0 -b-> q0
        afd.cargarTransicion(0, 'a', 1);
        afd.cargarTransicion(0, 'b', 0);
        // q1 -a-> q0, q1 -b-> q1
        afd.cargarTransicion(1, 'a', 0);
        afd.cargarTransicion(1, 'b', 1);

        return afd;
    }

    /** Construye el AFD del caso (a): identificador (token 'L' y 'D'). */
    private static AFD construirIdentificador() {
        AFD afd = new AFD();
        // alfabeto: 'L' = letter, 'D' = digit, 'O' = other (opcional)
        afd.cargarAlfabeto('L'); afd.cargarAlfabeto('D'); afd.cargarAlfabeto('O');

        // estados 0: start, 1: dentro identificador (acept)
        afd.addEstadosConsecutivos(0,1);
        afd.inicializarMatriz();
        afd.establecerQi(0);
        afd.establecerQf(1);

        // transiciones (usando tokens 'L' y 'D'):
        afd.cargarTransicion(0, 'L', 1); // start + L -> identificador
        // desde q1, L y D mantienen q1
        afd.cargarTransicion(1, 'L', 1);
        afd.cargarTransicion(1, 'D', 1);

        return afd;
    }

    /** Construye el AFD del caso (c): float/int con tokens 'D' y '.' */
    private static AFD construirFloat() {
        AFD afd = new AFD();
        afd.cargarAlfabeto('D'); afd.cargarAlfabeto('.'); afd.cargarAlfabeto('O');

        // Estados: 0=start, 1=entero(leido >=1 digito) (accept),
        // 2=tras punto esperando digito (no accept), 3=fraccion (>=1 digito tras punto) (accept)
        afd.addEstadosConsecutivos(0,3);
        afd.inicializarMatriz();
        afd.establecerQi(0);
        afd.establecerQf(1);
        afd.establecerQf(3);

        // transiciones
        afd.cargarTransicion(0, 'D', 1); // digit -> entero
        afd.cargarTransicion(1, 'D', 1); // entero + digit -> entero
        afd.cargarTransicion(1, '.', 2); // entero + '.' -> espera digito
        afd.cargarTransicion(2, 'D', 3); // punto + digit -> fracción (al menos 1)
        afd.cargarTransicion(3, 'D', 3); // fracción + digit -> fracción

        return afd;
    }

    private static void demoAFD(AFD afd, java.util.function.Function<Character, Character> mapper, String[] pruebas) {
        MaquinaEstados maquina = new MaquinaEstados(afd, mapper);
        System.out.println("=== Probando AFD ===");
        System.out.println(afd);
        for (String s : pruebas) {
            boolean ok = maquina.compruebaCadena(s);
            System.out.printf("Input: %-15s -> %s\n", "\"" + s + "\"", ok ? "ACEPTADA" : "RECHAZADA");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Construimos 3 autómatas y los probamos con conjuntos de pruebas.
        AFD afdParA = construirParA();
        AFD afdIdent = construirIdentificador();
        AFD afdFloat = construirFloat();

        // Pruebas
        String[] pruebasParA = {"", "baba", "a", "aa", "ababa"};
        String[] pruebasIdent = {"var", "var2", "COUNTER", "2var", "v@r"};
        String[] pruebasFloat = {"25", "3.5", "3.", ".5", "33.02", "abc", "12.0.3"};

        System.out.println("=== CASO (b) Par de 'a' en {a,b} ===");
        demoAFD(afdParA, identityMapper, pruebasParA);

        System.out.println("=== CASO (a) Identificador (LETTER->'L', DIGIT->'D') ===");
        demoAFD(afdIdent, letterDigitMapper, pruebasIdent);

        System.out.println("=== CASO (c) Float/Int (DIGIT->'D', '.'->'.') ===");
        demoAFD(afdFloat, floatMapper, pruebasFloat);

        // Interactivo simple opcional:
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Prueba interactiva rápida. Pulsa ENTER para salir.");
            AFD current = afdIdent;
            java.util.function.Function<Character, Character> currentMapper = letterDigitMapper;
            MaquinaEstados machine = new MaquinaEstados(current, currentMapper);
            while (true) {
                System.out.println("\nElige AFD: 1=identificador, 2=parA, 3=float, ENTER=shell exit");
                String sel = sc.nextLine().trim();
                if (sel.isEmpty()) break;
                if (sel.equals("1")) { current = afdIdent; currentMapper = letterDigitMapper; }
                else if (sel.equals("2")) { current = afdParA; currentMapper = identityMapper; }
                else if (sel.equals("3")) { current = afdFloat; currentMapper = floatMapper; }
                else { System.out.println("Opción inválida"); continue; }

                machine = new MaquinaEstados(current, currentMapper);
                System.out.print("Introduce cadena a comprobar (ENTER para volver al menú): ");
                String s = sc.nextLine();
                if (s.isEmpty()) continue;
                boolean accept = machine.compruebaCadena(s);
                System.out.println(accept ? "ACEPTADA" : "RECHAZADA");
            }
        }

        System.out.println("Demo finalizada.");
    }
}
