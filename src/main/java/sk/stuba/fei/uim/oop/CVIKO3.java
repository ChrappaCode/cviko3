package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

public class CVIKO3 {
    public static void main(String[] args) {

        Auto skoda = new Auto();
        System.out.println("skoda:");
        /*skoda.setStavNadrze(100);
        skoda.setKapacitaNadrze(100);*/

        System.out.println(skoda.stav());
        skoda.jazdi(100);
        System.out.println(skoda.stav());

        Auto fiat = new Auto(50);
        System.out.println("fiat:");
        System.out.println(fiat.stav());
        fiat.jazdi(20);
        System.out.println(fiat.stav());

        /*
       Auto bmw = new Auto();

        skoda.jedna = 1;
        bmw.jedna = 2;

        if(skoda.jedna == bmw.jedna){
            System.out.println("zazrak");
        }
        else
            System.out.println("ziadny zazrak");
        */





    }
}
