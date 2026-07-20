package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados Não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir métodos a ele.
         */

        String name = "Naruto Uzumaki";
        String name2 = name.toUpperCase(); // vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + name2);

        String aldeia = "Aldeia da Folha";

        System.out.println("Texto em caixa baixa: " + aldeia.toLowerCase()); // Vai colocar em caixa baixa
    }
}
