package desafio.matrizes;

import java.util.Scanner;

public class exercio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                soma += matriz[i][j];
            }
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma de todos os elementos: " + soma);

        sc.close();
    }
}
