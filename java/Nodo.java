/**
 * Clase Nodo - Elemento base para la Lista Ligada (Linked List)
 * 
 * Cada nodo almacena un objeto Pizza y una referencia (puntero)
 * al siguiente nodo en la lista. Esta es la estructura fundamental
 * de la pila manual implementada sin java.util.Stack.
 */
public class Nodo {

    // El dato que almacena este nodo (objeto Pizza)
    Pizza dato;

    // Puntero al siguiente nodo en la lista ligada
    // Si es null, este nodo es el último de la lista
    Nodo siguiente;

    /**
     * Constructor del Nodo.
     * Inicializa el nodo con un pedido de pizza.
     * El puntero "siguiente" queda en null hasta que se encadene.
     *
     * @param dato Objeto Pizza que este nodo va a almacenar
     */
    public Nodo(Pizza dato) {
        this.dato = dato;
        this.siguiente = null; // Por defecto no apunta a ningún nodo
    }
}
