// Clase para manejar una pila manual
public class PilaManual {

    // Guarda el nodo del tope
    private Nodo tope;

    // Constructor de la pila
    public PilaManual() {

        // La pila inicia vacía
        this.tope = null;
    }

    // Agregar una pizza a la pila
    public void push(Pizza pizza) {

        // Crear un nuevo nodo
        Nodo nuevoNodo = new Nodo(pizza);

        // Conectar con el tope actual
        nuevoNodo.siguiente = tope;

        // Actualizar el tope
        tope = nuevoNodo;
    }

    // Eliminar el último elemento
    public Pizza pop() {

        // Revisar si está vacía
        if (isEmpty()) {

            // No hay nada para eliminar
            return null;
        }

        // Guardar pizza del tope
        Pizza pizzaRetirada = tope.dato;

        // Mover el tope al siguiente nodo
        tope = tope.siguiente;

        // Retornar pizza eliminada
        return pizzaRetirada;
    }

    // Mostrar el elemento del tope
    public Pizza peek() {

        // Revisar si está vacía
        if (isEmpty()) {

            // No hay datos
            return null;
        }

        // Retornar pizza del tope
        return tope.dato;
    }

    // Revisar si la pila está vacía
    public boolean isEmpty() {

        // Devuelve true si está vacía
        return tope == null;
    }

    // Mostrar todos los elementos
    public void mostrarTodos() {

        // Revisar si está vacía
        if (isEmpty()) {

            // Mostrar mensaje
            System.out.println("   (pila vacía)");
            return;
        }

        // Empezar desde el tope
        Nodo actual = tope;

        // Contador de posición
        int posicion = 1;

        // Recorrer la pila
        while (actual != null) {

            // Mostrar el tope
            if (posicion == 1) {

                // Mostrar primer elemento
                System.out.println("   [TOPE] " + actual.dato);

            } else {

                // Mostrar otros elementos
                System.out.println("   [" + posicion + "]    " + actual.dato);
            }

            // Ir al siguiente nodo
            actual = actual.siguiente;

            // Aumentar contador
            posicion++;
        }
    }
}
