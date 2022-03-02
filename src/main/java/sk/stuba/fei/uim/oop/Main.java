package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Main {  //odmocnina
    public static void main(String[] args) {

        double x = ZKlavesnice.readDouble("Zadaj cislo ");

        double d = 0;
        double h = x + 1;

        double eps = 0.00000000001;
        double s = (d+h)/2;

        if(x>=0){
            do {

               if( s*s>=x ){
                   h = s;
               }
               else{
                   d = s;
               }
               s = (d+h)/2;

            }while ( (h-d)/s > eps );
            System.out.println("Odmocnica cisla " +x+ " je rovna "+s);
        }
        else{
            System.out.println("nejde to bože");
        }


    }
}
