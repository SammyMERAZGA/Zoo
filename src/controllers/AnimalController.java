package controllers;

import views.AnimalView;

import java.util.Scanner;

public class AnimalController {

    public static void chooseTheActions(){

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Les animaux vont être nourris ! 🍲");
                break;
            case 2:
                System.out.println("Les animaux vont être soignés ! 💊");
                break;
            case 3:
                System.out.println("Les animaux vont émettre un son ! 🔊");
                break;
            case 4:
                System.out.println("Les animaux vont dormir ! 💤");
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
