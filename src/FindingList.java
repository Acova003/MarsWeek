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
    }
}
