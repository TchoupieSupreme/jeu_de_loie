package ovh.johanpassion;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int caseActuelle = 0;
        Scanner clavier = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int nb = nombreAleatoire();
            clavier.nextLine();
            caseActuelle += nb;
            System.out.println("Lancer " + (i + 1) + " : vous avez faits " + nb + ". Vous êtes sur la case "
                    + caseActuelle + " (encore " + (20 - caseActuelle) + ")");
        }
        if (20 - caseActuelle == 0) {
            win();
        } else {
            lose();
        }
        clavier.close();
    }

    public static int nombreAleatoire() {
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

}
