package io.github.seggan.slimechem.lists;

import io.github.seggan.slimechem.SlimeChem;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Categories {
    public static final Category SLIMECHEM = new Category(
        new NamespacedKey(SlimeChem.getInstance(), "slimechem_general"),
        new CustomItem(Material.BREWING_STAND, "SlimeChem")
    );
    public static final Category ELEMENTS = new Category(
        new NamespacedKey(SlimeChem.getInstance(), "slimechem_elements"),
        new CustomItem(Material.HONEY_BOTTLE, "SlimeChem Elements")
    );
    public static final Category MOLECULES = new Category(
        new NamespacedKey(SlimeChem.getInstance(), "slimechem_molecules"),
        new CustomItem(Material.EXPERIENCE_BOTTLE, "SlimeChem Molecules")
    );
}
