package animals;

public class Passerotto extends Animale{

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

}
