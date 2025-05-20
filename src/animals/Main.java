package animals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Scegli un animale tra Cane, Delfino, Aquila o Passerotto");
        String animale = input.nextLine();
        if (animale.toLowerCase().equals("cane") || animale.toLowerCase().equals("delfino") || animale.toLowerCase().equals("aquila") || animale.toLowerCase().equals("passerotto")) {

            System.out.println("Come si chiama il tuo " + animale + "?");
            String nome = input.nextLine();
            

        }


        input.close();
    }

}
