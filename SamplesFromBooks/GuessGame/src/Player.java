import java.util.Random;

public class Player {
    int number;
    void guess() {
        Random randomizer = new Random();
        number = randomizer.nextInt(10);
    }
}
