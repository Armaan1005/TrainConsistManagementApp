import java.util.HashSet;
import java.util.Set;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 3: Track Unique Bogie IDs (HashSet)
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not added
 * into the train consist using a HashSet.
 *
 * At this stage, the application:
 * - Creates a HashSet for bogie IDs
 * - Adds multiple bogie IDs (including duplicates)
 * - Prevents duplicate entries automatically
 * - Displays unique bogie identifiers
 *
 * This demonstrates uniqueness using HashSet.
 *
 * @author Developer
 * @version 3.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=====================================\n");

        // HashSet stores only unique elements
        Set<String> bogieSet = new HashSet<>();

        // ----- Insert bogie IDs -----
        bogieSet.add("BG101");
        bogieSet.add("BG102");
        bogieSet.add("BG103");
        bogieSet.add("BG104");

        // ----- Attempt duplicate entries -----
        bogieSet.add("BG101"); // duplicate
        bogieSet.add("BG102"); // duplicate

        // ----- Display unique bogie IDs -----
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieSet);

        System.out.println("\nTotal Unique Bogies: " + bogieSet.size());
    }
}