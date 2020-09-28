package io.github.seggan.slimechem.classes;

import java.util.Arrays;
import java.util.List;

public class Combination {
	
	public List<Ingredient> ingredients;
	
	public Combination(Ingredient... ingredients) {
		this.ingredients = Arrays.asList(ingredients);
	}
}
