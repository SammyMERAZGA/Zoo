package controllers;

import models.Animal.Animal;
import models.Enclosure.Aquarium;
import models.Enclosure.Aviary;
import models.Enclosure.Enclosure;
import models.Enclosure.StandardEnclosure;
import models.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    Employee sammy = new Employee("Sammy", "Masculin", (byte)21);
    public void examineTheEnclosureChoosed(Enclosure enclosure) {
        System.out.println("Vous avez choisi l'enclos de " + enclosure + " 🏞");
        sammy.examineEnclosure(enclosure);
    }
}
