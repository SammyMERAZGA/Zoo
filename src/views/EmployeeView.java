package views;

import controllers.EmployeeController;
import models.Employee.Employee;

import java.util.Scanner;

public class EmployeeView {

    String employee = "";

    public void menuEmployee() {
        System.out.println("Choisir une option :");
        System.out.println("1. Examiner un enclos 🏞");
        System.out.println("2. Nettoyer un enclos ✨");
        System.out.println("3. Nourrir les animaux d'un enclos 🍖");
        System.out.println("4. Transférer un animal d'un enclos à un autre 🐻");
        System.out.println("5. Quitter");

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez choisir une option :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                this.listEnclosure();

                Scanner sc2 = new Scanner(System.in);

                System.out.println("Veuillez choisir un enclos :");
                int enclosureChoice = sc2.nextInt();

                EmployeeController employeeController = new EmployeeController();
                switch (choice) {
                    case 1:
                        System.out.println("Vous avez choisi l'enclos de loups 🐺");
                        break;
                    case 2:
                        System.out.println("Vous avez choisi l'enclos de tigres 🐯");
                        break;
                    case 3:
                        System.out.println("Vous avez choisi l'enclos d'ours 🐻");
                        break;
                    case 4:
                        System.out.println("Vous avez choisi l'enclos de baleines 🐳");
                        break;
                    case 5:
                        System.out.println("Vous avez choisi l'enclos de poissons rouges 🐡");
                        break;
                    case 6:
                        System.out.println("Vous avez choisi l'enclos de requins 🦈");
                        break;
                    case 7:
                        System.out.println("Vous avez choisi l'enclos d'aigles 🦅");
                        break;
                    case 8:
                        System.out.println("Vous avez choisi l'enclos de pingouins 🐧");
                        break;
                    default:
                        System.out.println("Veuillez choisir une option valide");
                        break;
                }
                break;
        }
    }

    // list of enclosure and return the choice
    public void listEnclosure() {
        System.out.println("👉 Choisissez l'enclos dont vous souhaitez vous occuper :");
        System.out.println("1. Enclos de loups 🐺");
        System.out.println("2. Enclos de tigres 🐯");
        System.out.println("3. Enclos d'ours 🐻");
        System.out.println("4. Enclos de baleines 🐳");
        System.out.println("5. Enclos de poissons rouges 🐡");
        System.out.println("6. Enclos de requins 🦈");
        System.out.println("7. Enclos d'aigles 🦅");
        System.out.println("8. Enclos de pingouins 🐧");
    }
}
