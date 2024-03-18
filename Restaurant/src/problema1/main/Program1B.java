package problema1.main;

import problema1.classes.Supa;
import problema1.classes.factory.factories.FabricaSupaCiuperci;
import problema1.classes.factory.factories.FabricaSupaLegume;
import problema1.classes.factory.factories.FabricaSupaMorcovi;
import problema1.classes.factory.factories.FabricaSupaVita;
import problema1.classes.factory.interfaces.FabricaSupa;

public class Program1B {
    private static void prelucrareSupa(FabricaSupa fabricaSupa, int cantitate, float pret, float calificativ) {
        Supa supa = fabricaSupa.creazaSupa(cantitate, pret, calificativ);
        supa.afisareSpecificatiiSupa();
    }

    public static void main(String[] args) {
        prelucrareSupa(new FabricaSupaLegume(), 15, 15.5f, 10);
        prelucrareSupa(new FabricaSupaCiuperci(), 10, 17.0f, 8.5f);
        prelucrareSupa(new FabricaSupaVita(), 12, 23.5f, 7.23f);
        prelucrareSupa(new FabricaSupaMorcovi(), 13, 23.5f, 9.75f);
    }
}