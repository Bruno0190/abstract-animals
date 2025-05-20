package animals;

import java.lang.reflect.Constructor;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;


public class Testing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        Dictionary<String, String> animali = new Hashtable<>();
    
        animali.put("Passerotto", "volante");
        animali.put("Delfino", "nuotante");
        animali.put("Cane", "nuotante");
        animali.put("Aquila", "volante");

        System.out.println("Scegli un animale tra Cane, Delfino, Aquila o Passerotto");
        String animaleScelto = input.nextLine().toLowerCase();

        if (animaleScelto.equals("cane") || animaleScelto.equals("delfino") ||
        animaleScelto.equals("aquila") || animaleScelto.equals("passerotto")) {

            String soggetto = animaleScelto.substring(0, 1).toUpperCase() + animaleScelto.substring(1).toLowerCase();

            String tipo = animali.get(soggetto);

            System.out.println("Come si chiama il tuo " + animaleScelto + "?");
            String nome = input.nextLine();

            System.out.println("A che sottospecie appartiene?");
            String specie = input.nextLine();

            Animale mioAnimale = null;

            switch (soggetto) {
                case "Passerotto":
                    mioAnimale = new Passerotto(nome, specie);
                    break;
                case "Delfino":
                    mioAnimale = new Delfino(nome, specie);
                    break;
                case "Cane":
                    mioAnimale = new Cane(nome, specie);
                    break;
                case "Aquila":
                    mioAnimale = new Aquila(nome, specie);
                    break;
            }
        
            if (tipo.equals("volante")) {
                mioAnimale.vola();
            } else if (tipo.equals("nuotante")) {
                mioAnimale.nuota();
            }


        input.close();
        }


    }

}




