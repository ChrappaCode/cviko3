package sk.stuba.fei.uim.oop;

public class Vynechaj_negativne {
    public static void main(String[] args) {

        int n = args.length;

        for (int i = 0; i < n ; i++){

            int x = Integer.parseInt(args[i]);
            if(x < 0)
                continue;
            System.out.println("args" + i + " : " + x);

        }



    }
}
