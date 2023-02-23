import java.util.Scanner;

public class MarsExpedition {
    public void marsExpedition (){
        Scanner input = new Scanner(System.in);
        System.out.println("\n Expedition is starting...");
        System.out.println("\n Systems engaged...");
        System.out.println("\n We're off in...");
        System.out.println("\n 3");
        System.out.println("\n 2");
        System.out.println("\n 1");
        System.out.println("\n Blast off!");

        System.out.println("\n What is your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name + " Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String answer = input.nextLine();
        
        if (answer.equals("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (answer.equals("N")) {
            System.out.println("Too bad you are team leader. You have to go.");
        } else {
            System.out.println("I didn't understand your answe. Please type Y or N");
            System.out.println("Are you ready to head out into the new world? Type Y or N");
            String secondAnswer = input.nextLine();
        }

        System.out.println("How many people do you want on your expedition team? (Input an int number)");

        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("Great! That's the perfect amount of people.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snackAnswer = input.nextLine();
        System.out.println("Nice choice, you will be bringing a" + snackAnswer + " with you.");
    }
}

