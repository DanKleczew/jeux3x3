package fr.pantheonsorbonne.cri;

public abstract class PlateauGeneraliste {

    protected int[][] plateau;

    public PlateauGeneraliste(){
        plateau = new int[3][3];
    }

    // Affiche la grille
    public void showPlateau(){
        for (int[] i : this.plateau){
        System.out.println(java.util.Arrays.toString(i));
        }
    }

    // Modifie la case en (i,j) par [valeur]
    public void alterPlateau(int i, int j, int valeur) throws IllegalPositionException, ArrayIndexOutOfBoundsException{
        if(this.plateau[i][j] == 0)
        this.plateau[i][j] = valeur;
        else
        throw new IllegalPositionException(); 
    }


    //Lignes deviennent colonnes et inversement (pour vérifier les colonnes)
    protected int[][] rotationTable(int[][] plateau){
        
        int[][] grilleReversed = new int[3][3];
        for (int i = 0; i < plateau.length; i++){
            for (int j = 0; j < plateau.length ; j++){
                grilleReversed[i][j] = plateau[j][i];
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
