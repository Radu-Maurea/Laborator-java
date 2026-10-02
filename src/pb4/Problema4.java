package pb4;

import java.util.Random;

public class Problema4 {

    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(31);
        int b = random.nextInt(31);
        while(a>30 || b>30 || a<0 || b<0)
        {
            a= random.nextInt();
            b=random.nextInt();
        }

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
