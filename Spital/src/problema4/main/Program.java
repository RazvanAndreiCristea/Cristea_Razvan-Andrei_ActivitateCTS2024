package problema4.main;

import problema4.classes.Ingredient;
import problema4.classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Ingredient> listaIngrediente = new ArrayList<>();

        listaIngrediente.add(new Ingredient(200, "Sulfat de magneziu"));
        listaIngrediente.add(new Ingredient(150, "Acid sulfuric"));
        listaIngrediente.add(new Ingredient(300, "Oxid de zinc"));
        listaIngrediente.add(new Ingredient(90, "Iodura de potasiu"));

        Reteta reteta1 = new Reteta(4, listaIngrediente);

        System.out.println(reteta1);

        Reteta reteta2 = (Reteta) reteta1.copiazaReteta();

        listaIngrediente.clear();

        listaIngrediente.add(new Ingredient(25, "Albastru de metilen"));
        listaIngrediente.add(new Ingredient(125, "Acid clorhidric"));
        listaIngrediente.add(new Ingredient(250, "Sulfat de magneziu"));

        reteta2.setValabilitateReteta(8);
        reteta2.setListaIngrediente(listaIngrediente);

        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}