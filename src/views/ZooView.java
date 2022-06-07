package views;

import java.util.Scanner;

public class ZooView {

    public void chooseZooOption() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez ce que vous souhaitez faire : 🦒");
        System.out.println("1 - Afficher le nombre d'animaux présents dans le zoo 🔢");
        System.out.println("2 - Afficher les animaux de tous les enclos ✨");
        int choice = sc.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Nb d'animaux :");
                break;
            case 2:
                System.out.println("Animaux de tous les enclos :");
                break;
            default:
                System.out.println("Vous n'avez pas choisi d'action");
                break;
        }
    }
}
