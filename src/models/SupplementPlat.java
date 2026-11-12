package models;

/** Fourni : ne pas modifier. */
public enum SupplementPlat {
    FROMAGE(1.00),
    POULET(2.00),
    SAUCE(0.50);

    private final double prix;

    SupplementPlat(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }
}
