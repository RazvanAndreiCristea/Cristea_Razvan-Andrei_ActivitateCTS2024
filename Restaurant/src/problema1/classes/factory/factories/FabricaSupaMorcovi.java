package problema1.classes.factory.factories;

import problema1.classes.Supa;
import problema1.classes.SupaMorcovi;
import problema1.classes.factory.interfaces.FabricaSupa;

public class FabricaSupaMorcovi implements FabricaSupa {
    @Override
    public Supa creazaSupa(int cantitate, float pret, float calificativ) {
        return new SupaMorcovi(cantitate, pret, calificativ);
    }
}