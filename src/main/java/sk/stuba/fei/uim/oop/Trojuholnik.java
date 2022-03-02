package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Trojuholnik {
    public static void main(String[] args) {


        int vyska = ZKlavesnice.readInt("Zadaj pocet riadkov ");

        for(int riadok = 1; riadok <= vyska;riadok++) {
            for (int stlpec = 1; stlpec <= riadok; stlpec++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
