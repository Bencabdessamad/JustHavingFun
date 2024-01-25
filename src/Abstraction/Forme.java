package Abstraction;

public abstract class Forme {

    String couleur;
    abstract double surface();
    public abstract String toString();

    public Forme(String couleur){
        System.out.println("la constructeure de la classe est declarer");
        this.couleur=couleur;
    }

    public String getCouleur() {
        return couleur;
    }
}
