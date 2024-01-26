package nv_4;

public class MainClass {
    public static void main(String[] args) {

        GestionEmployes gestionEmployes = new GestionEmployes();
         Manager m1 = new Manager(1,"abdessmad",10000,1000);
         Developpeur d1 = new Developpeur(2,"oussama",15000,8);

         m1.calculerSalaire();
         gestionEmployes.addEmp(m1);
         gestionEmployes.addEmp(d1);



         gestionEmployes.afficherEmp();
    }
}
