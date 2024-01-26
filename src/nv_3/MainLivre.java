package nv_3;

public class MainLivre {
    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();
        Livre l1 = new Livre("King","abdessamad");
        Livre l2 = new Livre("hii","oussama");

        bibliotheque.ajouterLivre(l1);
        bibliotheque.ajouterLivre(l2);

        bibliotheque.rechercherLivre("king");
        bibliotheque.supprimerLivre("king");

        bibliotheque.afficherLivres();

    }
}
