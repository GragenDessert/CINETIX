package maincinetix;
import java.util.Scanner;
public class MainCinetix {

    public static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Hola
        // HOla hoal hoala hola hola hoal hola
        // Muchos holas muchos holas muchoas holas muchoas holas
        System.out.println("Para que haya algo!");
        System.out.println("Intoduce exactamente la palabra -- CINETIX --");
        String input = lector.nextLine();
        while(!input.equals("CINETIX")) {
            System.out.println("Palabra incorrecta. Ingresa la palabra de nuevo o ingresa -- x -- para salir:");
            input = lector.nextLine();
            if (input.equals("x") || input.equals("CINETIX")) {
                break;
            }
        }
        System.out.println(input);
    }
    
}


