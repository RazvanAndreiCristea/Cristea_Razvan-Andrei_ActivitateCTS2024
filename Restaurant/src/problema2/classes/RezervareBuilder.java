package problema2.classes;

import problema2.interfaces.Builder;

public class RezervareBuilder implements Builder {
    private Rezervare rezervare;

    public RezervareBuilder(int codRezervare, String numePersoanaRezervare) {
        rezervare = new Rezervare(codRezervare, numePersoanaRezervare, false, false, false, false, false);
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }

    public RezervareBuilder setHasLocLaGeam(boolean hasLocLaGeam) {
        rezervare.setHasLocLaGeam(hasLocLaGeam);
        return this;
    }

    public RezervareBuilder setHasScauneErgonomice(boolean hasScauneErgonomice) {
        rezervare.setHasScauneErgonomice(hasScauneErgonomice);
        return this;
    }

    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        rezervare.setHasMasaDecorata(hasMasaDecorata);
        return this;
    }

    public RezervareBuilder setHasMuzicaAmbientalaPersonalizata(boolean hasMuzicaAmbientalaPersonalizata) {
        rezervare.setHasMuzicaAmbientalaPersonalizata(hasMuzicaAmbientalaPersonalizata);
        return this;
    }

    public RezervareBuilder setHasGenMuzical(boolean hasGenMuzical) {
        rezervare.setHasGenMuzical(hasGenMuzical);
        return this;
    }
}