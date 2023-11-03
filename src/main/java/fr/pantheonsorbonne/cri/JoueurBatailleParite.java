package fr.pantheonsorbonne.cri;

import java.util.Scanner;

public class JoueurBatailleParite {
    protected int[] valeurs;
    
    static int progressionTableau = 0;

    static Scanner sc = new Scanner(System.in);


    public JoueurBatailleParite(boolean isFirstPlayer){
        if (isFirstPlayer){
            this.valeurs = new int[] {1, 3, 5, 7, 9};
        }
        else{
            this.valeurs = new int[] {2, 4, 6, 8};
        }
    }

    public void play(PlateauBatailleParite plateau) throws IllegalPositionException, ArrayIndexOutOfBoundsException{
        System.out.println("Entrez coordonnée 1");
        int x = sc.nextInt();
        System.out.println("Entrez coordonnée 2");
        int y = sc.nextInt();

        plateau.alterPlateau(x, y, valeurs[progressionTableau]);
    }
}
