package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class pole_2D {
    public static void main(String[] args) {

        //takze podme sa pozriet na realne priklady

        int pocet_riadkov = ZKlavesnice.readInt("Zadaj pocet riadov pola");

        System.out.println("pocet prvkov: " + pocet_riadkov);

        int pocet_stlpcov = ZKlavesnice.readInt("Zadaj pocet stlpcov pola");

        System.out.println("pocet prvkov: " + pocet_stlpcov);

        if(pocet_riadkov > 0 && pocet_stlpcov > 0){

            int[][] matica = new int[pocet_riadkov][pocet_stlpcov];

            for(int i = 0; i < matica.length; i++){ //matica.length == pocet riadov

                for (int y = 0; y < matica[i].length ;y++){ //matica[i].length == pocet stlp

                    matica[i][y] = ZKlavesnice.readInt("zadaj matica["+i+"]"+"["+y+"]");

                }
            }
        System.out.println("Vypis matice");

        for (int i = 0; i < matica.length; i++){
            for (int y = 0; y < matica[i].length;y++){
                System.out.print(matica[i][y]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("obsah premennej matica je "+ matica);
        System.out.println("obsah premennej matica[0] je "+ matica[0]);
        }
        else{
            System.out.println("pocet riadkov abo stlpcov nie je kladny");
        }

    }
}
