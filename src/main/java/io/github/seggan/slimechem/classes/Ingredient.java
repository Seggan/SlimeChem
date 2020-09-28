package io.github.seggan.slimechem.classes;

import io.github.seggan.slimechem.enums.LegacyMolecule;
import io.github.seggan.slimechem.enums.Element;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

import org.bukkit.inventory.ItemStack;


public class Ingredient {
	
	Element element;
	LegacyMolecule molecule;
	int amount;
	
	public Ingredient(Element element, int amount) {
		this.molecule = null;
		this.element = element;
		this.amount = amount;
	}
	
	public Ingredient(LegacyMolecule molecule, int amount) {
		this.molecule = molecule;
		this.element = null;
		this.amount = amount;
	}

	public Ingredient(Element element) {
		this.molecule = null;
		this.element = element;
		this.amount = 1;
	}

	public Ingredient(LegacyMolecule molecule) {
		this.molecule = molecule;
		this.element = null;
		this.amount = 1;
	}

	public Ingredient() {
		this.molecule = null;
		this.element = null;
		this.amount = 0;
	}
	
	public ItemStack getItem() {
		if (molecule != null) return SlimefunItem.getByID("MOLECULE_" + molecule.toString()).getItem();
		else if (element != null) return SlimefunItem.getByID("ELEMENT_" + element.toString()).getItem();
		else return null;
	}

}
