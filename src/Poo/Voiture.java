package Poo;

public class Voiture {
    int vitesse = 0;
    String model;

    public Voiture(int vitesse, String model) {
        this.vitesse = vitesse;
        this.model = model;
    }

    public void accelerer(){
        vitesse=vitesse+10;
    }
    public void freiner(){
        vitesse = vitesse-10;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "vitesse=" + vitesse +
                ", model='" + model + '\'' +
                '}';
    }
}
