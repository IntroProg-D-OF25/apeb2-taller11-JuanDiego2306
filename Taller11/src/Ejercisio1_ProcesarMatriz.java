import java.util.Scanner;
/**Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional.
 *
 * @Juan Quizhpe
 */
public class Ejercisio1_ProcesarMatriz {   
public static void main(String[] args) {
        int limiteF=0,limiteCo=0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("deme limite de filas y limite de columnas:  ");
        limiteF= tcl.nextInt();
        limiteCo=tcl.nextInt();
        int matriz[][]= new int [limiteF][limiteCo];
        generarMatriz(matriz);
        presentarMatriz(matriz);
        System.out.println("presentrar pares");
        presentarParesMatriz(matriz);
        System.out.println("presentar impares");
        presentarimparesMatriz(matriz);
        System.out.println("El promedio es "+presentarpromediMatriz(matriz));
    }
    public static void presentarParesMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if(matriz[i][j]% 2 == 0)
                    System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
     public static void presentarimparesMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if(matriz[i][j]% 2 != 0)
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
     public static double presentarpromediMatriz(int matriz[][]){
        int sumaMatriz =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz = sumaMatriz + matriz[i][j];
            }
    
        }
        return (sumaMatriz/(matriz.length * matriz[0].length) );
    }
     
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
            
        }
    }
     public static void presentarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
            
        }
    }
 /***
  * debug:
  * deme limite de filas y limite de columnas:  6 5
5 6 0 0 3 
8 3 0 6 9 
8 2 2 8 5 
6 6 1 6 7 
8 4 8 9 7 
2 3 4 3 6 
presentrar pares
6 0 0 
8 0 6 
8 2 2 8 
6 6 6 
8 4 8 
2 4 6 
presentar impares
5 3 
3 9 
5 
1 7 
9 7 
3 3 
El promedio es 4.0
  */
     
}