package io.github.seggan.slimechem.enums;

public enum PeriodicTable {

	HYDROGEN("H", 1),
	CARBON("C", 6),
	OXYGEN("O", 8),
	MAGNESIUM("Mg", 12),
	ALUMINUM("Al", 13),
	SILICON("Si", 14),
	PHOSPHORUS("P", 15),
	SULFUR("S", 16),
	VANADIUM("V", 23),
	CHROMIUM("Cr", 24),
	IRON("Fe", 26),
	COBALT("Co", 27),
	NICKEL("Ni", 28),
	COPPER("Cu", 29),
	ZINC("Zn", 30),
	SILVER("Ag", 47),
	TIN("Sn", 50),
	GOLD("Au", 79),
	LEAD("Pb", 82),
	URANIUM("U", 92);
	
	private final String element;
	private final int atomicNumber;
	
	PeriodicTable(String formula, int number) {
		this.element = formula;
		atomicNumber = number;
	}

	public String getName() {
		return element;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

}
