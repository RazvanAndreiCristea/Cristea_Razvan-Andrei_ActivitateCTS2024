package problema3.main;

import problema3.classes.Supa;
import problema3.classes.factory.FabricaSupa;
import problema3.classes.factory.TipSupa;

public class Program3B {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa();

        try {
            Supa supaCiuperci = fabricaSupa.creazaSupa(TipSupa.CIUPERCI, 10, 17.0f, 8.5f);
            Supa supaLegume = fabricaSupa.creazaSupa(TipSupa.LEGUME, 15, 15.5f, 10);
            Supa supaVita = fabricaSupa.creazaSupa(TipSupa.VITA, 12, 23.5f, 7.23f);

            supaCiuperci.afisareSpecificatiiSupa();
            supaLegume.afisareSpecificatiiSupa();
            supaVita.afisareSpecificatiiSupa();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}