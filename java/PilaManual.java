/**
 * Clase PilaManual - Implementación de pila usando Lista Ligada
 *
 * Esta pila NO usa java.util.Stack (prohibido por la actividad).
 * En su lugar, se implementa desde cero con Nodos enlazados.
 *
 * Lógica de la lista ligada:
 *   - El "tope" es el nodo más reciente (head de la lista).
 *   - Al hacer push(), el nuevo nodo apunta al tope anterior y
 *     se convierte en el nuevo tope.
 *   - Al hacer pop(), se retira el tope y el nodo siguiente
 *     pasa a ser el nuevo tope.
 *
 *   [tope] -> [nodo2] -> [nodo3] -> null
 */
public class PilaManual {

    // Puntero al tope de la pila (nodo más reciente)
    private Nodo tope;

    /**
     * Constructor: inicializa la pila vacía.
     * El tope apunta a null porque no hay ningún nodo todavía.
     */
    public PilaManual() {
        this.tope = null;
    }

    /**
     * PUSH - Inserta un objeto Pizza en el tope de la pila.
     *
     * Pasos:
     *  1. Crear un nuevo Nodo con la pizza.
     *  2. El nuevo nodo apunta al tope actual (enlace de lista ligada).
     *  3. El tope ahora es el nuevo nodo.
     *
     * @param pizza Objeto Pizza a apilar
     */
    public void push(Pizza pizza) {
        Nodo nuevoNodo = new Nodo(pizza); // Paso 1: crear nodo
        nuevoNodo.siguiente = tope;       // Paso 2: enlazar con el tope actual
        tope = nuevoNodo;                 // Paso 3: actualizar el tope
    }

    /**
     * POP - Retira el nodo del tope y devuelve su contenido (Pizza).
     *
     * Pasos:
     *  1. Verificar que la pila no esté vacía.
     *  2. Guardar la pizza del tope para retornarla.
     *  3. Mover el puntero del tope al siguiente nodo.
     *  4. El nodo anterior queda desreferenciado (se recolecta por GC).
     *
     * @return Pizza del tope, o null si la pila está vacía
     */
    public Pizza pop() {
        if (isEmpty()) {
            return null; // Pila vacía, no hay nada que retirar
        }
        Pizza pizzaRetirada = tope.dato; // Paso 2: guardar el dato
        tope = tope.siguiente;           // Paso 3: mover el puntero al siguiente
        return pizzaRetirada;            // Paso 4: retornar la pizza retirada
    }

    /**
     * PEEK - Visualiza la pizza en el tope SIN retirarla.
     * Solo consulta el dato del nodo tope sin modificar la estructura.
     *
     * @return Pizza del tope, o null si la pila está vacía
     */
    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }
        return tope.dato; // Solo leemos, no movemos el puntero
    }

    /**
     * IS_EMPTY - Valida si la pila está vacía.
     * La pila está vacía cuando el tope es null (no hay nodos).
     *
     * @return true si vacía, false si tiene al menos un elemento
     */
    public boolean isEmpty() {
        return tope == null;
    }

    /**
     * Muestra todos los pedidos en la pila desde el tope hacia abajo.
     * Recorre la lista ligada siguiendo los punteros "siguiente".
     */
    public void mostrarTodos() {
        if (isEmpty()) {
            System.out.println("   (pila vacía)");
            return;
        }
        Nodo actual = tope; // Comenzar desde el tope
        int posicion = 1;
        while (actual != null) {
            // Indicar cuál es el tope visualmente
            if (posicion == 1) {
                System.out.println("   [TOPE] " + actual.dato);
            } else {
                System.out.println("   [" + posicion + "]    " + actual.dato);
            }
            actual = actual.siguiente; // Avanzar al siguiente nodo
            posicion++;
        }
    }
}
