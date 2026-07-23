package desafio;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("---Digite a linha e a coluna da matriz---");

        System.out.print("Linhas: ");
        int m = sc.nextInt();

        System.out.print("Colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite a " + (i + 1) + " linha " + "digite a " + (j + 1) + " coluna");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite outro numero: ");
        int x = sc.nextInt();

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if (mat[i][j] == x) {
                    if (j > 0) {
                        System.out.println( mat[i][j - 1]  + " Esquerda");
                    }
                    if (j < n - 1) {
                        System.out.println(mat[i][j + 1] + " Direita");
                    }
                    if (i > 0) {
                        System.out.println(mat[i - 1][j] + " Acima");
                    }
                    if (i < m - 1) {
                        System.out.println(mat[i + 1][j] + " Abaixo");
                    }
                }
            }
        }

        sc.close();
    }
}
