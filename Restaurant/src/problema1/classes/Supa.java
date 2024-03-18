package problema1.classes;

public abstract class Supa {
    private int cantitate;
    private float pret;
    private float calificativ;

    public Supa(int cantitate, float pret, float calificativ) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.calificativ = calificativ;
    }

    public int getCantitate() {
        return cantitate;
    }

    public float getPret() {
        return pret;
    }

    public float getCalificativ() {
        return calificativ;
    }

    public abstract void afisareSpecificatiiSupa();
}