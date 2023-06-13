package activiadad2;
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        File fichero = new File( "src/activiadad2/fichero2.txt" );
        StringBuilder contructor = new StringBuilder();
        try (FileReader lector = new FileReader(fichero);
             BufferedReader bufflector = new BufferedReader(lector)) {
           int c;
            while ((c = bufflector.read()) != -1){
                contructor.append(c).append("_").append(", ");
            }
    }
    catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contructor.toString());
}

}
