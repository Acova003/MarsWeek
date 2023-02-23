import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindingList {
    public FindingList() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome back to Earth!");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("All the rock data has been downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");

        rockList.remove("not rock");

        System.out.println(rockList);
        System.out.println("Perfect");

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

System.out.println("Fossil data downloaded");

fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

System.out.println("Which of the fossils would you like to learn more about (Bird, fish, or tooth)?");

Scanner input = new Scanner(System.in);

String fossilChoice = input.nextLine();

if (fossilChoice.equalsIgnoreCase("Bird")) {
    System.out.println("Fossil: " + fossilChoice + "\n" + fossilDirectory.get(fossilChoice));
} else if (fossilChoice.equalsIgnoreCase("Fish")) {
    System.out.println("Fossil: " + fossilChoice + "\n" + fossilDirectory.get(fossilChoice));
} else if (fossilChoice.equalsIgnoreCase("Tooth")) {
    System.out.println("Fossil: " + fossilChoice + "\n" +fossilDirectory.get(fossilChoice));
}
    }
}
