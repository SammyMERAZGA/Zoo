package models.Animal.Mammal;

import models.Interface.MarineAnimal;
import models.Interface.WanderingAnimal;

public class Bear extends Mammal implements WanderingAnimal, MarineAnimal {

    // Constructor
    public Bear(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthyIndicator, byte durationGestation) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthyIndicator, durationGestation);
    }

    @Override
    public boolean swim() {
        if(!this.wander()) {
            System.out.println("L'ours est en train de nager");
            return true;
        }
        else {
            System.out.println("Actuellement, l'ours ne peut pas nager");
            return false;
        }
    }

    @Override
    public boolean wander() {
        if(!this.swim()) {
            System.out.println("L'ours est en train de se déplacer");
            return true;
        }
        else {
            System.out.println("Actuellement, l'ours ne peut pas se déplacer");
            return false;
        }
    }
}
