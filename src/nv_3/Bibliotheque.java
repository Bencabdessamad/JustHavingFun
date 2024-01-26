package nv_3;

import java.util.ArrayList;

public class Bibliotheque {

    public ArrayList<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        System.out.println("Livre ajouté à la bibliothèque : " + livre);
    }

    public void afficherLivres() {
        System.out.println("Liste des livres dans la bibliothèque :");
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }

    public void rechercherLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.toString().contains(titre)) {
                System.out.println("Livre trouvé : " + livre);
                return;
            }
        }
        System.out.println("Aucun livre trouvé avec le titre : " + titre);
    }

    public void supprimerLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.toString().contains(titre)) {
                livres.remove(livre);
                System.out.println("Livre supprimé : " + livre);
                return;
            }
        }
        System.out.println("Aucun livre trouvé avec le titre : " + titre);
    }
}
