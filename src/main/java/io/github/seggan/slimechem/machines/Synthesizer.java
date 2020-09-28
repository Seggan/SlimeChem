package io.github.seggan.slimechem.machines;

import io.github.seggan.slimechem.SlimeChem;
import io.github.seggan.slimechem.classes.Combination;
import io.github.seggan.slimechem.lists.Categories;
import io.github.seggan.slimechem.lists.Items;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Synthesizer extends MultiBlockMachine {
    public static final RecipeType RECIPE_TYPE = new RecipeType(
        new NamespacedKey(SlimeChem.getInstance(), "synthesizer"),
        Items.SYNTHESIZER,
        "",
        "Synthesizes different chemicals"
    );
    public Synthesizer() {
        super(Categories.SLIMECHEM, Items.SYNTHESIZER, new ItemStack[]{
            null, null, null,
            null, new ItemStack(Material.BREWING_STAND), null,
            new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DISPENSER), new ItemStack(Material.DIAMOND_BLOCK)
        }, new ItemStack[0], BlockFace.SELF);
    }

    @Override
    public void onInteract(Player player, Block block) {

    }

    private boolean canCraft(Inventory inv) {
        for (Combination combination : )
    }
}
