package models.Animal.Other;

import models.Interface.FlyingAnimal;
import models.Interface.MarineAnimal;
import models.Interface.WanderingAnimal;

public class Penguin extends Other implements FlyingAnimal, MarineAnimal, WanderingAnimal {

    // Constructor
    public Penguin(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthyIndicator, byte incubationTime) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthyIndicator, incubationTime);
    }

    @Override
    public boolean fly() {
        if(!this.swim() && !this.wander()) {
            System.out.println("Les pingouins sont en train de voler ! 🐧");
            return true;
        }
        else {
            System.out.println("Actuellement, les pingouins ne peuvent pas voler. ❌");
            return false;
        }
    }

    @Override
    public boolean swim() {
        if(!this.fly() && !this.wander()) {
            System.out.println("Les pingouins sont en train de nager ! 🐧");
            return true;
        }
        else {
            System.out.println("Actuellement, les pingouins ne peuvent pas nager. ❌");
            return false;
        }
    }

    @Override
    public boolean wander() {
        if(!this.fly() && !this.swim()) {
            System.out.println("Les pingouins sont en train de se déplacer ! 🐧");
            return true;
        }
        else {
            System.out.println("Actuellement, les pingouins ne peuvent pas se déplacer. ❌");
            return false;
        }
    }
}
