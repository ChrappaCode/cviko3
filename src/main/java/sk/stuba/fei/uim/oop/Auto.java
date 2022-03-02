package sk.stuba.fei.uim.oop;

public class Auto {

    private double kapacitaNadrze;
    private double stavNadrze;

    public void jazdi(double vzdialenost){

        this.stavNadrze -= vzdialenost * 0.2;
        if(stavNadrze < 0){
            this.stavNadrze = 0;
        }

    }

    public void setStavNadrze(double stavNadrze){
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
