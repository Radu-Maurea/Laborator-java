package pb3;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        int numar;
        Scanner scanner = new Scanner(System.in);
        numar = scanner.nextInt();

        int cnt=0;
        for(int i=1;i<=numar;i++)
        {
            if(numar%i==0)
            {
                cnt++;
                System.out.println(i);
            }

        }
        if(cnt==2)
            System.out.print("numarul e prim");


    }
}
