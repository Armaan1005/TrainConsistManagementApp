import java.util.ArrayList;
import java.util.List;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Initializes an empty train consist
 * - Uses a List to store bogies
 * - Displays initial bogie count
 * - Prints current state of the train
 *
 * @author Developer
 * @version 1.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC1 - Initialize Train Consist ");
        System.out.println("=====================================\n");

        // Create empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train initialized successfully.");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("\nCurrent Train Consist:");

        if (trainConsist.isEmpty()) {
            System.out.println("No bogies attached yet.");
        }

        System.out.println("\nSystem ready...");
    }
}