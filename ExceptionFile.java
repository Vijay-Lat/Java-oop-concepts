import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionFile {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("sample.pdf");
            Scanner scan = new Scanner(file);
            String val = scan.nextLine();
            System.out.println(val);
            scan.close();
        } catch (FileNotFoundException error) {
            System.out.println(error.getMessage());
        }
    }

}
