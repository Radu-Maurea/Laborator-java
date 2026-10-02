package pb2;

import java.io.*;

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

            // Scriem rezultatele în out.txt
            PrintWriter flux_out = new PrintWriter(new FileWriter("src/pb2/out.txt"));


            flux_out.println("minim = " + minim);
            flux_out.println("maxim = " + maxim);
            flux_out.println("suma = " + suma);
            flux_out.println("media = " + medie);

            flux_out.close();

        } catch (Exception e) {
            System.out.println("nu exista");
        }
    }
}
