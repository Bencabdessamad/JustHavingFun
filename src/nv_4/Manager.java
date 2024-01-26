package nv_4;

public class Manager extends Employe{
    private double prime;

    public Manager(int id, String nom, double salaire, double prime) {
        super(id, nom, salaire);
        this.prime = prime;
    }

    @Override
    public void calculerSalaire(){
        setSalaire(getSalaire()+prime);
    }

     @Override
    public void afficherDetails(){
        super.afficherDetails();
         System.out.println("Prime: " + prime);
     }


}
