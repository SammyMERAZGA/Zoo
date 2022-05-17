package models.Animal.Mammal;

import models.Animal.Mammal.Mammal;
import models.Interface.MarineAnimal;

public class Shark extends Mammal implements MarineAnimal {

    // constructor
    public Shark(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator, byte durationGestation) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthIndicator, durationGestation);
    }

    @Override
    public boolean swim() {
        System.out.println("Le requin est en train de nager !");
        return true;
    }
}
