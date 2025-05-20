package animals;

public abstract class Animale 
 {
    protected String nome;
    protected String specie;

    public Animale(String nome, String specie){

        this.nome = nome;
        this.specie = specie;

    }

    public String dormi(){

        return "Zzz";

    }

    public abstract String verso();

    public abstract String mangia();



}

