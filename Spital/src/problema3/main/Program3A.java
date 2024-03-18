package problema3.main;

import problema3.classes.PersonalSpital;
import problema3.classes.factory.factories.FabricaAsistent;
import problema3.classes.factory.factories.FabricaBrancardier;
import problema3.classes.factory.factories.FabricaInfirmier;
import problema3.classes.factory.factories.FabricaMedic;
import problema3.classes.factory.interfaces.FabricaPersonal;

public class Program3A {
    private static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, String telefon, float salariu) {
        PersonalSpital personalSpital = fabricaPersonal.creazaPersonal(nume, telefon, salariu);
        personalSpital.afisareDetalii();
    }

    public static void main(String[] args) {
        prelucrarePersonal(new FabricaAsistent(), "Georgescu", "0774674987", 6500);
        prelucrarePersonal(new FabricaBrancardier(), "Angelescu", "0773516887", 5500);
        prelucrarePersonal(new FabricaMedic(), "Popescu", "0721685991", 9500);
        prelucrarePersonal(new FabricaInfirmier(), "Badescu", "0723421235", 7500);
    }
}