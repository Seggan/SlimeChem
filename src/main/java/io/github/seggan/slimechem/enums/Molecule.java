package io.github.seggan.slimechem.enums;

import io.github.seggan.slimechem.classes.Ingredient;

import java.util.ArrayList;
import java.util.List;

public enum Molecule {
    WATER("h,2;o,1", "H", SubNums.TWO, "O");

    private final String formula;
    private final List<Ingredient> composition = new ArrayList<>();

    Molecule(String stringComposition, String... formula) {
        this.formula = String.join("", formula);
        for (String pair : stringComposition.split(";")) {
            String[] split = pair.split(",");
            composition.add(new Ingredient(Element.getByAbbr(split[0]), Integer.parseInt(split[1])));
        }
    }

    public String getFormula(){
        return formula;
    }

    public List<Ingredient> getComposition() {
        return composition;
    }
}
