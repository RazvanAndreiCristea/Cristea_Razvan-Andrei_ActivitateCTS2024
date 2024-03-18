package problema3.classes.factory;

import problema3.classes.Supa;
import problema3.classes.SupaCiuperci;
import problema3.classes.SupaLegume;
import problema3.classes.SupaVita;

public class FabricaSupa {
    public Supa creazaSupa(TipSupa tipSupa, int cantitate, float pret, float calificativ) throws Exception {
        switch (tipSupa) {
            case CIUPERCI -> {
                return new SupaCiuperci(cantitate, pret, calificativ);
            }

            case LEGUME -> {
                return new SupaLegume(cantitate, pret, calificativ);
            }

            case VITA -> {
                return new SupaVita(cantitate, pret, calificativ);
            }

            default -> throw new Exception("Supa nu exista in meniul restaurantului\n");
        }
    }
}