package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Switcherino {
    public static void main(String[] args) {

        String den = "";
        int poradove_cislo = ZKlavesnice.readInt("Daj cislo poradove: ");

        switch(poradove_cislo){

            case 1: den = "pondelok";break;
            case 2: den = "utorok";break;
            case 3: den = "streda";break;
            case 4: den = "štvrtok";break;
            case 5: den = "piatok";break;
            case 6:
            case 7: den = "Vikend";break;
            default: den = "šak povedz ty ne?";


        }

        System.out.println(den);

    }
}
