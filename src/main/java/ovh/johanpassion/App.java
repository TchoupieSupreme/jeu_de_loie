package ovh.johanpassion;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int caseActuelle = 0;
        Scanner clavier = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int nb = nombreAleatoire();
            caseActuelle += nb;
            clavier.nextLine();
            caseActuelle(caseActuelle,nb,i);
        }
        if (20 - caseActuelle == 0) {
            win();
        } else {
            lose();
        }
        clavier.close();
    }

    public static int nombreAleatoire() {
        //Génére un nombre aléatoire dans nb et le retourne
        Random generateur = new Random();
        int nb = generateur.nextInt(6) + 1;
        return nb;
    }

    public static void win(){
        System.out.println("Vous avez gagné !");
    }

    public static void lose(){
        System.out.println("Vous avez perdu !");
    }

    public static void caseActuelle(int caseActuelle,int nb, int i){
        //Print la phrase qui permet de savoir combien de lancer le joueur à fait, sur quelle case il est et combien lui reste t'il de case pour gagner
            System.out.println("Lancer " + (i + 1) + " : vous avez faits " + nb + ". Vous êtes sur la case "
                    + caseActuelle + " (encore " + (20 - caseActuelle) + ")");
    }

}
