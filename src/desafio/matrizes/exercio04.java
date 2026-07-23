package desafio.matrizes;

import java.util.Scanner;

public class exercio04 {
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



        sc.close();
    }
}
