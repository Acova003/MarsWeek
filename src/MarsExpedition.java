import java.util.Scanner;

public class MarsExpedition {
    public marsExpedition (){
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

        
    }
}

