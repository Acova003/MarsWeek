import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nExpedition is starting..." + 
        "\nSystems engaged..." + 
        "\nWe're off in..." + 
        "\n3" +
        "\n2" + 
        "\n1" +
        "\nBlast off!");

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

        System.out.println("You have the choice of 3 vehicles" +
        "\nA: A Space Bubble" +
        "\nB: A Rocket 934" +
        "\nC: A Ducati");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "A Space Bubble";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "A Rocket 934";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "A Ducati";
        } else {
            vehicleChoice = "your feet";
        }
        System.out.println("Get ready to embark on your expedition!!!" +
                "\nCaptain: " + name + " with " + teamSize + " teammates." +
                "\nCruising through the universe with " + vehicleChoice + "." +
                "\nSnaking on " + snackAnswer + "." +
                "\nExploration starts in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }
}

