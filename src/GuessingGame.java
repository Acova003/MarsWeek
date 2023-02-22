import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("\nWhat is your name?");
        String userName = input.nextLine();

        System.out.println("\nHello, " + userName + "!");

        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println("The magic number is a number between 1 and 100");
        int tries = 0;

        while (true) {
            tries ++;
            System.out.println("\nWhat is your guess?");
            int userGuess = input.nextInt();
            if (userGuess == number) {
                System.out.println("\nCongratulations! The magic number is: " + number);
                System.out.println("You guessed it in " + tries + " tries");
                break;
            } else if (userGuess < number && userGuess <= 100 && userGuess > 0 ) {
                System.out.println("Too low");
            } else if (userGuess > number && userGuess <= 100 && userGuess > 0) {
                System.out.println("Too high");
            } else {
                System.out.println("Invalid entry. Please pick a number between 1 and 100");
            }
        }

    }
}
