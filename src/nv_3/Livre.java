package nv_3;

public class Livre {
    private String titre;
    private String auteur;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
