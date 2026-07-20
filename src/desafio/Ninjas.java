package desafio;

import java.util.Scanner;

public class Ninjas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome de um pro primeiro Ninja: ");
        String name1 = sc.nextLine();
        System.out.print("Digite a idade do primeido Ninja agora: ");
        int idade1 = sc.nextInt();
        String misao1 = "Despertar de Chouji";
        String status1 = "em andamento";
        char nivel1 = 'C';

        if (idade1 < 15) {
            if (nivel1 == 'C' || nivel1 == 'D') {
                status1 = "Concluida";
            } else {
                status1 = "Nao concluida";
            }
        }else {
            status1 = "Concluida";
        }

        sc.nextLine();


        System.out.print("Digite um nome de um pro segundo Ninja: ");
        String name2 = sc.nextLine();
        System.out.print("Digite a idade do segundo Ninja agora: ");
        int idade2 = sc.nextInt();
        String missao2 = "Treinamento Médico";
        String status2 = "Concluida";
        char nivel2 = 'D';

        if (idade2 < 15) {
            if (nivel2 == 'C' || nivel2 == 'D') {
                status2 = "Concluida";
            } else {
                status2 = "Nao concluida";
            }
        }else {
            status2 = "Concluida";
        }

        sc.nextLine();

        System.out.print("Digite um nome de um pro terceiro Ninja: ");
        String name3 = sc.nextLine();
        System.out.print("Digite a idade do terceiro Ninja agora: ");
        int idade3 = sc.nextInt();
        String misao3 = "O Sobrevivente do Selo";
        String status3 = "nao concluida";
        char nivel3 = 'D';

        if (idade3 < 15) {
            if (nivel3 == 'C' || nivel3 == 'D') {
                status3 = "Concluida";
            } else {
                status3 = "Nao concluida";
            }
        }else {
            status3 = "Concluida";
        }

        sc.nextLine();

        System.out.println("Ninja 1:");
        System.out.println("Name: " + name1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missao: " + misao1);
        System.out.println("Status: " + status1);
        System.out.println("Nivel: " + nivel1);

        System.out.println("-------------------------------");

        System.out.println("Ninja 2:");
        System.out.println("Name: " + name2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status: " + status2);
        System.out.println("Nivel: " + nivel2);

        System.out.println("-------------------------------");

        System.out.println("Ninja 3:");
        System.out.println("Name: " + name3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao: " + misao3);
        System.out.println("Status: " + status3);
        System.out.println("Nivel: " + nivel3);



        sc.close();
    }
}
