package views;

import controllers.AnimalController;

import java.util.Scanner;

public class AnimalView {

    public void chooseAnAnimal() {
        System.out.println("Voici la liste des animaux :");
        System.out.println("1 - Loups 🐺");
        System.out.println("2 - Tigres 🐯");
        System.out.println("3 - Ours 🐻");
        System.out.println("4 - Baleines 🐳");
        System.out.println("5 - Poissons rouges 🐡");
        System.out.println("6 - Requins 🦈");
        System.out.println("7 - Aigles 🦅");
        System.out.println("8 - Pingouins 🐧");

        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez les animaux dont vous souhaitez vous occuper :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Vous avez choisi les loups 🐺");
                actionsWithAnimals();
                break;
            case 2:
                System.out.println("Vous avez choisi les tigres 🐯");
                actionsWithAnimals();
                break;
            case 3:
                System.out.println("Vous avez choisi les ours 🐻");
                actionsWithAnimals();
                break;
            case 4:
                System.out.println("Vous avez choisi les baleines 🐳");
                actionsWithAnimals();
                break;
            case 5:
                System.out.println("Vous avez choisi les poissons rouges 🐡");
                actionsWithAnimals();
                break;
            case 6:
                System.out.println("Vous avez choisi les requins 🦈");
                actionsWithAnimals();
                break;
            case 7:
                System.out.println("Vous avez choisi les aigles 🦅");
                actionsWithAnimals();
                break;
            case 8:
                System.out.println("Vous avez choisi les pingouins 🐧");
                actionsWithAnimals();
                break;
            default:
                System.out.println("Vous avez choisi des animaux qui n'existent pas !");
                break;
        }
    }

    public void actionsWithAnimals() {
        System.out.println("Que voulez-vous faire avec ces animaux ? ");
        System.out.println("1 - Les nourrir 🍽");
        System.out.println("2 - Les soigner 💊");
        System.out.println("3 - Les faire émettre un cri 🔊");
        System.out.println("4 - Les faire dormir 💤");
        System.out.println("5 - Quitter");

        AnimalController.chooseTheActions();
    }

}
