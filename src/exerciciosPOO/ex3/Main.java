package exercicios.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String marca;
        String modelo;
        Integer anoCarro;
        Double velocidadeAtual = 0.0;

        System.out.println("Vamos dar uma volta!");

        System.out.println("Qual a marca do carro?");
        marca = sc.nextLine();

        System.out.println("Qual o modelo do carro?");
        modelo = sc.nextLine();

        System.out.println("Ano do modelo?");
        anoCarro = sc.nextInt();

        Double velocidadeInicial = 0.0;

        Carro meuCarro = new Carro(marca, velocidadeInicial, anoCarro, modelo);

        int escolha;

        do {
            System.out.println("Escolha: ");
            System.out.println("0 - PARAR ");
            System.out.println("1 - ACELERAR");
            System.out.println("2 - FREAR");
            System.out.println("3 - MOSTRAR VELOCIDADE");

            escolha = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 0:
                    System.out.println("Acabou a volta");
                    break;
                case 1:
                    meuCarro.acelerar();
                    break;
                case 2:
                    meuCarro.frear();
                    break;
                case 3:
                    meuCarro.exibirVelocidade();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (escolha != 0);

        sc.close();
    }
}