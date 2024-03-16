package problema1.classes;

public class Pacient {
    private String nume;
    private int varsta;
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuci;
    private boolean hasHalat;

    Pacient(String nume, int varsta, boolean hasPatRabatabil, boolean hasMicDejunInclus, boolean hasPapuci, boolean hasHalat) {
        super();
        this.nume = nume;
        this.varsta = varsta;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejunInclus = hasMicDejunInclus;
        this.hasPapuci = hasPapuci;
        this.hasHalat = hasHalat;
    }

    void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    void setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
    }

    void setHasPapuci(boolean hasPapuci) {
        this.hasPapuci = hasPapuci;
    }

    void setHasHalat(boolean hasHalat) {
        this.hasHalat = hasHalat;
    }

    @Override
    public String toString() {
        return "Numele pacientului este: " + nume
                + "\nVarsta pacientului este: " + varsta
                + "\nAre pacient rabatabil " + hasPatRabatabil
                + "\nAre mic dejun inclus: " + hasMicDejunInclus
                + "\nAre papuci de camera: " + hasPapuci
                + "\nAre halat: " + hasHalat + '\n';
    }
}