package animals;

public class Passerotto extends Animale implements IVolante{

    public Passerotto(String nome, String specie)
    {super(nome, specie);

        this.nome = nome;
        this.specie = specie;       

    }

    public String verso(){

        return "cinguettare";

    }
    
    public String mangia(){

        return "semi";

    }   

    public void vola(){
        System.out.println("Sto volando");
    }

}
