package problema2.classes;

public class Rezervare {
    private int codRezervare;
    private String numePersoanaRezervare;
    private boolean hasLocLaGeam;
    private boolean hasScauneErgonomice;
    private boolean hasMasaDecorata;
    private boolean hasMuzicaAmbientalaPersonalizata;
    private boolean hasGenMuzical;

    Rezervare(int codRezervare, String numePersoanaRezervare, boolean hasLocLaGeam, boolean hasScauneErgonomice,
              boolean hasMasaDecorata, boolean hasMuzicaAmbientalaPersonalizata, boolean hasGenMuzical) {
        this.codRezervare = codRezervare;
        this.numePersoanaRezervare = numePersoanaRezervare;
        this.hasLocLaGeam = hasLocLaGeam;
        this.hasScauneErgonomice = hasScauneErgonomice;
        this.hasMasaDecorata = hasMasaDecorata;
        this.hasMuzicaAmbientalaPersonalizata = hasMuzicaAmbientalaPersonalizata;
        this.hasGenMuzical = hasGenMuzical;
    }

    void setHasLocLaGeam(boolean hasLocLaGeam) {
        this.hasLocLaGeam = hasLocLaGeam;
    }

    void setHasScauneErgonomice(boolean hasScauneErgonomice) {
        this.hasScauneErgonomice = hasScauneErgonomice;
    }

    void setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
    }

    void setHasMuzicaAmbientalaPersonalizata(boolean hasMuzicaAmbientalaPersonalizata) {
        this.hasMuzicaAmbientalaPersonalizata = hasMuzicaAmbientalaPersonalizata;
    }

    void setHasGenMuzical(boolean hasGenMuzical) {
        this.hasGenMuzical = hasGenMuzical;
    }

    @Override
    public String toString() {
        return "Codul rezervarii este: " + codRezervare
                + "\nNumele persoanei care a facut rezervarea este: " + numePersoanaRezervare
                + "\nPersoana a rezervat loc la geam: " + hasLocLaGeam
                + "\nPersoana a optat pentru scaune ergonomice: " + hasScauneErgonomice
                + "\nMasa este decorata: " + hasMasaDecorata
                + "\nPersoana doreste muzica ambientala personalizata: " + hasMuzicaAmbientalaPersonalizata
                + "\nPersoana doreste un gen muzical anume: " + hasGenMuzical + '\n';
    }
}