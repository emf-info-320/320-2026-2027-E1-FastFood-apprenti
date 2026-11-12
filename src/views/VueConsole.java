package views;

import java.util.List;
import java.util.Map;
import models.Article;
import models.Commande;
import services.ServiceFormatage;

/** Présente les commandes et les statistiques dans la console. */
public class VueConsole {
    /** Affiche les numéros et totaux des commandes. */
    public void afficherCommandes(List<Commande> commandes) {
        System.out.println("COMMANDES");
        for (Commande commande : commandes) {
            System.out.println(commande.getNumero() + " : " + ServiceFormatage.prixFormate(commande.getTotal()));
        }
    }

    /** Affiche le nombre de commandes et d'articles. */
    public void afficherStatistiques(int commandes, int articles) {
        System.out.println("Commandes : " + commandes);
        System.out.println("Articles : " + articles);
    }

    /** Affiche une liste d'articles avec leurs prix finaux. */
    public void afficherArticles(String titre, List<Article> articles) {
        System.out.println(titre);
        for (Article article : articles) {
            System.out.println("- " + article.getNom() + " : " + ServiceFormatage.prixFormate(article.getPrixFinal()));
        }
    }

    /** Affiche les quantités regroupées par nom d'article. */
    public void afficherQuantites(Map<String, Integer> quantites) {
        System.out.println("QUANTITES PAR NOM");
        for (Map.Entry<String, Integer> entree : quantites.entrySet()) {
            System.out.println("- " + entree.getKey() + " : " + entree.getValue());
        }
    }
}
