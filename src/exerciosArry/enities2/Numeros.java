package exerciosArry.enities2;

public class Numeros {
    public int[] valores_entre(int[] v, int valorMinimo, int valorMaximo) {
        int contador = 0;

        for (int i = 0; i < v.length ; i++) {
            if (v[i] >= valorMinimo && v[i] <= valorMaximo) {
                contador++;
            }
        }

        int[] resultado = new int[contador];

        int j = 0;
        for (int i= 0; i < resultado.length ; j++) {
            if (v[i] >= valorMinimo && v[i] <= valorMaximo) {
                resultado[i] = v[i];
                j++;
            }
        }
        return resultado;
    }
}
