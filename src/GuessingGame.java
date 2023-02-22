import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("\nWhat is your name?");
        String userName = myObj.nextLine();

        System.out.println("\nHello, " + userName + "!");
    }
}
