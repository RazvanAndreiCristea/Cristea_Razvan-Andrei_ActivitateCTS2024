package problema4.classes;

import problema4.interfaces.PrototipContClient;

public class ContClient implements PrototipContClient {
    private String nume;
    private String email;
    private int varsta;

    ContClient() {
        this.varsta = 0;
        this.nume = null;
        this.email = null;
    }

    public ContClient(String nume, String email, int varsta) {
        this.nume = nume;
        this.email = email;
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Numele clientului este: " + nume
                + "\nAdresa de email este: " + email
                + "\nVarsta clientului este: " + varsta + '\n';
    }

    @Override
    public PrototipContClient copiazaCont() {
        ContClient copieContClient = new ContClient();

        copieContClient.nume = this.nume;
        copieContClient.email = this.email;
        copieContClient.varsta = this.varsta;

        return copieContClient;
    }
}