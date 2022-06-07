package controllers;

import models.Animal.Animal;
import views.AnimalView;
import views.EmployeeView;
import views.EnclosureView;
import views.ZooView;

import java.util.Scanner;

public class DashboardController {

    private ZooView zooView;
    private EmployeeView employeeView;
    private AnimalView animalView;
    private EnclosureView enclosureView;

    public DashboardController() {
        animalView = new AnimalView();
        enclosureView = new EnclosureView();
        zooView = new ZooView();
        employeeView = new EmployeeView();
    }

    public void chooseOnTheMenu(){

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Vous avez choisi la gestion des animaux 🦁");
                animalView.chooseAnAnimal();
                break;
            case 2:
                System.out.println("Vous avez choisi la gestion des enclos 🏞");
                enclosureView.chooseAnEnclosure();
                break;
            case 3:
                System.out.println("Vous avez choisi la gestion des zoos 🦒");
                zooView.chooseZooOption();
                break;
            case 4:
                System.out.println("Vous avez choisi la gestion des employés 🧑‍");
                employeeView.menuEmployee();
                break;
            case 5:
                System.out.println("Vous avez choisi de quitter 👋");
                break;
            default:
                System.out.println("Veuillez choisir une option valide");
                break;
        }
    }
}
