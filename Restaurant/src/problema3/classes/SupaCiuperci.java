package problema3.classes;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(int cantitate, float pret, float calificativ) {
        super(cantitate, pret, calificativ);
    }

    @Override
    public void afisareSpecificatiiSupa() {
        System.out.println("Supa de ciuperci costa " + getPret() + " lei," +
                "a primit din partea clientilor restaurantului nota " + getCalificativ()
                + " si exista in restaurant o cantitate de " + getCantitate() + " litrii de astfel de supa\n");
    }
}