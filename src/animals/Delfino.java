package animals;

public class Delfino extends Animale{

    public Delfino(String nome, String specie){
        super(nome, specie);

        this.nome = nome;
        this.specie = specie;

    }

    public String verso(){
        return "fischiare";
    }

    public String mangia(){
        return "piccoli pesci";
    }
}
