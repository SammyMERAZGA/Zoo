package controllers;

import models.Animal.Animal;
import models.Employee.Employee;
import models.Enclosure.Aquarium;
import models.Enclosure.Aviary;
import models.Enclosure.Enclosure;
import models.Enclosure.StandardEnclosure;
import models.Zoo.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooController {

    public void chooseADisplay() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Nombre d'animaux :");
                break;
            case 2:
                break;
            default:
                System.out.println("Vous n'avez pas choisi d'action");
                break;
        }
    }
}
