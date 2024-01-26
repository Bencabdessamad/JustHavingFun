package nv_4;

public class Developpeur extends Employe{

    private int hr;

    public Developpeur(int id, String nom, double salaire, int hr) {
        super(id, nom, salaire);
        this.hr = hr;
    }

    @Override
    public void calculerSalaire(){
        setSalaire(getSalaire()+hr*10);
    }
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Heures travaillées: " + hr);
    }

}
