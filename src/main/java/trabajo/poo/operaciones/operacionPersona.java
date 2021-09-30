package trabajo.poo.operaciones;

import java.util.Scanner;
import trabajo.poo.persona;

/**
 *
 * @author Administrador
 */
public class operacionPersona {
Scanner entrada = new Scanner(System.in);
    // Crear atributos para realizar operaciones
    persona k;
    private int contadorm;
    private int contadorf;
    private int promedio;
    
    
    // Crear constructor por defecto

    public operacionPersona() {
    }
    // Constructor con parametros 

    public operacionPersona(int contadorm, int contadorf, int promedio) {
        this.contadorm = contadorm;
        this.contadorf = contadorf;
        this.promedio = promedio;
    }
    // Crear los metodos y getter y setters para operacione personas
    /**
     * @return the contadorm
     */
    public int getContadorm() {
        return contadorm;
    }

    /**
     * @param contadorm the contadorm to set
     */
    public void setContadorm(int contadorm) {
        this.contadorm = contadorm;
    }

    /**
     * @return the contadorf
     */
    public int getContadorf() {
        return contadorf;
    }

    /**
     * @param contadorf the contadorf to set
     */
    public void setContadorf(int contadorf) {
        this.contadorf = contadorf;
    }

    /**
     * @return the promedio
     */
    public int getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    // Crear el metodos para calcular los numeros de personas por genero y edad
    
    public void mostrarNombreedad(int numeropersona){
        String nombreCompleto;
        String apellido;
        String genero;
        int edad;
        for (int l = 0; l == numeropersona; l++) {
            
            System.out.println("Escriba el nombre completo");
            nombreCompleto = entrada.nextLine();
            
            System.out.println("Escriba el apellido completo");
            apellido = entrada.nextLine();
            
            System.out.println("Escriba el Genero");
            genero = entrada.nextLine();
            
            System.out.println("Escriba la edad");
            edad = entrada.nextInt();
            k = new persona();
            System.out.println("El nombre completo es:" +k.getNombreCompleto());
            

        }
    
        
    }    
    
}
