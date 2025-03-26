package exerciciosPOO.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vamos criar um retangulo e calcular a área! ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Altura do retangulo: ");
        Double altura = sc.nextDouble();

        System.out.println("largura do retangulo: ");
        Double largura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        retangulo.exibirInformacoes();
    }
}
