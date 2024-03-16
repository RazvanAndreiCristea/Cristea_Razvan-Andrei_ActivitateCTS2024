package problema3.classes.factory.factories;

import problema3.classes.Brancardier;
import problema3.classes.PersonalSpital;
import problema3.classes.factory.interfaces.FabricaPersonal;

public class FabricaBrancardier implements FabricaPersonal {
    @Override
    public PersonalSpital creazaPersonal(String nume, String telefon, float salariu) {
        return new Brancardier(nume, telefon, salariu);
    }
}