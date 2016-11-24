package ejercicio12;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

/**
 * Created by jaime.escribano on 24/11/2016.
 */
public class RecolectorCadenas {
    public static void main(){
        List<String> cadenaCadenas = new ArrayList<String>();
        char[] comparativa;
        comparativa = new char[]{' '};
        int i = 0;
        do {

            System.out.println("Introduzca una cadena\n");
            Scanner teclado = new Scanner(System.in);
            cadenaCadenas.add(i,teclado.nextLine());
            i++;
            if (comparativa.equals(teclado.nextLine())) break;
        } while(i < 100);

       try
       {
           Files.write(Paths.get("example.txt"),cadenaCadenas, Charset.defaultCharset())
       } catch (IOException e) {
e.printStackTrace();
    }
}
