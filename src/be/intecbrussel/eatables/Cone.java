package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {
    private Flavor[] balls;

    public Cone() {

    }

    public Cone(Flavor[] Flavor) {
        this.balls = Flavor;
    }

    @Override
    public void eat() {
        System.out.println("Cone " + Arrays.toString(balls));
    }
}
