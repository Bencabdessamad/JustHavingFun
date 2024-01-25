package nv_2;

import java.util.Scanner;

public class PalindromeVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = sc.nextLine();

        boolean estPalindrome = verifierPalindrome(mot);

        if (estPalindrome){
            System.out.println("'" + mot + "' est un palindrome.");
        }else {
            System.out.println("'" + mot + "' n'est pas  un palindrome.");

        }

    }

    public static boolean verifierPalindrome(String mot){
        mot = mot.replaceAll("\\s","").toLowerCase();
        for (int i = 0 ; i<mot.length()/2;i++){
            if (mot.charAt(i) != mot.charAt(mot.length()-1-i)){
                return false;
            }
        }
        return true;
    }


}
