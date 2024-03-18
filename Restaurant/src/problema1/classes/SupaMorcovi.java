package problema1.classes;

public class SupaMorcovi extends Supa {
    public SupaMorcovi(int cantitate, float pret, float calificativ) {
        super(cantitate, pret, calificativ);
    }

    @Override
    public void afisareSpecificatiiSupa() {
        System.out.println("Supa de morcovi costa " + getPret() + " lei," +
                "a primit din partea clientilor restaurantului nota " + getCalificativ()
                + " si exista in restaurant o cantitate de " + getCantitate() + " litrii de astfel de supa\n");
    }
}
