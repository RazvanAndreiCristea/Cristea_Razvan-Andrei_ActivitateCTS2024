package problema3.classes.factory.factories;

import problema3.classes.Medic;
import problema3.classes.PersonalSpital;
import problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaMedic implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Medic(nume, telefon, salariu);
    }
}