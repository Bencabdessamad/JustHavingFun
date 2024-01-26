package nv_5;

public class Tache extends Thread {
    private String nom;
    private int dureeEstimee; // en secondes
    private EtatTache etat;

    public Tache(String nom, int dureeEstimee) {
        this.nom = nom;
        this.dureeEstimee = dureeEstimee;
        this.etat = EtatTache.EN_ATTENTE; // La tâche commence en état d'attente
    }

    public String getNom() {
        return nom;
    }

    public int getDureeEstimee() {
        return dureeEstimee;
    }

    public EtatTache getEtat() {
        return etat;
    }

    // Méthode pour simuler l'exécution de la tâche
    @Override
    public void run() {
        try {
            etat = EtatTache.EN_COURS;
            System.out.println("La tâche '" + nom + "' commence.");
            Thread.sleep(dureeEstimee * 1000); // Convertir la durée estimée en millisecondes
            etat = EtatTache.TERMINEE;
            System.out.println("La tâche '" + nom + "' est terminée.");
        } catch (InterruptedException e) {
            etat = EtatTache.ABANDONNEE;
            System.out.println("La tâche '" + nom + "' a été abandonnée.");
        }
    }
}

