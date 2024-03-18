package problema4.classes;

import problema4.interfaces.PrototipReteta;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements PrototipReteta {
    private int valabilitateReteta;
    private List<Ingredient> listaIngrediente;

    Reteta() {
        this.valabilitateReteta = 0;
        this.listaIngrediente = new ArrayList<>();
    }

    public Reteta(int valabilitateReteta, List<Ingredient> listaIngrediente) {
        this.valabilitateReteta = valabilitateReteta;
        this.listaIngrediente = new ArrayList<>(listaIngrediente);
    }

    public void setValabilitateReteta(int valabilitateReteta) {
        this.valabilitateReteta = valabilitateReteta;
    }

    public void setListaIngrediente(List<Ingredient> listaIngrediente) {
        this.listaIngrediente = new ArrayList<>(listaIngrediente);
    }

    @Override
    public String toString() {
        return "Ingredientele retetei sunt:\n" +
                listaIngrediente + "\nValabilitatea retetei este de " +
                valabilitateReteta + " zile\n";
    }

    @Override
    public PrototipReteta copiazaReteta() {
        Reteta copieReteta = new Reteta();

        copieReteta.valabilitateReteta = this.valabilitateReteta;
        copieReteta.listaIngrediente.addAll(this.listaIngrediente);

        return copieReteta;
    }
}