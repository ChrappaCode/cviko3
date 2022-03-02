package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Pole_poly_pol_poly {
    public static void main(String[] args) {

        /*
        int[][] pol = new int [][]
                {{1,2,3},{7,9,8},{12,32}};

        System.out.println(pol[1][2]);
        */

        //takze podme sa pozriet na realne priklady

        int pocet = ZKlavesnice.readInt("Zadaj pocet prvkov pola");

        System.out.println("pocet prvkov: " + pocet);

        int[] pole = new int[pocet];

        for(int i = 0; i < pole.length; i++){
            pole[i] = ZKlavesnice.readInt("Zadaj prvok pole["+i+"]");

        }

        System.out.println("Vypis pole");

        for(int y = 0; y < pole.length; y++){
            System.out.print(pole[y]+", ");
        }
        System.out.println();
        System.out.println("obsah premennej pole je "+pole);

    }
}
