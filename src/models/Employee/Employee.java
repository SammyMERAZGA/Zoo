package models.Employee;

import models.Animal.Animal;
import models.Enclosure.Enclosure;

public class Employee {

    // Properties
    private String name;
    private String sex;
    private byte age;

    public Employee(String name, String sex, byte age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public byte getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    // Methods
    public void examineEnclosure(Enclosure enclosure) {
        enclosure.displayEnclosureAndAnimalsCharacteristics();
    }

    public void cleanEnclosure(Enclosure enclosure) {
        enclosure.cleaning();
    }

    public void feedingAnimalsOfEnclosure(Enclosure enclosure) {
        enclosure.feedAnimals();
    }

    public void transferringAnimalFromEnclosureToAnother(Animal animal, Enclosure enclosure1, Enclosure enclosure2) {
        if(enclosure1.getAnimals().contains(animal)) {
            enclosure1.removeAnimal(animal);
            enclosure2.addAnimal(animal);
            System.out.println("L'animal a été transféré avec succès !");
        } else {
            System.out.println("L'animal est introuvable dans l'enclos !");
        }
    }

}
