package models;

/** Types de boissons disponibles à la vente. */
public enum TypeBoisson {
    COCA("Coca"),
    ICE_TEA("Ice Tea"),
    EAU("Eau");

    private final String libelle;

    TypeBoisson(String libelle) {
        this.libelle = libelle;
    }

    /** @return le libellé d'affichage du type */
    public String getLibelle() {
        return libelle;
    }
}
