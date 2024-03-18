package problema1.classes.factory.factories;

import problema1.classes.Supa;
import problema1.classes.SupaVita;
import problema1.classes.factory.interfaces.FabricaSupa;

public class FabricaSupaVita implements FabricaSupa {
    @Override
    public Supa creazaSupa(int cantitate, float pret, float calificativ) {
        return new SupaVita(cantitate, pret, calificativ);
    }
}