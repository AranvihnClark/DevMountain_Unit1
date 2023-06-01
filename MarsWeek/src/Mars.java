public class Mars {

    // Function
    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        // Loop to calculate directions. Seems kind of crazy as large numbers will take forever.
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if ((minute % 6) == 0) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            // To catch exceptions I guess?
            // Really seems like it's just in case if there is an error that the 'Thread.sleep()' causes.
            Thread.sleep(250);
        }
        // After finishing our directions, we land.
        System.out.println("Landed");

        // Return false as that was what was instructed.
        // Feel like landingCheck should return true after we finish landing...
        return false;
    }

    // Main
    public static void main(String[] args) throws InterruptedException{
        // Step 1 - Variables & Data Types
        String colonyName = "Alpha Bear";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        // Step 2 - Mathematical Operators
        meals = meals - ((shipPopulation * 0.75) * 2);

        System.out.println("Our current meals: " + meals);

        meals = meals + (meals * 0.5);
        shipPopulation += 5;

        // Step 3 - Conditional Love
        String landingLocation = "The Ocean";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain.");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }
        landing = landingCheck(10);

        // Project 3 call (guessing game)
        new GuessingGame();

        // Project 4 call (mars expedition)
        new MarsExpedition();
    }
}
