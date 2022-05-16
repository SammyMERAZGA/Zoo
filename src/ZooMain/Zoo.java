package ZooMain;

import views.Dashboard;

public class Zoo {

    public static void main(String[] args) {
        System.out.println("--- Bienvenue dans l'application de gestion de Zoo ! 🦁🐳🦅 ---");

        System.out.println("Choisir une option :");
        System.out.println("1. Gestion des animaux");
        System.out.println("2. Gestion des enclos");
        System.out.println("3. Gestion des zoos");
        System.out.println("4. Gestion des employés");
        System.out.println("5. Quitter");

        int choix = Dashboard.readInt();
        switch (choix) {
            case 1:
                System.out.println("Gestion des animaux");
                break;
            case 2:
                System.out.println("Gestion des enclos");
                break;
            case 3:
                System.out.println("Gestion des zoos");
                break;
            case 4:
                System.out.println("Gestion des employés");
                break;
            case 5:
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Erreur de saisie");
                break;
        }
    }
}
