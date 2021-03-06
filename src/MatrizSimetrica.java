import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        int[][] matriz = receberMatriz(2);
        boolean check = validarMatriz(matriz);
        resultado(check);
        imprimirMatrizETransposta(matriz);
    }

    private static void imprimirMatrizETransposta(int[][] matriz) {
        System.out.print("\t");
        for (int i = 0; i < matriz.length; i++) {

            System.out.print(i+"\t");

        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i+"\t");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+"\t");
            }
            System.out.println();
        }

    }

    private static void resultado(boolean check) {
        if(check){
            System.out.println("A matriz é simétrica!!");
        }else{
            System.out.println("A matriz não é simétrica!!");
        }


    }

    private static boolean validarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (!(matriz[i][j] == matriz[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }


    private static int[][] receberMatriz(int n) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Insira o valor da linha "+(i+1)+" coluna "+(j+1)+".");
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

}
