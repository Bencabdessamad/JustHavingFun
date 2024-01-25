package exercice_nv_1;

import java.util.Scanner;

public class CalculateurMoyenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Combien de notes souhaitez-vous entrer ? ");
        int nbrNotes = sc.nextInt();
        double SNots = 0;

        for(int i = 0 ; i< nbrNotes;i++){
            System.out.print("Entrez la note #" + i + ": ");
            double note = sc.nextDouble();
            SNots += note;
        }
        double moyenne = SNots/nbrNotes;
        System.out.println("La moyenne des notes est : " + moyenne);
        sc.close();
    }
}
