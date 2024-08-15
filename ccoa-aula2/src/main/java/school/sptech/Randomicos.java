package school.sptech;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {
        // No JavaScript -> Math.random() * 10 -> Também existe no Java.

        Random random = new Random();

        for (int i = 0; i < 100 ; i++) {
            Integer aleatorio = random.nextInt(0, 20);
            System.out.println(aleatorio);
        }

        ThreadLocalRandom.current().nextInt(0, 20);
    }
}
