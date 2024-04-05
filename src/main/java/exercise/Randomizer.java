package exercise;

import java.util.ArrayList;
import java.util.List;

public class Randomizer {

    public String getRandom(List<String> strings) {
        return strings.get((int) (Math.random() * strings.size()));
    }

    public void shuffle(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            int randomIndex = (int) (Math.random() * strings.size());
            String temp = strings.get(i);
            strings.set(i, strings.get(randomIndex));
            strings.set(randomIndex, temp);
        }
    }

    public List<String> getShuffled(List<String> strings) {
        List<String> shuffled = new ArrayList<>(strings);
        shuffle(shuffled);
        return shuffled;
    }

    public List<String> getRandomSample(List<String> strings, int sampleSize) {
        return getShuffled(strings).subList(0, sampleSize);
    }
}
