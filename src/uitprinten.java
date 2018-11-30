import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class uitprinten {

    public static void main(String[] args) {
        String fileName = "out.txt"; //zorgt ervoor dat de file wordt gemaakt
        try {
            PrintWriter outputSteam = new PrintWriter(fileName);
            outputSteam.println("Hi there file!"); ///dit is de tekst die hij laat zien in de out.txt
            outputSteam.close(); //duwt de data naar de file
            System.out.println("Done.");

        } catch (FileNotFoundException e) { //hier zorgt hij voor de code hij niet kan zien
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
