import java.util.LinkedList;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist (LinkedList)
 *
 * Description:
 * This class models the ordered structure of a train consist
 * using LinkedList, allowing insertion and removal at specific
 * positions.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at a specific position
 * - Removes bogies from front and rear
 * - Displays updated train consist
 *
 * This demonstrates ordered operations using LinkedList.
 *
 * @author Developer
 * @version 4.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=====================================\n");

        // LinkedList for ordered train consist
        LinkedList<String> train = new LinkedList<>();

        // ----- Add bogies in sequence -----
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // ----- Insert at specific position -----
        train.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(train);

        // ----- Remove first and last bogie -----
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        // ----- Final Output -----
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);
    }
}