import java.util.HashSet;
import vsets.*;

public class VHashSet {
    public static void main(String[] args) {
        // Criando um HashSet de Strings
        HashSet<String> frutas = new HashSet<>();

        // Adicionando elementos ao HashSet
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã"); // Este não será adicionado, pois é duplicado

        // Exibindo o conteúdo do HashSet
        System.out.println(frutas);  // Saída: [Banana, Laranja, Maçã]

        // Verificando se um elemento está presente no HashSet
        if (frutas.contains("Banana")) {
            System.out.println("Banana está na lista!");
        } else {
            System.out.println("Banana não está na lista.");
        }

        // Removendo um elemento
        frutas.remove("Laranja");

        // Exibindo o HashSet após remoção
        System.out.println(frutas);  // Saída: [Banana, Maçã]
    }
}