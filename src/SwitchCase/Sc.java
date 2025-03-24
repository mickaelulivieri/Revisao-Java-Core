package SwitchCase;

import java.util.Scanner;

public class Sc {
    public static void main(String[] args) {

        /*
        * Switch case: pedir pro usuario escolher um "Ninja"
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! escolha um personagem!");


        System.out.println("1- Naruto");
        System.out.println("2- Sasuke");
        System.out.println("3- Sakura");

        int escolhaUsuario = sc.nextInt();

        System.out.println("Sua escolha foi: " + escolhaUsuario);

        switch (escolhaUsuario){
            case 1:
                System.out.println("Naruto da Aldeia da Folha foi o escolhido");
                break;
            case 2:
                System.out.println("Sasuke foi o escolhido!");
                break;
            case 3:
                System.out.println("A Sakura foi a escolhida!");
                break;

        }

        sc.close();

    }
}
