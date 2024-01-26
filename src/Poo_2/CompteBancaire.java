package Poo_2;

public class CompteBancaire {

    String titulaire;
    double solde;

    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void depot(double montant){
         solde = solde + montant;
    }

    public void retrait(double montant){
        if (solde>=montant){
            solde= solde-montant;
        }else {
            System.out.println("Fonds insuffisants pour effectuer le retrait.");
        }
    }
    public void afficherSolde(){
        System.out.println("Solde actuel : " + solde);

    }

}
