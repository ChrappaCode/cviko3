package sk.stuba.fei.uim.oop.auto;

public class Auto {

    public static final double PAVILO_NA_KM = 0.2;
    private double kapacitaNadrze;
    private double stavNadrze;

    public void jazdi(double vzdialenost){

        this.stavNadrze -= vzdialenost * PAVILO_NA_KM;
        if(stavNadrze < 0){
            this.stavNadrze = 0;
        }

    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

    public double getStavNadrze(){
        return stavNadrze;
    }

   /*
    int pocetKolies;
    int pocetDveri;
    String nazov;


    public int jedna;
    int dva;
    protected int tri;
    private int styri;
   */



}
