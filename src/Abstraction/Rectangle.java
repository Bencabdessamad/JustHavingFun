package Abstraction;

public class Rectangle extends Forme{

    double longueur;
    double largeur;

    public Rectangle(String couleur, double longueur, double largeur) {
        super(couleur);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double surface(){
        return longueur*largeur;
    }
    @Override
    public String toString() {
        return "La couleur de la rectangle est " + super.couleur +
                " et la surface est : " + surface();
    }
}
