package problema2.classes;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, String telefon, float salariu) {
        super(nume, telefon, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul " + getNume() + " are salariul de " + getSalariu() +
                " de lei si poate fi apelat la numarul " + getTelefon());
    }
}