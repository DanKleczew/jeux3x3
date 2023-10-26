package fr.pantheonsorbonne.cri;

public interface PlateauVerif {

    public boolean verifLigne(int table [][]);
    public boolean verifColonne(int table[][]);
    public boolean verifDiagGaucheDroite(int table [][]);
    public boolean verifDiagDroiteGauche(int table [][]);
    public boolean verifWin(int table [][]);


}
