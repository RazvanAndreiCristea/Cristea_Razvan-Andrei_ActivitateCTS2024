package problema3.classes.factory.factories;

import problema3.classes.Infirmier;
import problema3.classes.PersonalSpital;
import problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaInfirmier implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Infirmier(nume, telefon, salariu);
    }
}