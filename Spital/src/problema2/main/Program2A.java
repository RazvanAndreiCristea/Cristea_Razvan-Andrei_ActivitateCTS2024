package problema2.main;

import problema2.classes.PersonalSpital;
import problema2.classes.factory.FabricaPersonal;
import problema2.classes.factory.TipPersonal;

public class Program2A {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();

        try {
            PersonalSpital asistent = fabricaPersonal.creazaPersonal(TipPersonal.ASISTENT, "Ionescu", "0774561235", 5500);
            PersonalSpital brancardier = fabricaPersonal.creazaPersonal(TipPersonal.BRACARDIER, "Anghel", "072158183", 7000);
            PersonalSpital medic = fabricaPersonal.creazaPersonal(TipPersonal.MEDIC, "Tulin", "07334256285", 10000);

            asistent.afisareDetalii();
            brancardier.afisareDetalii();
            medic.afisareDetalii();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}