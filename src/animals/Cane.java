package animals;

public class Cane extends Animale {

    public Cane(String nome, String specie){
        super(nome, specie);

        this.nome = nome;
        this.specie = specie;

    }

    public String verso(){

        return "abbaio";

    }
    
    public String mangia(){

        return "croccantini e umido";

    }


}
