package animals;

public class Delfino extends Animale implements INuotante{

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

    public void nuota(){
        System.out.println("Sto nuotando");
    }
}
