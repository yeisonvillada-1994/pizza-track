// Clase para crear nodos de la lista
public class Nodo {

    // Guarda una pizza
    Pizza dato;

    // Guarda el siguiente nodo
    Nodo siguiente;

    // Constructor del nodo
    public Nodo(Pizza dato) {

        // Guardar pizza en el nodo
        this.dato = dato;

        // Inicia sin apuntar a otro nodo
        this.siguiente = null;
    }
}
