package sk.stuba.fei.uim.oop;

public class CVIKO3 {
    public static void main(String[] args) {

        Auto skoda = new Auto();
        Auto bmw = new Auto();

        skoda.jedna = 1;
        bmw.jedna = 2;

        if(skoda.jedna == bmw.jedna){
            System.out.println("zazrak");
        }
        else
            System.out.println("ziadny zazrak");




    }
}
