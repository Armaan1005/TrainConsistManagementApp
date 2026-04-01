import java.util.ArrayList;
import java.util.List;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates how passenger bogies can be dynamically managed
 * using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds bogies to the list
 * - Removes a bogie
 * - Checks for existence
 * - Displays final train consist
 *
 * @author Developer
 * @version 2.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("======================================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ===============================
        // ADD bogies
        // ===============================
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ===============================
        // REMOVE bogie
        // ===============================
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ===============================
        // CHECK existence
        // ===============================
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        // ===============================
        // FINAL STATE
        // ===============================
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}