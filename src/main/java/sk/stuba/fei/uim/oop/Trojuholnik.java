package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Trojuholnik {
    public static void main(String[] args) {


        int vyska = ZKlavesnice.readInt("Zadaj pocet riadkov ");
        a:
        for(int riadok = 1; riadok <= vyska;riadok++) {
            for (int stlpec = 1; stlpec <= riadok; stlpec++) {
                if(riadok > 15){
                    break a;
                }
                System.out.print("*");
                if(stlpec >= 10){
                    break;
                }
            }
            System.out.println();
        }

    }
}
