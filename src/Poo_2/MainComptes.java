package Poo_2;

public class MainComptes {
    public static void main(String[] args) {
        CompteBancaire monCompte = new CompteBancaire("Ben", 0);
        monCompte.depot(500.0);
        monCompte.retrait(200.0);
        monCompte.afficherSolde();
    }
}
