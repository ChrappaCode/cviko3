package sk.stuba.fei.uim.oop.auto;

import java.util.Random;

public class Auto {

    public static final double PAVILO_NA_KM = 0.2;
    public static final double KAPACITA_NADRZE = 100;
    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean ojazdene;
    private final Random random; // generuje random cisla

    public Auto(){
        this(KAPACITA_NADRZE);
    }

    public Auto(double kapacitaNadrze){
        this.ojazdene = true;
        this.kapacitaNadrze = kapacitaNadrze;
        this.stavNadrze = 50;
        this.random = new Random();
    }



    public void jazdi(double vzdialenost){

        this.stavNadrze -= vzdialenost * PAVILO_NA_KM;
        if(stavNadrze < 0){
            this.stavNadrze = 0;
        }

    }

    public String stav() {
        String vysledok;
        if (this.ojazdene) {
            vysledok = "Auto je ojazdene";
        } else {
            vysledok = "Auto je neojazdene";
        }
        vysledok += " * stav nadrze: " + stavNadrze + "/" + kapacitaNadrze + " " + random.nextInt(51);
        return vysledok;
    }


    public void setKapacitaNadrze(double kapacitaNadrze) {
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public boolean isOjazdene() {
        return ojazdene;
    }

    public void setOjazdene(boolean ojazdene) {
        this.ojazdene = ojazdene;
    }


}
