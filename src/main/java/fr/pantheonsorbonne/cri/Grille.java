package fr.pantheonsorbonne.cri;

public abstract class Grille {

    protected int[][] grille;

    // Affiche la grille
    public void showGrille(){
        System.out.println(java.util.Arrays.deepToString(grille));
    }

    // Modifie la case en (i,j) par [valeur]
    public void alterGrille(int i, int j, int valeur){
        grille[i][j] = valeur;
    } 


    // Méthodes de vérification (La dernière peut être Override)
    protected abstract boolean verifLignes(int[][] plateau);
    protected boolean verifColonnes(int[][] plateau){
        if (verifLignes(rotationTable(plateau))){
            return true;
        }
        return false;
    }
    protected abstract boolean verifDiagonales(int[][] plateau);



    protected boolean verifWin(){
        if(verifLignes(grille) && verifColonnes(grille) && verifDiagonales(grille)){
            return true;
        }
        return false;
    }
    

    // Outils pour implémenter les méthodes précédentes
    
    //Outil pour verifier les colonnes (ne devrait pas être réutilisable)
    private int[][] rotationTable(int[][] plateau){
        
        int[][] grilleReversed = new int[3][3];
        for (int i = 0; i < grille.length; i++){
            for (int j = 0; j < grille.length ; j++){
                grilleReversed[i][j] = grille[j][i];
            }
        }
        return grilleReversed;
    }

    // Récupérer la diagonale [(0,0), (1, 1), (2, 2)]
    protected int[] getDiagoGD(int[][] grille){
        int[] diagoGD = new int[3];
        for(int i = 0 ; i < diagoGD.length; i++){
            diagoGD[i] = grille[i][i];
        }
        return diagoGD;
    }

    //Récupérer la diagonale [(0, 2), (1, 1), (2, 0)]
    protected int[] getDiagoDG(int[][] plateau){
        return new int[] {plateau[0][2], plateau[1][1], plateau[2][0]};

    }
}
