package exercise;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class RandomizerTest {

    private Randomizer randomizer = new Randomizer();
    private List<String> locations = List.of("pasila", "malmi", "haaga", "porvoo", "vierumäki");

    @Test
    public void getRandomReturnsRandomItemsFromTheGivenList() {
        // If we call the randomizer enough times, we should get all the items in the
        // list at least once.
        Set<String> results = new HashSet<>();
        for (int i = 0; i < 10_000; i++) {
            String result = randomizer.getRandom(locations);

            assertTrue(locations.contains(result),
                    "getRandom should return an item from %s, but it returned %s"
                            .formatted(locations.toString(), result));

            results.add(result);
        }
    }

}
