package exerciciosPOO.ex6;
import java.util.Scanner;

/*
Crie uma classe Funcionario com atributos como nome e salarioBase.
 Em seguida, crie as classes Gerente e Desenvolvedor que herdam de Funcionario
 e sobrescrevem um metodo calcularSalario(), onde o Gerente recebe um bônus adicional.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Vamos definir um funcionario");
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do/a gerente?");
        String nome = sc.nextLine(); // Lê o nome do gerente

        System.out.println("Qual o salário base? ");
        Double baseGerente = sc.nextDouble(); // Lê o salário base do gerente

        sc.nextLine(); // Consome a quebra de linha restante após o nextDouble()

        Double salarioAtual = baseGerente;

        Gerente gerente = new Gerente(nome, salarioAtual, baseGerente);

        System.out.println("Agora ele receberá aumento");
        gerente.calcularSalario();
        gerente.exibirInformacoes();

        System.out.println("Agora um desenvolvedor!");
        System.out.println("Qual o nome?");
        String nomeDev = sc.nextLine(); // Lê o nome do desenvolvedor

        System.out.println("Qual o salario base? ");
        Double salarioBaseDev = sc.nextDouble(); // Lê o salário base do desenvolvedor

        sc.nextLine(); // Consome a quebra de linha restante após o nextDouble()

        Double salarioAtualDev = salarioBaseDev;

        Desenvolvedor desenvolvedor = new Desenvolvedor(nomeDev, salarioAtual, salarioBaseDev);
        desenvolvedor.exibirInformacoes();

        sc.close();
    }
}