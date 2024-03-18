package problema4.classes;

public class Ingredient {
    private int cantitate;
    private String denumire;

    public Ingredient(int cantitate, String denumire) {
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Denumirea ingredientului este: " +
                denumire + "\nCantitatea folosita este de: " +
                cantitate + " grame\n";
    }
}