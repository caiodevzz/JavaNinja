package desafio.matrizes;

import java.util.Scanner;

public class exercio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int multiplicador = sc.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int contador = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                if (matriz[i][j] > contador) {
                    contador++;
                }
            }
        }

        int conta = contador * multiplicador;

        System.out.println(conta);

        sc.close();
    }
}
