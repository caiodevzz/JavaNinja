package desafio.matrizes;

import java.util.Scanner;

public class exercio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                 soma += matriz[i][j];
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
