package problema1.classes.factory.interfaces;

import problema1.classes.Supa;

public interface FabricaSupa {
    Supa creazaSupa(int cantitate, float pret, float calificativ);
}