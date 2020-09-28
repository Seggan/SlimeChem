package io.github.seggan.slimechem.lists;


import org.bukkit.Material;

import java.util.Arrays;
import java.util.List;

public enum MoreTags {
    STAINED_GLASS_PANES(Material.BLACK_STAINED_GLASS_PANE, Material.BLUE_STAINED_GLASS_PANE);

    private List<Material> items;

    MoreTags(Material... items) {
        this.items.addAll(Arrays.asList(items));
    }
}
