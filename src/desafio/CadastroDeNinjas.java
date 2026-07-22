package desafio;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ninjas = null;

        System.out.println("----Bem vindo ao sistema de Ninjas----");
        System.out.println();

        System.out.println("Escolha Alguma opção :)");
        System.out.println();
        System.out.println(1 + " - Cadastrar Ninja");
        System.out.println(2 + " - Informaçoes do Ninjas");
        System.out.println(3 + " - Sair");
        System.out.println();

        System.out.print("Digite uma dessas opções ");
        int opcao = sc.nextInt();

        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Quantos ninjas voce vai digitar ? ");
            int numero = sc.nextInt();
            sc.nextLine();

            ninjas = new String[numero];

            for (int i = 0; i < numero; i++) {
                System.out.println("Digite o nome do " + (i + 1));
                ninjas[i] = sc.nextLine();
            }
                break;

            case 2:
                System.out.println("Informaçoes dos seus ninjas: ");
              if (ninjas == null || ninjas.length == 0) {
                  System.out.println("Nenhum Ninja encontrado");
              } else {

                for (String x : ninjas) {
                    System.out.println(x);
                }
              }
                break;

            case 3:
                System.out.println("Voce saiu do sistema :<");

            default:
                System.out.println("Erro");
        }

        sc.close();
    }
}
