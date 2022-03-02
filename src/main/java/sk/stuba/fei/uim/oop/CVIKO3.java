package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

public class CVIKO3 {
    public static void main(String[] args) {

        Auto skoda = new Auto();

        skoda.setStavNadrze(50);
        skoda.jazdi(100);
        System.out.println("stav nadrze: "+skoda.getStavNadrze());
        skoda.jazdi(200);
        System.out.println("stav nadrze: "+skoda.getStavNadrze());

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
