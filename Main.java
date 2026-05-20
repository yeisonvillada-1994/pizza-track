import java.util.Scanner;

/**
 * Clase Main - Menú interactivo del sistema Pizza-Track
 *
 * Punto de entrada del programa. Muestra un menú en consola con las
 * siguientes opciones:
 *
 *   1. Registrar Pizza  -> push() en la pila principal
 *   2. Deshacer (Undo)  -> pop() de principal, push() a secundaria
 *   3. Rehacer (Redo)   -> pop() de secundaria, push() a principal
 *   4. Mostrar Pedido   -> peek() de la pila principal
 *   0. Salir
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       🍕  PIZZA-TRACK  🍕            ║");
        System.out.println("║  Sistema de Gestión de Pedidos       ║");
        System.out.println("╚══════════════════════════════════════╝");

        int opcion = -1;

        // Bucle principal del menú
        while (opcion != 0) {

            // Mostrar estado actual de las pilas
            gestion.mostrarEstadoPilas();

            // Mostrar menú de opciones
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║          MENÚ                ║");
            System.out.println("║  1. Registrar Pizza          ║");
            System.out.println("║  2. Deshacer (Undo)          ║");
            System.out.println("║  3. Rehacer (Redo)           ║");
            System.out.println("║  4. Mostrar Pedido Actual    ║");
            System.out.println("║  0. Salir                    ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario con manejo de error
            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("❌ Por favor ingrese un número válido.");
                continue;
            }

            // Procesar la opción elegida
            switch (opcion) {

                case 1:
                    // ---- REGISTRAR PIZZA ----
                    System.out.print("Ingrese el nombre de la pizza: ");
                    String nombre = scanner.nextLine().trim();

                    String[] ingredientes = new String[3];
                    System.out.println("Ingrese los 3 ingredientes:");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("  Ingrediente " + (i + 1) + ": ");
                        ingredientes[i] = scanner.nextLine().trim();
                    }

                    // Crear el objeto Pizza y registrarlo
                    Pizza nuevaPizza = new Pizza(nombre, ingredientes);
                    gestion.registrarPedido(nuevaPizza);
                    break;

                case 2:
                    // ---- DESHACER (UNDO) ----
                    gestion.deshacer();
                    break;

                case 3:
                    // ---- REHACER (REDO) ----
                    gestion.rehacer();
                    break;

                case 4:
                    // ---- MOSTRAR PEDIDO ACTUAL ----
                    gestion.mostrarPedidoActual();
                    break;

                case 0:
                    // ---- SALIR ----
                    System.out.println("\n👋 ¡Gracias por usar Pizza-Track! Cerrando sistema...");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
