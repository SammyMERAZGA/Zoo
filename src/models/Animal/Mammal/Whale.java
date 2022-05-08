package models.Animal.Mammal;

import models.Interface.MarineAnimal;

public class Whale extends Mammal implements MarineAnimal {

    // Constructor
    public Whale(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthyIndicator, byte durationGestation) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthyIndicator, durationGestation);
    }

    @Override
    public boolean swim() {
        System.out.println("La baleine est en train de nager !");
        return true;
    }
}
