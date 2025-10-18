// src/Main.java
import java.util.*;

public class Main {

    // Mapper helper: convierte caracteres reales a símbolos del AFD
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

    /** Construye el AFD del caso (a): identificador (token 'L' y 'D'). */
    private static AFD construirIdentificador() {
        AFD afd = new AFD();
        afd.cargarAlfabeto('L'); afd.cargarAlfabeto('D'); afd.cargarAlfabeto('O');

        afd.addEstadosConsecutivos(0,1);
        afd.inicializarMatriz();
        afd.establecerQi(0);
        afd.establecerQf(1);

        afd.cargarTransicion(0, 'L', 1);
        afd.cargarTransicion(1, 'L', 1);
        afd.cargarTransicion(1, 'D', 1);

        return afd;
    }

    /** Construye el AFD del caso (b): par de 'a' en {a,b}. */
    private static AFD construirParA() {
        AFD afd = new AFD();
        afd.cargarAlfabeto('a'); afd.cargarAlfabeto('b');

        afd.addEstadosConsecutivos(0,1);
        afd.inicializarMatriz();
        afd.establecerQi(0);
        afd.establecerQf(0);

        afd.cargarTransicion(0, 'a', 1);
        afd.cargarTransicion(0, 'b', 0);
        afd.cargarTransicion(1, 'a', 0);
        afd.cargarTransicion(1, 'b', 1);

        return afd;
    }

    /** Construye el AFD del caso (c): float/int con tokens 'D' y '.' */
    private static AFD construirFloat() {
        AFD afd = new AFD();
        afd.cargarAlfabeto('D'); afd.cargarAlfabeto('.'); afd.cargarAlfabeto('O');

        afd.addEstadosConsecutivos(0,3);
        afd.inicializarMatriz();
        afd.establecerQi(0);
        afd.establecerQf(1);
        afd.establecerQf(3);

        afd.cargarTransicion(0, 'D', 1);
        afd.cargarTransicion(1, 'D', 1);
        afd.cargarTransicion(1, '.', 2);
        afd.cargarTransicion(2, 'D', 3);
        afd.cargarTransicion(3, 'D', 3);

        return afd;
    }

    /** Construye el AFD del caso (d): operaciones aritméticas entre variables y floats */
    private static AFD construirOperaciones() {
        AFD afd = new AFD();
        afd.cargarAlfabeto('L'); afd.cargarAlfabeto('D'); afd.cargarAlfabeto('.');
        afd.cargarAlfabeto('+'); afd.cargarAlfabeto('-'); afd.cargarAlfabeto('O');

        afd.addEstadosConsecutivos(0,5);
        afd.inicializarMatriz();
        afd.establecerQi(0);
        afd.establecerQf(1);
        afd.establecerQf(2);
        afd.establecerQf(4);

        // Inicio -> identificador o número
        afd.cargarTransicion(0, 'L', 1);
        afd.cargarTransicion(0, 'D', 2);

        // Identificador -> identificador o operador
        afd.cargarTransicion(1, 'L', 1);
        afd.cargarTransicion(1, 'D', 1);
        afd.cargarTransicion(1, '+', 5);
        afd.cargarTransicion(1, '-', 5);

        // Entero -> entero, operador o punto
        afd.cargarTransicion(2, 'D', 2);
        afd.cargarTransicion(2, '+', 5);
        afd.cargarTransicion(2, '-', 5);
        afd.cargarTransicion(2, '.', 3);

        // Punto -> dígito (fracción)
        afd.cargarTransicion(3, 'D', 4);

        // Fracción -> dígito o operador
        afd.cargarTransicion(4, 'D', 4);
        afd.cargarTransicion(4, '+', 5);
        afd.cargarTransicion(4, '-', 5);

        // Operador -> inicio de nuevo operando
        afd.cargarTransicion(5, 'L', 1);
        afd.cargarTransicion(5, 'D', 2);

        return afd;
    }

    /** Demostración de un AFD con un conjunto de pruebas. */
    private static void demoAFD(AFD afd, java.util.function.Function<Character, Character> mapper, String[] pruebas) {
        MaquinaEstados maquina = new MaquinaEstados(afd, mapper);
        System.out.println("=== Probando AFD ===");
        System.out.println(afd);
        for (String s : pruebas) {
            boolean ok = maquina.compruebaCadena(s);
            System.out.printf("Input: %-20s -> %s\n", "\"" + s + "\"", ok ? "ACEPTADA" : "RECHAZADA");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AFD afdIdent = construirIdentificador();
        AFD afdParA = construirParA();
        AFD afdFloat = construirFloat();
        AFD afdOper = construirOperaciones();

        String[] pruebasIdent = {"var", "var2", "COUNTER", "2var", "v@r"};
        String[] pruebasParA = {"", "baba", "a", "aa", "ababa"};
        String[] pruebasFloat = {"25", "3.5", "3.", ".5", "33.02", "abc", "12.0.3"};
        String[] pruebasOper = {"3-var+2.5+var2", "var+3.5-2", "2+2", "3..5", "+var", "var+"};

        System.out.println("=== CASO (a) Identificador ===");
        demoAFD(afdIdent, letterDigitMapper, pruebasIdent);

        System.out.println("=== CASO (b) Par de 'a' ===");
        demoAFD(afdParA, identityMapper, pruebasParA);

        System.out.println("=== CASO (c) Float/Int ===");
        demoAFD(afdFloat, floatMapper, pruebasFloat);

        System.out.println("=== CASO (d) Operaciones aritméticas ===");
        demoAFD(afdOper, letterDigitMapper, pruebasOper);

        // Interactivo
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Prueba interactiva rápida. Pulsa ENTER para salir.");
            AFD current = afdIdent;
            java.util.function.Function<Character, Character> currentMapper = letterDigitMapper;
            MaquinaEstados machine = new MaquinaEstados(current, currentMapper);
            while (true) {
                System.out.println("\nElige AFD: 1=identificador, 2=parA, 3=float, 4=operaciones, ENTER=shell exit");
                String sel = sc.nextLine().trim();
                if (sel.isEmpty()) break;
                if (sel.equals("1")) { current = afdIdent; currentMapper = letterDigitMapper; }
                else if (sel.equals("2")) { current = afdParA; currentMapper = identityMapper; }
                else if (sel.equals("3")) { current = afdFloat; currentMapper = floatMapper; }
                else if (sel.equals("4")) { current = afdOper; currentMapper = letterDigitMapper; }
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
