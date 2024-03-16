package problema3.classes;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, String telefon, float salariu) {
        super(nume, telefon, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul " + getNume() + " are salariul de " + getSalariu() +
                " de lei si poate fi apelat la numarul " + getTelefon());
    }
}