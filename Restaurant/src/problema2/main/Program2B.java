package problema2.main;

import problema2.classes.Rezervare;
import problema2.classes.RezervareBuilder;

public class Program2B {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder(1234, "Razvan");
        Rezervare rezervare = rezervareBuilder.setHasLocLaGeam(true).setHasGenMuzical(true)
                .setHasMasaDecorata(true).setHasScauneErgonomice(true).setHasMuzicaAmbientalaPersonalizata(true).build();

        System.out.println(rezervare);
    }
}