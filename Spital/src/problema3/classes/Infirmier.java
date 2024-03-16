package problema3.classes;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, String telefon, float salariu) {
        super(nume, telefon, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Infirmierul " + getNume() + " are salariul de " + getSalariu() +
                " de lei si poate fi apelat la numarul " + getTelefon());
    }
}