package Abstraction;

public class Test {

    public static void main(String[] args){

        Forme f1 = new Cercle("red",1.5);
        Forme f2 = new Rectangle("blue",3,6);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
