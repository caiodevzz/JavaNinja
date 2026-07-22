package exerciosArry;

import exerciosArry.enities2.Numeros;

import java.util.Arrays;
import java.util.Scanner;

public class exercio02 {
    public static void main(String[] args) {
        Numeros numeros1 = new Numeros();
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite os numeros para adiconar no vetor");

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Digite agora o valor Maximo e o Minimo");
        System.out.print("Maximo: ");
        int max = sc.nextInt();
        System.out.print("Minimo: ");
        int minimo = sc.nextInt();

        System.out.println("Valores entre: " + Arrays.toString(numeros1.valores_entre(numeros, minimo, max)));;
    }
}
