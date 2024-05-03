package resources;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();
        System.out.println("Hello, " + firstName + " " + lastName + "!");
        keyboard.close();
    }
}
