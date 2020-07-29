
import java.util.Scanner;

// @author carl-
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.start();
   
    }
}
