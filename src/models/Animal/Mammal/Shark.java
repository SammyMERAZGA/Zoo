package models.Animal.Mammal;

import models.Animal.Mammal.Mammal;
import models.Interface.MarineAnimal;

public class Shark extends Mammal implements MarineAnimal {

    // attributes
    private byte durationGestationShark; // (ex: 20 (mois))

    // constructor
    public Shark(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator, byte durationGestation, byte durationGestationShark) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthIndicator, durationGestation);
        this.durationGestationShark = durationGestationShark;
    }

    // getters
    public byte getDurationGestationShark() {
        return durationGestationShark;
    }

    // setters
    public void setDurationGestationShark(byte durationGestationShark) {
        this.durationGestationShark = durationGestationShark;
    }

    // methods
    public void giveBirth() {
        if(super.getSex().equals("Female") && this.getDurationGestationShark() > 42) {
            System.out.println("Le requin femelle vient de mettre bas !");
        }
    }

    @Override
    public boolean swim() {
        System.out.println("Le requin est en train de nager !");
        return true;
    }
}
