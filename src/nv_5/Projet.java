package nv_5;

import java.util.Date;
import java.util.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projet {
    private String nom;
    private List<Tache> listeTaches;
    private Date dateEcheance;

    public Projet(String nom, Date dateEcheance) {
        this.nom = nom;
        this.listeTaches = new ArrayList<>();
        this.dateEcheance = dateEcheance;
    }

    public void ajouterTache(Tache tache) {
        listeTaches.add(tache);
    }

    public String getNom() {
        return nom;
    }

    public List<Tache> getListeTaches() {
        return listeTaches;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }
}

