
/**
 *
 * @Juan Quizhpe
 */
public class Ejercisio5 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {7, 8, 9, 6}
        };

        System.out.println("Suma de matriz: " + suma(matriz));
        System.out.println("Resta de matriz: " + resta(matriz));
        System.out.println("Multiplicación de matriz: " + multiplicacion(matriz));
    }

   
    public static int suma(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado += matriz[i][j]; 
            }
        }
        return resultado;
    }
    
    
    public static int resta(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (resultado == 0) {
                    resultado = matriz[i][j]; 
                } else {
                    resultado -= matriz[i][j]; 
                }
            }
        }
        return resultado;
    }

    public static int multiplicacion(int[][] matriz) {
        int resultado = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado *= matriz[i][j]; 
            }
        }
        return resultado;
    }
}
/**
 * debug:
 * 
 */