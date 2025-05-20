package animals;

public class Cane extends Animale implements INuotante{

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

    public void nuota(){
        System.out.println("Sto nuotando");
    }


}
