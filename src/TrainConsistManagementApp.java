import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the order of bogies as they are added
 * while ensuring no duplicates exist using LinkedHashSet.
 *
 * At this stage, the application:
 * - Adds bogies in order
 * - Preserves insertion sequence
 * - Prevents duplicate entries
 * - Displays final train formation
 *
 * This demonstrates ordered uniqueness using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=========================================\n");

        // LinkedHashSet preserves order and avoids duplicates
        Set<String> train = new LinkedHashSet<>();

        // ----- Add bogies -----
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // ----- Attempt duplicate -----
        train.add("Sleeper"); // will be ignored

        // ----- Display formation -----
        System.out.println("Final Train Formation:");
        System.out.println(train);

        System.out.println("\nTotal Bogies: " + train.size());
    }
}