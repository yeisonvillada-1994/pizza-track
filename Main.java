// Importar Scanner para leer datos
import java.util.Scanner;

// Clase principal del programa
public class Main {

    // Método principal
    public static void main(String[] args) {

        // Crear Scanner para leer datos
        Scanner scanner = new Scanner(System.in);

        // Crear objeto para gestionar pedidos
        GestionPedidos gestion = new GestionPedidos();

        // Mostrar título del sistema
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       🍕  PIZZA-TRACK  🍕            ║");
        System.out.println("║  Sistema de Gestión de Pedidos       ║");
        System.out.println("╚══════════════════════════════════════╝");

        // Variable para guardar opción del menú
        int opcion = -1;

        // Repetir hasta que el usuario salga
        while (opcion != 0) {

            // Mostrar estado de las pilas
            gestion.mostrarEstadoPilas();

            // Mostrar menú
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║          MENÚ                ║");
            System.out.println("║  1. Registrar Pizza          ║");
            System.out.println("║  2. Deshacer (Undo)          ║");
            System.out.println("║  3. Rehacer (Redo)           ║");
            System.out.println("║  4. Mostrar Pedido Actual    ║");
            System.out.println("║  0. Salir                    ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Seleccione una opción: ");

            // Intentar leer la opción
            try {

                // Convertir texto a número
                opcion = Integer.parseInt(scanner.nextLine().trim());

            } catch (NumberFormatException e) {

                // Mostrar error si no es número
                System.out.println("❌ Por favor ingrese un número válido.");

                // Volver al menú
                continue;
            }

            // Revisar opción elegida
            switch (opcion) {

                // Registrar pizza
                case 1:

                    // Pedir nombre de la pizza
                    System.out.print("Ingrese el nombre de la pizza: ");

                    // Guardar nombre
                    String nombre = scanner.nextLine().trim();

                    // Crear arreglo de ingredientes
                    String[] ingredientes = new String[3];

                    // Pedir ingredientes
                    System.out.println("Ingrese los 3 ingredientes:");

                    // Repetir 3 veces
                    for (int i = 0; i < 3; i++) {

                        // Pedir ingrediente
                        System.out.print("  Ingrediente " + (i + 1) + ": ");

                        // Guardar ingrediente
                        ingredientes[i] = scanner.nextLine().trim();
                    }

                    // Crear nueva pizza
                    Pizza nuevaPizza = new Pizza(nombre, ingredientes);

                    // Registrar pedido
                    gestion.registrarPedido(nuevaPizza);
                    break;

                // Deshacer pedido
                case 2:

                    // Ejecutar deshacer
                    gestion.deshacer();
                    break;

                // Rehacer pedido
                case 3:

                    // Ejecutar rehacer
                    gestion.rehacer();
                    break;

                // Mostrar pedido actual
                case 4:

                    // Mostrar pedido
                    gestion.mostrarPedidoActual();
                    break;

                // Salir del sistema
                case 0:

                    // Mostrar despedida
                    System.out.println("\n👋 ¡Gracias por usar Pizza-Track! Cerrando sistema...");
                    break;

                // Opción inválida
                default:

                    // Mostrar mensaje de error
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }

        // Cerrar Scanner
        scanner.close();
    }
}
