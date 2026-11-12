package app;

import ctrl.Controller;

/** Point d'entrée de l'application de démonstration de commande. */
public class Application {
    /** Lance le contrôleur principal de l'application. */
    public static void main(String[] args) {
        new Controller().start();
    }
}
