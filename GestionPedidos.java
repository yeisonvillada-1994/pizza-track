// Clase para manejar pedidos usando pilas
public class GestionPedidos {

    // Guarda los pedidos activos
    private PilaManual pilaPrincipal;

    // Guarda pedidos deshechos
    private PilaManual pilaSecundaria;

    // Constructor de la clase
    public GestionPedidos() {

        // Crear pila principal
        this.pilaPrincipal = new PilaManual();

        // Crear pila secundaria
        this.pilaSecundaria = new PilaManual();
    }

    // Registrar un pedido nuevo
    public void registrarPedido(Pizza pizza) {

        // Agregar pizza a la pila principal
        pilaPrincipal.push(pizza);

        // Limpiar pedidos deshechos
        limpiarPilaSecundaria();

        // Mostrar mensaje
        System.out.println("\n✅ Pedido registrado: " + pizza);
    }

    // Deshacer el último pedido
    public void deshacer() {

        // Revisar si no hay pedidos
        if (pilaPrincipal.isEmpty()) {

            // Mostrar advertencia
            System.out.println("\n⚠️ No hay pedidos para deshacer.");
            return;
        }

        // Sacar el último pedido
        Pizza pizzaDeshecha = pilaPrincipal.pop();

        // Guardar pedido deshecho
        pilaSecundaria.push(pizzaDeshecha);

        // Mostrar mensaje
        System.out.println("\n↩️ Pedido deshecho: " + pizzaDeshecha);
    }

    // Recuperar un pedido deshecho
    public void rehacer() {

        // Revisar si hay pedidos para recuperar
        if (pilaSecundaria.isEmpty()) {

            // Mostrar advertencia
            System.out.println("\n⚠️ No hay pedidos para rehacer.");
            return;
        }

        // Sacar pedido de la pila secundaria
        Pizza pizzaRecuperada = pilaSecundaria.pop();

        // Regresar pedido a la pila principal
        pilaPrincipal.push(pizzaRecuperada);

        // Mostrar mensaje
        System.out.println("\n↪️ Pedido rehecho: " + pizzaRecuperada);
    }

    // Mostrar pedido actual
    public void mostrarPedidoActual() {

        // Obtener pedido actual
        Pizza actual = pilaPrincipal.peek();

        // Revisar si no hay pedidos
        if (actual == null) {

            // Mostrar mensaje
            System.out.println("\n📋 No hay pedidos activos.");

        } else {

            // Mostrar pedido actual
            System.out.println("\n📋 Pedido actual: " + actual);
        }
    }

    // Mostrar el contenido de las pilas
    public void mostrarEstadoPilas() {

        // Mostrar pedidos activos
        System.out.println("\n--- Pedidos Activos ---");

        // Mostrar pila principal
        pilaPrincipal.mostrarTodos();

        // Mostrar pedidos deshechos
        System.out.println("--- Pedidos Deshechos ---");

        // Mostrar pila secundaria
        pilaSecundaria.mostrarTodos();
    }

    // Limpiar pila secundaria
    private void limpiarPilaSecundaria() {

        // Repetir mientras tenga datos
        while (!pilaSecundaria.isEmpty()) {

            // Eliminar elementos
            pilaSecundaria.pop();
        }
    }
}
