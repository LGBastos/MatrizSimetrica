import java.util.Scanner;

public class MatrizSimetrica_2 {
    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        int[][] matriz = receberMatriz(2);
        imprimirMatrizETransposta(matriz);


    }

    private static void imprimirMatrizETransposta(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
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

    private static void validacao(boolean check) {
        if(!check){
            System.out.println("A matriz não é simétrica!!");
            System.exit(0);
        }



    }



    private static int[][] receberMatriz(int n) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Insira o valor da linha "+(i+1)+" coluna "+(j+1)+".");
                matriz[i][j] = sc.nextInt();
                if(i==1&&j==0){
                    validacao(matriz[i][j]==matriz[j][i]);

                }
            }
        }
        System.out.println("A matriz é simétrica!!");

        return matriz;
    }

}
