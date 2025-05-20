package animals;

public class Aquila extends Animale implements IVolante{

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

    public void vola(){

        System.out.println("Sto volando");

    }

}
