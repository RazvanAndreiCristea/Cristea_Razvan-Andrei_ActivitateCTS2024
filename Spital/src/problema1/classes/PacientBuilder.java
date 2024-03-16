package problema1.classes;

import problema1.interfaces.Builder;

public class PacientBuilder implements Builder {
    private Pacient pacient;

    public PacientBuilder(String nume, int varsta) {
        pacient = new Pacient(nume, varsta, false, false, false, false);
    }

    public PacientBuilder setHasPatRabatabil(final boolean hasPatRabatabil) {
        this.pacient.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }

    public PacientBuilder setHasMicDejunInclus(final boolean hasMicDejunInclus) {
        this.pacient.setHasMicDejunInclus(hasMicDejunInclus);
        return this;
    }

    public PacientBuilder setHasPapuci(final boolean hasPapuci) {
        this.pacient.setHasPapuci(hasPapuci);
        return this;
    }

    public PacientBuilder setHasHalat(final boolean hasHalat) {
        this.pacient.setHasHalat(hasHalat);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}