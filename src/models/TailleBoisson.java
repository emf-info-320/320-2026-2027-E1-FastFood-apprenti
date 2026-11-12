package models;


/** Tailles disponibles pour une boisson, exprimées en décilitres. */
public enum TailleBoisson {
    PETITE(3), 
    MOYENNE(4), 
    GRANDE(5);

    private final int volumeDl;

    TailleBoisson(int volumeDl) {
        this.volumeDl = volumeDl;
    }

    /** @return le volume de la taille en décilitres */
    public int getVolumeDl() {
        return volumeDl;
    }
}
