package animals;

public class Aquila extends Animale {

    public Aquila(String nome, String specie){        
        super(nome, specie);

        this.nome = nome;
        this.specie = specie;

    }

    public String verso(){

        return "stridere";

    }
    
    public String mangia(){

        return "piccoli erbivori e lucertole";

    }

}
