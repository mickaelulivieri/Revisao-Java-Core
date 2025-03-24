package laços;

public class LimitadorClone {
    public static void main(String[] args) {

        /*
         * Laço repetiçao
         * */

        // While (condicao){tudo vai acontecer}

        int numeroClone = 0;
        int numeroMaximoClones = 40;

        while (numeroClone <= numeroMaximoClones) {
            System.out.println("O naruto fez um clone das sombras " + numeroClone);
            numeroClone++;
        }


        // For

        for (int i = 0; i <= numeroMaximoClones; i++) {
            System.out.println("O naruto está se clonando, clone numero " + i);
        }


    }
}