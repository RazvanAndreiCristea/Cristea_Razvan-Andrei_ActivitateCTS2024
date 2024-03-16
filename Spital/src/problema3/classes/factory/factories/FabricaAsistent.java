package problema3.classes.factory.factories;

import problema3.classes.Asistent;
import problema3.classes.PersonalSpital;
import problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaAsistent implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Asistent(nume, telefon, salariu);
    }
}