package models.Enclosure;

import models.Animal.Animal;

import java.util.ArrayList;

public abstract class Enclosure {

    // attributes
    private String name; // (ex: "Enclos de Tigre")
    private int area; // (ex: 100)
    private int maxNbAnimals; // (ex: 10)
    private int nbAnimalsPresent; // (ex: 7)
    private ArrayList<Animal> animals; // (ex: ["Tigre blanc", "Tigre d'Asie", "Tigre du Bengale"])
    private byte cleanlinessDegree; // (ex: 7 (0-10))

    // constructor
    public Enclosure(String name, int area, int maxNbAnimals, int nbAnimalsPresent, ArrayList<Animal> animals, byte cleanlinessDegree) {
        this.name = name;
        this.area = area;
        this.maxNbAnimals = maxNbAnimals;
        this.nbAnimalsPresent = nbAnimalsPresent;
        this.animals = animals;
        this.cleanlinessDegree = cleanlinessDegree;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getMaxNbAnimals() {
        return maxNbAnimals;
    }

    public int getNbAnimalsPresent() {
        return nbAnimalsPresent;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public byte getCleanlinessDegree() {
        return cleanlinessDegree;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setMaxNbAnimals(int maxNbAnimals) {
        this.maxNbAnimals = maxNbAnimals;
    }

    public void setNbAnimalsPresent(int nbAnimalsPresent) {
        this.nbAnimalsPresent = nbAnimalsPresent;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void setCleanlinessDegree(byte cleanlinessDegree) {
        this.cleanlinessDegree = cleanlinessDegree;
    }

    // methods
    public void displayEnclosureAndAnimalsCharacteristics() {
        System.out.println("\n" + this.getName() + " :");
        System.out.println("\t- Surface : " + this.getArea() + " m²");
        System.out.println("\t- Nombre d'animaux présents : " + this.getNbAnimalsPresent());
        System.out.println("\t- Nombre d'animaux maximum : " + this.getMaxNbAnimals());
        System.out.println("\t- Niveau de propreté : " + this.getCleanlinessDegree() + "/10");
        System.out.println("\t- Liste des animaux : ");
        for (Animal animal : this.getAnimals()) {
            System.out.println("\t\t- " + animal.getName());
        }
    }

    public void addAnimal(Animal animal) {
        if(this.getNbAnimalsPresent() < this.getMaxNbAnimals()) {
            this.getAnimals().add(animal);
            this.setNbAnimalsPresent(this.getNbAnimalsPresent() + 1);
            System.out.println("\n" + animal.getName() + " a été ajouté à l'enclos " + this.getName() + ".");
        }
        else {
            System.out.println("\nL'enclos " + this.getName() + " est plein.");
        }
    }

    public void removeAnimal(Animal animal) {
        if(this.getNbAnimalsPresent() > 0) {
            this.getAnimals().remove(animal);
            this.setNbAnimalsPresent(this.getNbAnimalsPresent() - 1);
            System.out.println("\n" + animal.getName() + " a été retiré de l'enclos " + this.getName() + ".");
        }
        else {
            System.out.println("\nL'enclos " + this.getName() + " est vide.");
        }
    }

    public void feedAnimals() {
        for (Animal animal : this.getAnimals()) {
            animal.eat();
        }
        System.out.println("\nLes animaux ont été nourris.");
    }

    public void cleaning() {
        if(this.getCleanlinessDegree() < 10) {
            this.setCleanlinessDegree((byte) (this.getCleanlinessDegree() + 1));
            System.out.println("\nL'enclos " + this.getName() + " a été nettoyé.");
        }
        else {
            System.out.println("\nL'enclos " + this.getName() + " est déjà nettoyé.");
        }
    }
}
