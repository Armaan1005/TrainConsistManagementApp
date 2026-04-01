import java.util.HashMap;
import java.util.Map;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * Associates each bogie with its seating or load capacity
 * using a key-value mapping structure.
 *
 * At this stage, the application:
 * - Creates a HashMap
 * - Maps bogie names to capacity
 * - Iterates using entrySet()
 * - Displays bogie capacity details
 *
 * @author Developer
 * @version 6.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("=========================================\n");

        // Create HashMap (Bogie → Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ----- Insert data -----
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 30);
        bogieCapacity.put("Cargo", 1000);

        // ----- Display data -----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            System.out.println("Bogie: " + entry.getKey()
                    + " | Capacity: " + entry.getValue());
        }

        System.out.println("\nTotal Bogies: " + bogieCapacity.size());
    }
}