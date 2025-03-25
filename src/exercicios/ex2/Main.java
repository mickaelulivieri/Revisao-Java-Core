package exercicios.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String titular;
        Double saldo;
        Double numeroConta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira suas credenciais: ");

        System.out.println("Titular da conta: ");
        titular = sc.nextLine();

        System.out.println("Saldo Bancário: ");
        saldo = sc.nextDouble();

        System.out.println("Numero da conta: ");
        numeroConta= sc.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(titular, saldo, numeroConta);

        System.out.println("Agora vamos sacar");

        Double saque = sc.nextDouble();

        contaBancaria.sacarDinheiro(saque);

        System.out.println("Quanto deseja depositar: ");

        Double deposito = sc.nextDouble();

        contaBancaria.depositar(deposito);

        contaBancaria.mostrarSaldo();
    }
}
