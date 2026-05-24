// Clase para representar una pizza
public class Pizza {

    // Guardar nombre de la pizza
    private String nombre;

    // Guardar ingredientes
    private String[] ingredientes;

    // Constructor de la pizza
    public Pizza(String nombre, String[] ingredientes) {

        // Guardar nombre
        this.nombre = nombre;

        // Crear arreglo de 3 posiciones
        this.ingredientes = new String[3];

        // Recorrer posiciones del arreglo
        for (int i = 0; i < 3; i++) {

            // Revisar si existe ingrediente
            if (i < ingredientes.length) {

                // Guardar ingrediente
                this.ingredientes[i] = ingredientes[i];

            } else {

                // Rellenar espacio vacío
                this.ingredientes[i] = "N/A";
            }
        }
    }

    // Obtener nombre de la pizza
    public String getNombre() {

        // Retornar nombre
        return nombre;
    }

    // Obtener ingredientes
    public String[] getIngredientes() {

        // Retornar ingredientes
        return ingredientes;
    }

    // Convertir objeto a texto
    @Override
    public String toString() {

        // Mostrar información de la pizza
        return "Pizza: " + nombre
                + " | Ingredientes: ["
                + ingredientes[0] + ", "
                + ingredientes[1] + ", "
                + ingredientes[2] + "]";
    }
}
