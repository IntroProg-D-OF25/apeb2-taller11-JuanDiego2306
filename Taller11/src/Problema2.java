import java.util.Scanner;
/**Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 *
 * @Juan Quizhpe
 */
public class Problema2 {
    public static void main(String[] args) {
        int opcionMenu;
        boolean continuar = true;
        double medida1, medida2, area = 0;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular área de un Cuadrado");
            System.out.println("2. Calcular área de un Triángulo");
            System.out.println("3. Calcular área de un Rectángulo");

            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:       
                    System.out.print("Introduce la medida de un lado del cuadrado: ");
                    medida1 = scanner.nextDouble();
                    area = calcularAreaCuadrado(medida1);
                    System.out.println("El área del cuadrado es: " + area);
                    continuar = false;  
                    break;
                case 2:
                    System.out.print("Introduce la base del triángulo: ");
                    medida1 = scanner.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    medida2 = scanner.nextDouble();
                    area = calcularAreaTriangulo(medida1, medida2);
                    System.out.println("El área del triángulo es: " + area);
                    continuar = false; 
                    break;
                case 3:
                    System.out.print("Introduce el largo del rectángulo: ");
                    medida1 = scanner.nextDouble();
                    System.out.print("Introduce el ancho del rectángulo: ");
                    medida2 = scanner.nextDouble();
                    area = calcularAreaRectangulo(medida1, medida2);
                    System.out.println("El área del rectángulo es: " + area);
                    continuar = false;  
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    continuar = true;  
            }
        }
    }

    public static double calcularAreaCuadrado(double lado) {
        double area = lado * lado;
        return area;
    }
    public static double calcularAreaTriangulo(double base, double altura) {
      double area = (base * altura) / 2;
      return area;
    }
    public static double calcularAreaRectangulo(double largo, double ancho) {
        double area = largo * ancho;
        return area;
    }
}
/***
 * debug:
 * 1. Calcular área de un Cuadrado
2. Calcular área de un Triángulo
3. Calcular área de un Rectángulo
1
Introduce la medida de un lado del cuadrado: 6
El área del cuadrado es: 36.0
* Seleccione una opción:
1. Calcular área de un Cuadrado
2. Calcular área de un Triángulo
3. Calcular área de un Rectángulo
2
Introduce la base del triángulo: 8
Introduce la altura del triángulo: 9
El área del triángulo es: 36.0
* Seleccione una opción:
1. Calcular área de un Cuadrado
2. Calcular área de un Triángulo
3. Calcular área de un Rectángulo
3
Introduce el largo del rectángulo: 4
Introduce el ancho del rectángulo: 8
El área del rectángulo es: 32.0
 */