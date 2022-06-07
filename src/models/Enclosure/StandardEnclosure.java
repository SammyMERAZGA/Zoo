package models.Enclosure;

import models.Animal.Animal;
import models.Interface.WanderingAnimal;

import java.util.ArrayList;

public class StandardEnclosure<T extends WanderingAnimal> extends Enclosure {

    // Constructor
    public StandardEnclosure(String name, int area, int maxNbAnimals, int nbAnimalsPresent, ArrayList<T> animals, byte cleanlinessDegree, String typeAnimal) {
        super(name, area, maxNbAnimals, nbAnimalsPresent, animals, cleanlinessDegree, typeAnimal);
    }
}