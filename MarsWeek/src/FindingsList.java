import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // Quick pause to emulate the expedition
        Thread.sleep(500);

        // AI welcomes the user back.
        System.out.println("\nWelcome back; hopefully your trip went well.");
        Thread.sleep(1000);

        // Creation of ArrayList. Was going to make just an array but the MVP insisted using an array list.
        ArrayList<String> findings = new ArrayList<>();
        findings.add("rock");
        findings.add("weird rock");
        findings.add("smooth rock");
        findings.add("ripped jeans");

        // Confirmation of findings.
        System.out.println("\nFindings have been uploaded. You found:");

        for (String s : findings) {
            System.out.println("\t" + s);
        }
        Thread.sleep(1000);

        // Removing non-rock item in array.
        System.out.println("\nIt seems that the " + findings.get(3) + " was incorrectly uploaded.\n\nRemoving item now...");
        Thread.sleep(1000);

        findings.remove(3);

        for (String s : findings) {
            System.out.println("\t" + s);
        }
        System.out.println("\nPerfect.");
        Thread.sleep(1000);

        // Storing fossils
        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water.");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil.");

        System.out.println("\nFossil data downloaded!");
        Thread.sleep(1000);

        // Asking user what they want to read about.
        System.out.print("\nWhich fossil did you want to learn about (Bird, fish, or tooth)? ");
        String learn = input.nextLine();

        // Adjusting user input for ease of use.
        // Plus, the example tried to just use the user's input to grab data from the hashmap but it did it incorrectly.
        // So I figured I would try and remedy that.
        String info = learn.substring(0, 1).toUpperCase() + learn.substring(1).toLowerCase() + " Fossil";

        // Verifying what the user inputted and giving them their requested info.
        if (learn.equalsIgnoreCase("bird")) {
            System.out.println("\n" + info + ": " + fossils.get(info));
        } else if (learn.equalsIgnoreCase("fish")) {
            System.out.println("\n" + info + ": " + fossils.get(info));
        } else if (learn.equalsIgnoreCase("tooth")) {
            System.out.println("\n" + info + ": " + fossils.get(info));
        } else {
            System.out.println("\nAs your answer was unintelligible, I will assume you are not interested in about what you found.");
        }
        Thread.sleep(700);

        // Initializing supplies that were brought on the expedition.
        HashSet<String> supplies = new HashSet<>();
        supplies.add("water");
        supplies.add("rations");
        supplies.add("oxygen tank");
        supplies.add("pickaxe");
        supplies.add("brush");

        // Printing out the supplies before the expedition.
        System.out.println("\nSupplies Before Expedition:");
        for (String s : supplies) {
            System.out.println("\t- " + s);
        }
        Thread.sleep(1000);

        // AI calculating
        System.out.println("\nCalculating supplies used...");
        supplies.remove("water");
        supplies.remove("rations");
        Thread.sleep(2000);

        // Printing out the supplies after the expedition.
        System.out.println("\nSupplies After Expedition:");
        for (String s : supplies) {
            System.out.println("\t- " + s);
        }
    }
}
