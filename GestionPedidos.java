/**
 * Clase GestionPedidos - Sistema de control Undo/Redo con Dos Pilas
 *
 * Coordina dos pilas manuales para implementar el flujo de pedidos:
 *
 *   PILA PRINCIPAL  (Undo)  -> Almacena los pedidos activos
 *   PILA SECUNDARIA (Redo)  -> Almacena los pedidos deshechos temporalmente
 *
 * Flujo del sistema:
 *
 *   Registrar: pizza -> [push] -> Pila Principal
 *
 *   Deshacer:  Pila Principal -> [pop] -> pizza -> [push] -> Pila Secundaria
 *
 *   Rehacer:   Pila Secundaria -> [pop] -> pizza -> [push] -> Pila Principal
 *
 * IMPORTANTE: Al registrar un nuevo pedido, la pila secundaria se limpia,
 * ya que el historial de redo queda invalidado.
 */
public class GestionPedidos {

    // Pila Principal: almacena los pedidos activos (permite Deshacer)
    private PilaManual pilaPrincipal;

    // Pila Secundaria: almacena pedidos deshechos (permite Rehacer)
    private PilaManual pilaSecundaria;

    /**
     * Constructor: inicializa ambas pilas vacías.
     */
    public GestionPedidos() {
        this.pilaPrincipal = new PilaManual();
        this.pilaSecundaria = new PilaManual();
    }

    /**
     * REGISTRAR PEDIDO - Agrega una pizza a la pila principal.
     *
     * Al registrar un nuevo pedido, se limpia la pila secundaria
     * porque el historial de "Rehacer" ya no es válido.
     *
     * @param pizza Objeto Pizza a registrar
     */
    public void registrarPedido(Pizza pizza) {
        pilaPrincipal.push(pizza);

        // Limpiar pila secundaria: nuevo pedido invalida el historial de redo
        limpiarPilaSecundaria();

        System.out.println("\n✅ Pedido registrado: " + pizza);
    }

    /**
     * DESHACER (Undo) - Elimina el último pedido y lo mueve a pila secundaria.
     *
     * Toma el tope de la pila principal con pop() y lo empuja (push)
     * a la pila secundaria para posible recuperación.
     */
    public void deshacer() {
        if (pilaPrincipal.isEmpty()) {
            System.out.println("\n⚠️  No hay pedidos para deshacer.");
            return;
        }

        // Mover el tope de pila principal a pila secundaria
        Pizza pizzaDeshecha = pilaPrincipal.pop();
        pilaSecundaria.push(pizzaDeshecha);

        System.out.println("\n↩️  Pedido deshecho: " + pizzaDeshecha);
    }

    /**
     * REHACER (Redo) - Recupera el último pedido deshecho.
     *
     * Toma el tope de la pila secundaria con pop() y lo empuja (push)
     * de vuelta a la pila principal.
     */
    public void rehacer() {
        if (pilaSecundaria.isEmpty()) {
            System.out.println("\n⚠️  No hay pedidos para rehacer.");
            return;
        }

        // Mover el tope de pila secundaria de vuelta a pila principal
        Pizza pizzaRecuperada = pilaSecundaria.pop();
        pilaPrincipal.push(pizzaRecuperada);

        System.out.println("\n↪️  Pedido rehecho: " + pizzaRecuperada);
    }

    /**
     * MOSTRAR PEDIDO ACTUAL - Usa peek() para ver el pedido en producción.
     * No retira la pizza de la pila, solo la consulta.
     */
    public void mostrarPedidoActual() {
        Pizza actual = pilaPrincipal.peek();
        if (actual == null) {
            System.out.println("\n📋 No hay ningún pedido activo en este momento.");
        } else {
            System.out.println("\n📋 Pedido actual en producción: " + actual);
        }
    }

    /**
     * Muestra el estado completo de ambas pilas para depuración/visualización.
     */
    public void mostrarEstadoPilas() {
        System.out.println("\n--- Estado de la Pila Principal (Pedidos Activos) ---");
        pilaPrincipal.mostrarTodos();

        System.out.println("--- Estado de la Pila Secundaria (Pedidos Deshechos) ---");
        pilaSecundaria.mostrarTodos();
    }

    /**
     * Vacía la pila secundaria haciendo pop() de todos sus elementos.
     * Se llama cuando un nuevo pedido invalida el historial de redo.
     */
    private void limpiarPilaSecundaria() {
        while (!pilaSecundaria.isEmpty()) {
            pilaSecundaria.pop();
        }
    }
}
