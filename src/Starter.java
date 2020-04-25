import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) throws IOException {
        String x = null;
        try (FileInputStream text = new FileInputStream(new File("C:/Users/user/Desktop/films.txt"))) {
            Scanner sc = new Scanner(text);
            x = sc.nextLine();
        }
        String x1 = null;
        try (FileInputStream text1 = new FileInputStream(new File("C:/Users/user/Desktop/films.txt"))){
            Scanner sc1 = new Scanner(text1);
            x1 = sc1.nextLine();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Convert to morse");
        System.out.println(Decoder.convertEng(x));
        System.out.println("Convert to english");
        System.out.println(Decoder.convertMorse(x1));


    }
}
