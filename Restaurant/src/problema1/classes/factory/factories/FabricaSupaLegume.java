package problema1.classes.factory.factories;

import problema1.classes.Supa;
import problema1.classes.SupaLegume;
import problema1.classes.factory.interfaces.FabricaSupa;

public class FabricaSupaLegume implements FabricaSupa {
    @Override
    public Supa creazaSupa(int cantitate, float pret, float calificativ) {
        return new SupaLegume(cantitate, pret, calificativ);
    }
}