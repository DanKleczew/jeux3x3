package fr.pantheonsorbonne.cri;
import java.util.Scanner;

public class PlateauEchelleTrois implements PlateauVerif{
    public static Scanner sc = new Scanner(System.in);
    int [][]tableau;

    public PlateauEchelleTrois(){
        this.tableau = new int[3][3];
    }
    @Override
    public boolean verifLigne(int table [][]){
        
        for (int i = 0; i<3;i++){
            for (int j = 1; j<2;j++){
                int num1 = table[i][j-1];
                int num2 = table[i][j];
                int num3 = table[i][j+1];
                if(num1+1 == num2 & num1+2 == num3){
                    return true;
                }
                else if(num1-1 == num2 & num1-2 == num3){
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public boolean verifColonne(int table[][]){
        for (int i = 0; i<3;i++){
            for (int j = 1; j<2;j++){
                int num1 = table[i][j-1];
                int num2 = table[i][j];
                int num3 = table[i][j+1];
                if(num1+1 == num2 & num1+2 == num3){
                    return true;
                }
                else if(num1-1 == num2 & num1-2 == num3){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String ... args){

    }

    @Override
    public boolean verifDiagGaucheDroite(int[][] table) {
        for (int i = 1; i<2;i++){
            for (int j = 1; j<2;j++){
                int num1 = table[i-1][j-1];
                int num2 = table[i][j];
                int num3 = table[i+1][j+1];
                if(num1+1 == num2 & num1+2 == num3){
                    return true;
                }
                else if(num1-1 == num2 & num1-2 == num3){
                    return true;
                }
            }
        }
        return false;
        // TODO Auto-generated method stub
    }

    @Override
    public boolean verifDiagDroiteGauche(int[][] table) {
        for (int i = 1; i<2;i++){
            for (int j = 1; j<2;j++){
                int num1 = table[i+1][j+1];
                int num2 = table[i][j];
                int num3 = table[i-1][j-1];
                if(num1+1 == num2 & num1+2 == num3){
                    return true;
                }
                else if(num1-1 == num2 & num1-2 == num3){
                    return true;
                }
            }
        }
        return false;
        // TODO Auto-generated method stub
    }

    @Override
    public boolean verifWin(int[][] table) {
        return (verifColonne(table)||verifDiagDroiteGauche(table)||verifDiagGaucheDroite(table)||verifLigne(table));
    }
}
