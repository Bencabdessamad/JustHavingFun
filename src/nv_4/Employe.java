package nv_4;

public abstract class Employe implements Affichable {
    private int id;
    private String nom;
    private double salaire;

    public Employe(int id, String nom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    public abstract void calculerSalaire();

    public void afficherDetails(){
        System.out.println("Id :"+id +"Nom :"+nom+"salaire"+salaire);
    }
}
