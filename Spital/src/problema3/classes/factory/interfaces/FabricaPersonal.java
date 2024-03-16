package problema3.classes.factory.interfaces;

import problema3.classes.PersonalSpital;

public interface FabricaPersonal {
    PersonalSpital creazaPersonal(String nume, String telefon, float salariu);
}