import java.util.Scanner;
/**Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 *
 * @Juan Quizhpe
 */
public class Ejercisio4 {
    public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
           double pres_kilov, num_kilov, totplani = 0, valBien;
        int opMenu;
        boolean op = true; 
        String nomCli = "", apellCli = "", numeCed = "";
        
        while (op){
            System.out.println("Escoja una opcion");
            System.out.println("1. Calculo Planilla Luz");
            System.out.println("2. Calculo de Predial");
            
            opMenu = tcl.nextInt();
               
        switch (opMenu) {
            case 1: 
            System.out.println("Ingresa nombre del Cliente");
            nomCli = tcl.nextLine();
            System.out.println("Ingresa apellido del Cliente");
            apellCli = tcl.nextLine(); // Solicitar también el apellido
            System.out.println("Ingresa número de cédula del Cliente");
            numeCed = tcl.nextLine();
            System.out.println("Ingrese valor del Kilovatio");
            pres_kilov = tcl.nextDouble();
            System.out.println("Ingrese cantidad de Kilovatios Consumidos");
            num_kilov = tcl.nextDouble();
            System.out.println("Nombre:" + nomCli + " " + apellCli);
              System.out.println("Número de cédula: " + numeCed);
            System.out.println("Total a pagar: " + calcularPlanillaLuz(pres_kilov, num_kilov,totplani));
            break;
           
             case 2: 
                    System.out.println("Ingrese nombre del cliente: ");
                    nomCli = tcl.nextLine();
                    apellCli = tcl.nextLine();
                    System.out.println("Ingrese el número de cédula del cliente: ");
                    numeCed = tcl.nextLine();
                    System.out.println("Ingrese el valor del bien inmueble: ");
                    valBien = tcl.nextDouble();
                    System.out.println("Nombre: " + nomCli + " " + apellCli);
                    System.out.println("Número cédula: " + numeCed);
                    System.out.println("Valor del bien inmueble: " + (valBien));
                    System.out.println("Valor a pagar por predio: " + calculoPredio(valBien));
                    break;
                    
                default:
                    System.out.println("Opción no válida, intenta de nuevo");
                    break;
            }
        }
    }
    public static double calcularPlanillaLuz(double pres_kilov, double num_kilov, double totplani) {
        totplani = pres_kilov * num_kilov;
        return totplani;
    }
    public static double calculoPredio(double valBien) {
        valBien *= 0.02; 
        return valBien;
       }

   
    }
/***
 * debug:
 * Escoja una opcion
1. Calculo Planilla Luz
2. Calculo de Predial
1
Ingresa nombre del Cliente
Ingresa apellido del Cliente
Juan Quizhpe
Ingresa número de cédula del Cliente
2101002109
Ingrese valor del Kilovatio
25
Ingrese cantidad de Kilovatios Consumidos
1000
Nombre: Juan Quizhpe
Número de cédula: 2101002109
Total a pagar: 25000.0
Escoja una opcion
1. Calculo Planilla Luz
2. Calculo de Predial
2
Ingrese nombre del cliente: 
Juan Quizhpe
Ingrese el número de cédula del cliente: 
2101002109
Ingrese el valor del bien inmueble: 
25
Nombre:  Juan Quizhpe
Número cédula: 2101002109
Valor del bien inmueble: 25.0
Valor a pagar por predio: 0.5
Escoja una opcion
1. Calculo Planilla Luz
2. Calculo de Predial
 */ 
   
      

