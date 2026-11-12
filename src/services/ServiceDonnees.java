package services;

import java.util.ArrayList;
import java.util.List;
import models.*;

/**
 * Fourni : chaque appel crée de nouvelles commandes et de nouveaux articles.
 */
/** Fabrique les données de commandes utilisées par l'application. */
public class ServiceDonnees {
    /** @return un nouvel ensemble de commandes et d'articles de démonstration */
    public static List<Commande> creerCommandes() {
        List<Commande> commandes = new ArrayList<>();
        Commande c101 = new Commande(101);
        Burger burger = new Burger("Burger Classic", 10.00, c101);
        burger.ajouterSupplement(SupplementPlat.FROMAGE);
        c101.ajouterArticle(burger);
        c101.ajouterArticle(new Boisson(TypeBoisson.COCA, TailleBoisson.MOYENNE, 3.00, c101));
        Glace glace = new Glace("Glace vanille", 4.00, c101);
        glace.ajouterSupplement(SupplementDessert.CARAMEL);
        c101.ajouterArticle(glace);
        commandes.add(c101);

        Commande c102 = new Commande(102);
        Salade saladePoulet = new Salade("Salade César", 9.00, c102);
        saladePoulet.ajouterSupplement(SupplementPlat.POULET);
        c102.ajouterArticle(saladePoulet);
        c102.ajouterArticle(new Boisson(TypeBoisson.COCA, TailleBoisson.PETITE, 3.00, c102));
        c102.ajouterArticle(new Donut("Donut nature", 3.00, c102));
        commandes.add(c102);

        Commande c103 = new Commande(103);
        Tacos tacos = new Tacos("Tacos maison", 11.00, c103);
        tacos.ajouterSupplement(SupplementPlat.SAUCE);
        c103.ajouterArticle(tacos);
        c103.ajouterArticle(new Boisson(TypeBoisson.EAU, TailleBoisson.GRANDE, 2.00, c103));
        Salade saladeFromage = new Salade("Salade César", 9.00, c103);
        saladeFromage.ajouterSupplement(SupplementPlat.FROMAGE);
        c103.ajouterArticle(saladeFromage);
        commandes.add(c103);
        return commandes;
    }
}
