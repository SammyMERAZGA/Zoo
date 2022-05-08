package models.Animal.Mammal;

import models.Interface.WanderingAnimal;

public class Tiger extends Mammal implements WanderingAnimal {

    // Constructor
    public Tiger(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthyIndicator, byte durationGestation) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthyIndicator, durationGestation);
    }

    @Override
    public boolean wander() {
        System.out.println("Le tigre vagabonde !");
        return true;
    }
}
