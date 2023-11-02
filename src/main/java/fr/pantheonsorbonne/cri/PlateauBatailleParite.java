package fr.pantheonsorbonne.cri;

public class PlateauBatailleParite extends PlateauGeneraliste {

    public PlateauBatailleParite(){
        super();
    }
    

    private boolean verifLigne(int[] ligne, int parite){
        for (int i = 0; i < ligne.length ; i++){
            if (ligne[i] == 0) return false;

            if (parite == 1){
                if (ligne[i] % 2 == 0) return false;
                if (i == 2){return true;}
            }
            if (parite == 2){
                    if (ligne[i] % 2 == 1) return false;
                    if (i == 2){return true;}
            }
        }
        return false;
    }

    //parite = 1 si joueur utilise les impairs ; = 2 si utlise les pairs
    
    private boolean verifLignes(int[][] plateau, int parite){
        for (int[] ligne : plateau){
            if (verifLigne(ligne, parite)){return true;}
        }
        return false;
    }

    
    private boolean verifColonnes(int[][] plateau, int parite){
        return verifLignes(rotationTable(plateau), parite);
    }

    
    private boolean verifDiagonales(int[][] plateau, int parite){
        int[] diagonaleDG = getDiagoDG(plateau);
        int[] diagonaleGD = getDiagoGD(plateau);

        if (verifLigne(diagonaleDG, parite)){return true;}
        
        if (verifLigne(diagonaleGD, parite)){return true;}

        return false;
    }

    public boolean verifWin(int parite){
        return (verifColonnes(this.plateau, parite) || verifDiagonales(this.plateau, parite) || verifLignes(this.plateau, parite));
    }

    public boolean verifFinDePartie(){
        for (int[] i : plateau){
            for(int j : i) {
                if (j==0) return false;
            }
        }
        return true;
    }
}


