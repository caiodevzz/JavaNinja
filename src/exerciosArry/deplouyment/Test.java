package exerciosArry.deplouyment;

import exerciosArry.entities.Funcoes;

public class Test {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();

        int[] numeros ={4,5,5,6,5,6,5,2,4};
        int[] numeros2 = {6,5,3,4,3,5,4,5,3,2,5,4,7,8,5};
        System.out.println("O maior numero do meu arry e: " + funcoes.maiorValor(numeros));;
        System.out.println("Total de numeros pares: " + funcoes.totalPares(numeros));
        System.out.println("Total de numeros iguais: " + funcoes.totalIguais(numeros, numeros2));
    }
}
