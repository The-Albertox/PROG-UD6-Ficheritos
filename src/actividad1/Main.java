package actividad1;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File fichero = new File("src/actividad1/fichero.txt");
        try (FileReader lector = new FileReader(fichero);
                BufferedReader bufflector = new BufferedReader(lector);

                FileWriter escritor = new FileWriter("fichero.txt");
                PrintWriter salida = new PrintWriter(escritor);) {
            String linea;
            int limite = 30;
            for (int i = 0; i < limite; i++) {
                while ((linea = bufflector.readLine()) != null) {
                    salida.println(linea);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
