package fr.pantheonsorbonne.cri;

/**
 * The main class for the application.
 */
public final class BataillePariteApp {
    
    public static void main(String[] args) {
        
        PlateauBatailleParite grille = new PlateauBatailleParite();
        JoueurBatailleParite[] joueurs = {new JoueurBatailleParite(true), new JoueurBatailleParite(false)};

        boucleDeJeu :
        for(;;){
            for (int i = 1 ; i < 3; i++){
                grille.showPlateau();
                System.out.println("Joueur " + i + " : ");

                try{
                joueurs[i-1].play(grille);
                
                }
                catch (IllegalPositionException excep){
                    System.out.println("/// Place déjà prise ///");
                    i--;
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("/// Coordonnées incorrectes ///");
                    i--;
                    continue;
                }
                
                if (grille.verifWin(i)){
                    System.out.println("Victoire du joueur " +  (i)  + " !");
                    grille.showPlateau();
                    break boucleDeJeu;
                }
                else if (grille.verifFinDePartie()){
                    System.out.println("Égalité !");
                    grille.showPlateau();
                    break boucleDeJeu;
                }
            }
           JoueurBatailleParite.progressionTableau++;
        }
    }
}