package models;

/** Fourni : ne pas modifier. */
public enum SupplementDessert {
    CHOCOLAT(0.70), 
    CARAMEL(0.50), 
    CHANTILLY(1.00);

    private final double prix;

    SupplementDessert(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }
}
