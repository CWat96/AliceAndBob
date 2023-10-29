/**
 * Created by iyasuwatts on 10/17/17.
 */
import  java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob")) {
        System.out.println("Hello, " + name + "!");

        } else {
            System.out.println("You are neither Alice nor Bob.");
        }
}
}
