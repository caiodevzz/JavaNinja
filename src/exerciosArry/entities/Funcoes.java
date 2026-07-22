package exerciosArry.entities;

public class Funcoes {

    public int totalPares(int[] pares) {
        int contador = 0;
        for (int i = 0; i < pares.length; i ++) {
          if (pares[i] % 2 == 0) {
              contador++;
          }
        }
        return contador;
    }

    public int maiorValor(int[] valor) {
        int valor1 = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > valor1) {
                valor1 = valor[i];
            }
        }
        return valor1;
    }

    public int totalIguais (int[] total1, int[] total2) {

        int soma = 0;
        for (int i = 0; i < total1.length ; i++) {
            for (int j = 0; j < total2.length ; j++) {
                if (total1[i] == total2[i]) {
                    soma++;
                }
            }
        }
        return soma;
    }
}
