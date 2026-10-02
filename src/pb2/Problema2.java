package pb2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Problema2 {
    public static void main(String[] args) {

        BufferedReader flux_in;
        String linie;
        String[] elemente;

        int minim = 1000;
        int maxim = 0;
        int suma = 0;
        int numarElemente = 0;

        InputStream input = Problema2.class.getResourceAsStream("in.txt");

        try {
            flux_in = new BufferedReader(new InputStreamReader(input));

            while ((linie = flux_in.readLine()) != null) {

                elemente = linie.split(" ");

                for (String element : elemente) {
                    int numar = Integer.parseInt(element);

                    System.out.println(numar);

                    if (numar < minim)
                        minim = numar;

                    if (numar > maxim)
                        maxim = numar;

                    suma += numar;
                    numarElemente++;
                }
            }

            flux_in.close();

            float medie = (float) suma / numarElemente;

            System.out.println("minim = " + minim);
            System.out.println("maxim = " + maxim);
            System.out.println("suma = " + suma);
            System.out.println("media = " + medie);

        } catch (Exception e) {
            System.out.println("nu exista");
        }
    }
}
