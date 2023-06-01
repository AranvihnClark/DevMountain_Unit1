import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        // New scanner and random initialization
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Reusing response variable in multiple places.
        String response;

        // Boot up sequence.
        System.out.print("Booting up ");
        for (int i = 0; i < (15 + random.nextInt(10)); i++) {
            Thread.sleep(200);
            System.out.print(".");
        }
        System.out.print(" sequence complete!");
        Thread.sleep(400);

        // Grabbing user's name.
        System.out.print("\n\nWelcome user.\nPlease enter your name so I may confirm your credentials: ");
        String name = input.nextLine();

        // Welcoming user.
        System.out.println("\nThank you, " + name + ". We are glad to welcome you to the Expedition program.");
        Thread.sleep(200);

        // Asking if ready.
        System.out.print("\nAre you you ready to begin? (y/n) ");

        // Verifying user input.
        while (true) {
            response = input.nextLine();

            if (response.equalsIgnoreCase("y")) {
                System.out.println("\nAs expected of a team leader - always ready when asked.");
                break;
            } else if (response.equalsIgnoreCase("n")) {
                System.out.println("\nUnfortunately, we cannot wait until you are ready team leader.");
                break;
            } else {
                System.out.print("\nI didn't quite catch that. Please enter a proper response: ");
            }
        }
        Thread.sleep(200);

        // Confirming number of team members
        System.out.print("\nHow many members will be joining you on this expedition? ");

        int numOfMembers = -1;
        try {
            numOfMembers = input.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("\nSeems you have you decided to give me an uninterpretable response.");
        }

        if (numOfMembers == 2) {
            System.out.println("\nI should have known you would remember how many people are needed in an expedition.");
        } else if (numOfMembers > 2) {
            System.out.println("\nUnfortunately, the pod only fits a max of 3 people. We have selected to add the max number to your team. 2, if you didn't understand.");
        } else if (numOfMembers == 1) {
            System.out.println("\nUnfortunately, teams are always composed of a lead and two extra members. Adding 2 members, instead of just 1 to the team.");
        } else {
            System.out.println("\nUnfortunately, as you are of no use, I have added 2 members to the team to reach the max of three people in a pod.");
        }
        numOfMembers = 2;
        Thread.sleep(1000);

        // Selecting a snack.
        System.out.print("\nPlease let me know what sort of snack you would like to bring and I will pack it for you: ");
        input.nextLine();
        String snack = input.nextLine();

        System.out.println("\nI will never understand why you like eating " + snack + ", " + name + ".");
        Thread.sleep(1000);

        // Choosing a vehicle.
        System.out.print("""

                \t1. Two horses and a wagon
                \t2. 2022 Blu Cepheus Lamborghini Revuelto
                \t3. 10 Speed Bicycle
                \t4. 2023 Candy Ardent Red Gold Wing
                \t5. Yellow Cub Cadet Ultima ZTS)

                Next, please choose a vehicle among the above (1 - 5):\s""");
        response = input.nextLine();

        switch (response) {
            case "1": response = "Two horses and a wagon"; break;
            case "2": response = "2022 Blu Cepheus Lamborghini Revuelto"; break;
            case "3": response = "10 Speed Bicycle"; break;
            case "4": response = "2023 Candy Ardent Red Gold Wing"; break;
            case "5": response = "Yellow Cub Cadet Ultima ZTS"; break;
            default: response = "10 Speed Bicycle";
                     System.out.print("\nSince you failed to input a correct response, we have chosen one for you.");
                     break;
        }
        System.out.println("\n\n" + response + " will be added to the pod.");
        Thread.sleep(2000);

        // Good-bye message.
        System.out.println("\nWell then...\n\nTeam leader " + name + ", you have selected the options below:" +
                           "\nTeam Size: " + numOfMembers +
                           "\nSnack: " + snack +
                           "\nVehcile: " + response);

        Thread.sleep(2000);
        System.out.println("\nThe expedition will begin in...");

        for (int i = 5; i >= 1; i--) {
            Thread.sleep(500);
            System.out.println(i + "...");
        }
        System.out.println("Mission start!");
    }
}
