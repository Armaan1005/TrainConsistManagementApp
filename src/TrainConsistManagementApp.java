import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a list
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted result
 *
 * This maps custom ordering using Comparator.
 *
 * @author Developer
 * @version 7.0
 */

public class TrainConsistManagementApp {

    // Inner class to represent Bogie
    static class Bogie {

        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public void display() {
            System.out.println(name + " | Capacity: " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("=========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        // ----- Display unsorted -----
        System.out.println("Unsorted Bogies:\n");
        for (Bogie b : bogies) {
            b.display();
        }

        // ----- Sort using Comparator -----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ----- Display sorted -----
        System.out.println("\nSorted Bogies (by Capacity):\n");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}