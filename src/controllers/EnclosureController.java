package controllers;

import models.Animal.Animal;
import models.Animal.Mammal.Bear;
import models.Animal.Mammal.Tiger;
import models.Animal.Mammal.Wolf;
import models.Enclosure.Aquarium;
import models.Enclosure.Enclosure;
import models.Enclosure.StandardEnclosure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnclosureController {

    public static void chooseAnAction(String enclosure) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        // Animals List
        List<Animal> wolfList = new ArrayList<>();
        wolfList.add(new Wolf("Bergamo", "Mâle", 26.44, 1.55, false, false, true, (byte) 69));

        List<Animal> tigreList = new ArrayList<>();
        tigreList.add(new Tiger("Austin", "Mâle", 56.44, 1.85, true, false, true, (byte) 102));

        List<Animal> oursList = new ArrayList<>();
        oursList.add(new Bear("Bouba", "Mâle", 155.53, 2.65, true, false, true, (byte) 225));

        // Enclosures
        StandardEnclosure enclosLoup = new StandardEnclosure("Enclos de loups", 950, 15, 1, (ArrayList<Animal>) wolfList, (byte) 0, "Loup");
        StandardEnclosure enclosTigre = new StandardEnclosure("Enclos de tigres", 1200, 12, 1, (ArrayList<Animal>) tigreList, (byte) 2, "Tigre");
        StandardEnclosure enclosOurs = new StandardEnclosure("Enclos d'ours", 1280, 7, 1, (ArrayList<Animal>) oursList, (byte) 3, "Ours");

        switch (choice) {
            case 1:
                switch(enclosure) {
                        case "Enclos de loups":
                            enclosLoup.displayEnclosureAndAnimalsCharacteristics(enclosLoup);
                            break;
                        case "Enclos de tigres":
                            enclosTigre.displayEnclosureAndAnimalsCharacteristics(enclosTigre);
                            break;
                        case "Enclos d'ours":
                            enclosOurs.displayEnclosureAndAnimalsCharacteristics(enclosOurs);
                            break;
                }
                break;
        }
    }
}
