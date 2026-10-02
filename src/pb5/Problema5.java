package pb5;

import java.util.Random;

public class Problema5 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(21);
        System.out.println(a);

        if(a==1)
            System.out.print("Apartine fibo");
        else{
            int x = 1, y = 1, z=x+y;
            while(z<=50)
            {
                z=x+y;
                x=y;
                y=z;
                if(z==a)
                {
                    System.out.print("Apartine fibo");
                    break;
                }
            }
        }


    }
}
