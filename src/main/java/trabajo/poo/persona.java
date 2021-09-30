
package trabajo.poo;

/**
 *
 * @author Administrador
 */
public class persona {
    //Crear atributos para la persona
    protected String nombreCompleto;
    protected String apellidos;
    protected String genero;
    protected int edad;
    
    //Crear el contructor por defecto

    public persona() {
    }
    // Crear el constructor con parametros

    public persona(String nombreCompleto, String apellidos, String genero, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }
   // Crear los getters y setters para la clase persona

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    private void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the apellidos
     */
    private String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    private void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the genero
     */
    private String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    private void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    private int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    private void setEdad(int edad) {
        this.edad = edad;
    }   
        
}
