package nv_5;

import java.util.Date;

public class MainProjet {
    public static void main(String[] args) {
        GestionnaireProjets gestionnaireProjets = new GestionnaireProjets();

        Projet projet1 = new Projet("Projet A", new Date());
        projet1.ajouterTache(new Tache("Tâche 1", 5));
        projet1.ajouterTache(new Tache("Tâche 2", 7));

        Projet projet2 = new Projet("Projet B", new Date());
        projet2.ajouterTache(new Tache("Tâche 1", 4));
        projet2.ajouterTache(new Tache("Tâche 2", 6));

        gestionnaireProjets.ajouterProjet(projet1);
        gestionnaireProjets.ajouterProjet(projet2);

        gestionnaireProjets.afficherListeProjets();

        // Lancer les threads associés aux tâches pour simuler l'exécution des projets
        for (Projet projet : gestionnaireProjets.getListeProjets()) {
            for (Tache tache : projet.getListeTaches()) {
                tache.start();
            }
        }

        // Attendre que tous les threads soient terminés
        for (Projet projet : gestionnaireProjets.getListeProjets()) {
            for (Tache tache : projet.getListeTaches()) {
                try {
                    tache.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Afficher l'état final des projets
        gestionnaireProjets.afficherListeProjets();

        // Vérifier si tous les projets sont terminés
        if (gestionnaireProjets.tousLesProjetsTermines()) {
            System.out.println("Tous les projets sont terminés !");
        } else {
            System.out.println("Certains projets ne sont pas encore terminés.");
        }
    }
}
