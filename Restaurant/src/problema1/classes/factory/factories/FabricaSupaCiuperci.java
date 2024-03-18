package problema1.classes.factory.factories;

import problema1.classes.Supa;
import problema1.classes.SupaCiuperci;
import problema1.classes.factory.interfaces.FabricaSupa;

public class FabricaSupaCiuperci implements FabricaSupa {
    @Override
    public Supa creazaSupa(int cantitate, float pret, float calificativ) {
        return new SupaCiuperci(cantitate, pret, calificativ);
    }
}