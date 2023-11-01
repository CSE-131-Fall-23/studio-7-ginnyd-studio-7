package studio7;

import java.util.Random;

public class Die {
    private int sides;
    private Random random;

    public Die(int sides) {
        if (sides < 2) {
            throw new IllegalArgumentException("A die must have at least 2 sides.");
        }
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }

    public static void main(String[] args) {
        Die sixSidedDie = new Die(6);

        for (int i = 0; i < 5; i++) {
            int result = sixSidedDie.roll();
            System.out.println("Roll " + (i + 1) + ": " + result);
        }
    }
}
