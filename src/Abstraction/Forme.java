package Abstraction;

public abstract class Forme {

    String couleur;
    abstract double surface();
    public abstract String toString();

    public Forme(String couleur){
        this.couleur=couleur;
    }

    public String getCouleur() {
        return couleur;
    }
}
