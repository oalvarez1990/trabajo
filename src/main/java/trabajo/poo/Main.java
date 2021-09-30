
package trabajo.poo;

import java.util.InputMismatchException;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.R;
import trabajo.poo.operaciones.operacionPersona;

/**
 *
 * @author Administrador
 */
public class Main {
Scanner sc = new Scanner(System.in);
       //--- menu de opciones ------//
        boolean salida = false;
        int t,opcion; //Guardaremos la opcion del usuario
        while (!salida) // Mientras no sea falso se repite el menu
        {
 
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. Salir");
            // try catch para manejar excepciones y controlar los errores en tiempo de ejecución
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
                               System.out.println("Solo números entre 1 y 4");
                               
           
                        break;
                    case 2:
                          R.promedioedad();
                    break;
                    case 3:
                    
                    break;
                    case 4:
                        salida = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }    
        
    }         
 
    

