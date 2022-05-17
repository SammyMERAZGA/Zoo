package ZooMain;

import views.Dashboard;

public class Zoo {

    public static void main(String[] args) {
        System.out.println("--- Bienvenue dans l'application de gestion de Zoo ! 🦁🐳🦅 ---");

        Dashboard dashboard = new Dashboard();
        dashboard.menu();

        dashboard.returnToMenu();
    }
}
