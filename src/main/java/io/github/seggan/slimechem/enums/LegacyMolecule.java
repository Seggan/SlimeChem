package io.github.seggan.slimechem.enums;

public enum LegacyMolecule {
	
	WATER("H" + SubNums.TWO + "O"),
	CARBON_DIOXIDE("CO" + SubNums.TWO),
	SULFATE("SO" + SubNums.FOUR),
	CARBONATE("CO" + SubNums.THREE),
	HYDROXIDE("OH"),
	CELLULOSE("C" + SubNums.SIX + "H" + SubNums.ONE + SubNums.ZERO + "O" + SubNums.FIVE),
	LAZURITE("Na" + SubNums.EIGHT + "AlSiO" + SubNums.FOUR + "SO" + SubNums.FOUR),
	SODALITE("Na" + SubNums.EIGHT + "(AlSiO" + SubNums.FOUR + ")" + SubNums.SIX + "Cl" + SubNums.TWO),
	NOSELITE("Na" + SubNums.EIGHT + "(AlSiO" + SubNums.FOUR + ")" + SubNums.SIX + "SO" + SubNums.FOUR),
	PYRITE("FeS" + SubNums.TWO),
	SERINE("C" + SubNums.THREE + "H" + SubNums.SEVEN + "NO" + SubNums.THREE),
	GLYCINE("C" + SubNums.TWO + "H" + SubNums.FIVE + "NO" + SubNums.TWO),
	ALANINE("C" + SubNums.THREE + "H" + SubNums.SEVEN + "NO" + SubNums.TWO),
	FIBROIN("C" + SubNums.TWO + "H" + SubNums.FIVE + "NO" + SubNums.TWO + "C" + SubNums.THREE + "H" + SubNums.SEVEN + "NO" + SubNums.THREE + "C" + SubNums.TWO + "H" + SubNums.FIVE + "NO" + SubNums.TWO + "C" + SubNums.THREE + "H" + SubNums.SEVEN + "NO" + SubNums.TWO + "C" + SubNums.TWO + "H" + SubNums.FIVE + "NO" + SubNums.TWO + "C" + SubNums.THREE + "H" + SubNums.SEVEN + "NO" + SubNums.TWO),
	PANTHERINE("C" + SubNums.FOUR + "H" + SubNums.SIX + "N" + SubNums.TWO + "O" + SubNums.TWO),
	TRINITROTOLUENE("C" + SubNums.SIX + "H" + SubNums.TWO + "(NO" + SubNums.TWO + ")" + SubNums.THREE + "C" + SubNums.SEVEN + "H" + SubNums.EIGHT),
	KERATIN("C" + SubNums.FOUR + "H" + SubNums.NINE + "NO" + SubNums.THREE + "C" + SubNums.THREE + "H" + SubNums.SEVEN + "NO" + SubNums.TWO + "SC" + SubNums.FIVE + "H" + SubNums.NINE + "NO" + SubNums.TWO + "C" + SubNums.FOUR + "H" + SubNums.NINE + "NO" + SubNums.THREE + "C" + SubNums.FIVE + "H" + SubNums.NINE + "NO" + SubNums.TWO + "C" + SubNums.THREE + "H" + SubNums.SEVEN + "NO" + SubNums.TWO + "SC"+ SubNums.FIVE + "H" + SubNums.NINE + "NO" + SubNums.TWO),
	MESCALINE("C" + SubNums.ONE + SubNums.ONE + "H" + SubNums.ONE + SubNums.SEVEN + "NO" + SubNums.THREE),
	CUCURBITACIN("C" + SubNums.THREE + SubNums.ZERO + "H" + SubNums.FOUR + SubNums.TWO + "O" + SubNums.SEVEN),
	FINGOLIMOD("C" + SubNums.ONE + SubNums.NINE + "H" + SubNums.THREE + SubNums.THREE + "NO" + SubNums.TWO),
	HYDROXYLAPATITE("CA" + SubNums.FIVE + "(PO" + SubNums.FOUR + ")" + SubNums.THREE + "OH"),
	BERYL("Be" + SubNums.THREE + "Al" + SubNums.TWO + "(SiO" + SubNums.THREE + ")" + SubNums.SIX),
	KAOLINITE("Al" + SubNums.TWO + "Si" + SubNums.TWO + "O" + SubNums.FIVE + "(OH)" + SubNums.FOUR),
	
	MAGNESIUM_CARBONATE("MgCO" + SubNums.THREE),
	IRON_OXIDE("Fe" + SubNums.TWO + "O" + SubNums.THREE),
	MAGNESIUM_OXIDE("MgO"),
	SILICON_DIOXIDE("SiO" + SubNums.TWO),
	COPPER_SULFATE("CuSO" + SubNums.FOUR),
	ALUMINUM_OXIDE("Al" + SubNums.TWO + "O" + SubNums.THREE),
	CALCIUM_CARBONATE("CaCO" + SubNums.THREE),
	SHIKIMIC_ACID("C" + SubNums.SEVEN + "H" + SubNums.ONE + SubNums.ZERO + "O" + SubNums.FIVE),
	ASPARTIC_ACID("C" + SubNums.FOUR + "H" + SubNums.SEVEN + "NO" + SubNums.FOUR),
	COBALT_NITRATE("CO(NO" + SubNums.THREE + ")" + SubNums.TWO),
	GALLIUM_ARSENIDE("GaAs"),
	CARBON_NANOTUBES("C" + SubNums.SIX + SubNums.FOUR + "C" + SubNums.SIX + SubNums.FOUR + "C" + SubNums.SIX + SubNums.FOUR + "C" + SubNums.SIX + SubNums.FOUR);
	
	String element;
	
	private LegacyMolecule(String formula) {
		this.element = formula;
	}

	public String getName() {
		return element;
	}

}
