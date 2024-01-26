package nv_4;


import java.util.ArrayList;
import java.util.List;

public class GestionEmployes {
    private List<Employe> employes;

    public GestionEmployes() {
        this.employes = new ArrayList<>();
    }

    public void addEmp(Employe emp){
        employes.add(emp);
    }
    public void afficherEmp(){
        System.out.println("Liste des employés :");
        for (Employe employe:employes){
            employe.afficherDetails();
        }
    }
}
