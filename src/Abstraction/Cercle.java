package Abstraction;

public class Cercle extends Forme {

    double rayon;

    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    @Override
    double surface(){
        return Math.PI * Math.pow(rayon,2);
    }

    @Override
    public String toString() {
        return "La couleur de la cercle est " + super.couleur +
                " et la surface est : " + surface();
    }
}
