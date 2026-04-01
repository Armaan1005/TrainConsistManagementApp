import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * =============================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Applies filter condition
 * - Collects filtered result
 * - Displays qualifying bogies
 *
 * This maps functional filtering using Streams.
 *
 * @author Developer
 * @version 8.0
 */

public class TrainConsistManagementApp {

    // Reusing Bogie class from UC7
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

        System.out.println("===============================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("===============================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        // ----- Apply Stream Filtering -----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60) // condition from PDF
                .collect(Collectors.toList());

        // ----- Display filtered result -----
        System.out.println("Filtered Bogies (Capacity > 60):\n");

        for (Bogie b : filteredBogies) {
            b.display();
        }
    }
}