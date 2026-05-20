/**
 * Clase Pizza - Modelo de datos del sistema Pizza-Track
 * 
 * Representa un pedido de pizza con nombre e ingredientes.
 * Utiliza un arreglo fijo de tamaño 3 para almacenar ingredientes,
 * tal como lo exige la actividad.
 */
public class Pizza {

    // Atributos del objeto Pizza
    private String nombre;
    private String[] ingredientes; // Arreglo fijo de tamaño 3 (obligatorio)

    /**
     * Constructor de Pizza.
     * Recibe el nombre y un arreglo de exactamente 3 ingredientes.
     *
     * @param nombre       Nombre de la pizza (ej: "Margarita")
     * @param ingredientes Arreglo de 3 ingredientes
     */
    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;

        // Se garantiza que el arreglo siempre tenga tamaño fijo de 3
        this.ingredientes = new String[3];
        for (int i = 0; i < 3; i++) {
            if (i < ingredientes.length) {
                this.ingredientes[i] = ingredientes[i];
            } else {
                this.ingredientes[i] = "N/A"; // Relleno si no se proporcionan 3
            }
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    /**
     * Representación en texto del pedido de pizza.
     * Muestra nombre e ingredientes en un formato legible para consola.
     */
    @Override
    public String toString() {
        return "Pizza: " + nombre
                + " | Ingredientes: ["
                + ingredientes[0] + ", "
                + ingredientes[1] + ", "
                + ingredientes[2] + "]";
    }
}
