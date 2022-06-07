package views;

import controllers.DashboardController;

import javax.swing.*;

import java.util.Scanner;

public class DashboardView {

    private DashboardController dashboardController;

    public DashboardView() {
        dashboardController = new DashboardController();
    }

    public void menu() {
        System.out.println("Choisir une option :");
        System.out.println("1. Gestion des animaux 🦁");
        System.out.println("2. Gestion des enclos 🏞");
        System.out.println("3. Gestion des zoos 🦒");
        System.out.println("4. Gestion des employés 🧑");
        System.out.println("5. Quitter");

        System.out.println("Veuillez choisir une option :");

        dashboardController.chooseOnTheMenu();
    }

    public void returnToMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voulez-vous retourner au menu principal ? (O/N)");
        String answer = sc.nextLine();

        if (answer.equals("O")) {
            System.out.println("Vous avez choisi de retourner au menu principal");
            menu();
        } else {
            System.out.println("Vous avez choisi de quitter");
            System.exit(0);
        }
    }
}
