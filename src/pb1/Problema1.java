package pb1;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lungime=");
        int lungime = scanner.nextInt();
        System.out.print("latime=");
        int latime = scanner.nextInt();
        System.out.println("lungime="+lungime+" latime="+latime);

        int perimetru = 2*(latime+lungime);
        int arie = latime*lungime;
        System.out.print("perimetru="+perimetru+" arie="+arie);
    }
}
