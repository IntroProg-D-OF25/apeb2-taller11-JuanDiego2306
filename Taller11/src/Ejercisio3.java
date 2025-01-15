import java.util.Scanner;
/** Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe llamar desde un método principal. Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 *
 * @Juan Quizhpe
 */
public class Ejercisio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        
        double primerNota, segundaNota, terceraNota, cuartaNota, promedio = 0;
        String calificacion = null;  
        System.out.println("Ingrese la primera nota:");
        primerNota = entrada.nextDouble();  
        System.out.println("Ingrese la segunda nota:");
        segundaNota = entrada.nextDouble();   
        System.out.println("Ingrese la tercera nota:");
        terceraNota = entrada.nextDouble();  
        System.out.println("Ingrese la cuarta nota:");
        cuartaNota = entrada.nextDouble();
        System.out.println("La calificación cualitativa es: " + CalificacionCualitativa(primerNota, segundaNota, terceraNota, cuartaNota, promedio, calificacion));
    }
    
    public static String CalificacionCualitativa(double primNot, double seguNot, double tercNot, double cuarNot, double promed, String calific) {  
        promed = (primNot + seguNot + tercNot + cuarNot) / 4;
        if (promed >= 9.1) {
            calific = "Sobresaliente";  
        } else if (promed >= 8.1) {
            calific = "Muy Bueno";  
        } else if (promed >= 5.1) {
            calific = "Bueno";  
        } else {
            calific = "Regular";  
        }
        return calific;
    }
}
/***
 * debug:
 * Ingrese la primera nota:
8
Ingrese la segunda nota:
9
Ingrese la tercera nota:
7
Ingrese la cuarta nota:
9
La calificación cualitativa es: Muy Bueno
 */