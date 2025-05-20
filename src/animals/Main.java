package animals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Scegli un animale tra Cane, Delfino, Aquila o Passerotto");
        String animaleScelto = input.nextLine().toLowerCase();

        if (animaleScelto.equals("cane") || animaleScelto.equals("delfino") ||
            animaleScelto.equals("aquila") || animaleScelto.equals("passerotto")) {

            System.out.println("Come si chiama il tuo " + animaleScelto + "?");
            String nome = input.nextLine();

            System.out.println("A che sottospecie appartiene?");
            String specie = input.nextLine();
            //Variabile d'appoggio, sempre variabile d'appoggio
            Animale mioAnimale = null;

            switch (animaleScelto) {
                case "cane":
                    mioAnimale = new Cane(nome, specie);
                    break;
                case "delfino":
                    mioAnimale = new Delfino(nome, specie);
                    break;
                case "aquila":
                    mioAnimale = new Aquila(nome, specie);
                    break;
                case "passerotto":
                    mioAnimale = new Passerotto(nome, specie);
                    break;
            }

            // Stampa solo se l'oggetto è stato creato
            if (mioAnimale != null) {
                System.out.println("Il tuo animale è un " + animaleScelto +
                    ". Si chiama " + nome + ", di specie " + specie +
                    ". Si nutre di " + mioAnimale.mangia() +
                    ", il verso che fa è: " + mioAnimale.verso() +
                    " e quando dorme fa: " + mioAnimale.dormi());
            }

        } else {
            System.out.println("Animale non riconosciuto.");
        }

        input.close();
    }
}

