package ovh.johanpassion;

import java.util.Random;

public class App {
    
    public static void main(String[] args) {
        Random generateur = new Random();
        int caseActuelle = 0;
        for (int i =0;i<5;i++){
            int lancer = generateur.nextInt(6)+1;
            caseActuelle += lancer;
            System.out.println("Lancer "+(i+1)+" : vous avez faits "+lancer+". Vous êtes sur la case "+caseActuelle+" (encore "+(20-caseActuelle)+")");
        }
        if (20-caseActuelle == 0) {
            System.out.println("Vous avez gagné !");
        }else{
            System.out.println("Vous avez perdu !");
        }
    }
    
}
