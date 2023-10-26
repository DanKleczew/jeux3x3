package fr.pantheonsorbonne.cri;
import java.util.Scanner;

public interface class Plateau {
    public static Scanner sc = new Scanner(System.in);
    int [][]tableau;

    public Plateau(){
        this.tableau = new int[3][3];
    }

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
        return true;
    }

    public static void main(String ... args){

    }
}
