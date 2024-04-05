package exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * This class will not compile until the methods in the Randomizer class have
 * been made generic.
 *
 * The purpose of this class is to test that the methods work with any type of
 * objects, not just strings. This class does not focus on the randomness of the
 * results, as that is already tested in RandomizerTest. Instead, this class
 * verifies that the methods work with any type of objects.
 */
public class GenericRandomizerTest {

    /**
     * The Hero record class is used to verify your generic methods works with any
     * type of objects. Heroes just have names, which are strings.
     */
    record Hero(String name) {
    }

    // The object being tested:
    private Randomizer randomizer = new Randomizer();

    // Our test lists, which contain both numbers and objects:
    private List<Integer> numbers = List.of(100, 42, -1, 7, 10);
    private List<Hero> heroes = List.of(
            new Hero("Chase"), new Hero("Marshall"), new Hero("Skye"),
            new Hero("Rocky"), new Hero("Zuma"), new Hero("Rubble"));

    @Test
    void getRandomWorksWithIntegersAndObjects() {
        Integer number = randomizer.getRandom(numbers);
        Hero hero = randomizer.getRandom(heroes);

        assertTrue(numbers.contains(number));
        assertTrue(heroes.contains(hero));
    }

    @Test
    void shuffleCanShuffleAnyTypesOfObjects() {
        ArrayList<Integer> shuffledNumbers = new ArrayList<>(numbers);
        randomizer.shuffle(shuffledNumbers);
        RandomizerTest.assertContentsEqual(numbers, shuffledNumbers);

        ArrayList<Hero> shuffledHeroes = new ArrayList<>(heroes);
        randomizer.shuffle(shuffledHeroes);
        RandomizerTest.assertContentsEqual(heroes, shuffledHeroes);
    }

    @Test
    void getShuffledReturnedShuffledCopiesOfLists() {
        List<Integer> shuffledNumbers = randomizer.getShuffled(numbers);
        RandomizerTest.assertContentsEqual(numbers, shuffledNumbers);

        List<Hero> shuffledHeroes = randomizer.getShuffled(heroes);
        RandomizerTest.assertContentsEqual(heroes, shuffledHeroes);
    }

    @Test
    void getRandomSampleReturnsRandomSubsetsOfLists() {
        List<Integer> numberSample = randomizer.getRandomSample(numbers, 2);
        assertEquals(2, numberSample.size());

        List<Hero> heroSample = randomizer.getRandomSample(heroes, 4);
        assertEquals(4, heroSample.size());
    }
}
