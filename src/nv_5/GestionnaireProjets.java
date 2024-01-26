package nv_5;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireProjets {
    private List<Projet> listeProjets;

    public GestionnaireProjets() {
        this.listeProjets = new ArrayList<>();
    }

    public void ajouterProjet(Projet projet) {
        listeProjets.add(projet);
    }

    public List<Projet> getListeProjets() {
        return listeProjets;
    }

    public void afficherListeProjets() {
        System.out.println("Liste des projets :");
        for (Projet projet : listeProjets) {
            System.out.println("Projet : " + projet.getNom() + ", Date d'échéance : " + projet.getDateEcheance());
            System.out.println("   Tâches :");
            for (Tache tache : projet.getListeTaches()) {
                System.out.println("   - Tâche : " + tache.getNom() + ", Durée estimée : " + tache.getDureeEstimee() + "s, État : " + tache.getEtat());
            }
        }
    }

    public boolean tousLesProjetsTermines() {
        for (Projet projet : listeProjets) {
            for (Tache tache : projet.getListeTaches()) {
                if (tache.getEtat() != EtatTache.TERMINEE) {
                    return false;
                }
            }
        }
        return true;
    }
}
