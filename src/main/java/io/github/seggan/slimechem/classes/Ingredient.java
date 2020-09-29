package io.github.seggan.slimechem.classes;

import io.github.seggan.slimechem.enums.Element;
import io.github.seggan.slimechem.enums.Molecule;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;


public class Ingredient {
	
	private final Element element;
	private final Molecule molecule;
	private final int amount;
	
	public Ingredient(Element element, int amount) {
		this.molecule = null;
		this.element = element;
		this.amount = amount;
	}
	
	public Ingredient(Molecule molecule, int amount) {
		this.molecule = molecule;
		this.element = null;
		this.amount = amount;
	}

	public Ingredient(Element element) {
		this.molecule = null;
		this.element = element;
		this.amount = 1;
	}

	public Ingredient(Molecule molecule) {
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
		if (isMolecule()) return SlimefunItem.getByID("MOLECULE_" + molecule.toString()).getItem();
		else return SlimefunItem.getByID("ELEMENT_" + element.toString()).getItem();
	}

	public Molecule getMolecule() {
		return molecule;
	}

	public Element getElement() {
		return element;
	}

	public int getAmount() {
		return amount;
	}

	public boolean isMolecule() {
		return molecule != null;
	}

}
