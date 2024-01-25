package Poo;

public class MainVoiture {
    public static void main(String[] args) {

        Voiture v1 = new Voiture(0,"Audi");
        Voiture v2 = new Voiture(0,"Golf");

        v1.accelerer();
        v2.accelerer();

        v1.freiner();
        v2.freiner();

        System.out.println(v1);
        System.out.println(v2);
    }
}
