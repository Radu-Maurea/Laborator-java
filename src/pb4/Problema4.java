package pb4;

import java.util.Random;

public class Problema4 {

    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(31);
        int b = random.nextInt(31);

        System.out.println(a+" "+b);
        int x = a;
        int y = b;
        while (y != 0) {
            int rest = x % y;
            x = y;
            y = rest;
        }
        System.out.println("CMMDC = " + x);


    }
}
