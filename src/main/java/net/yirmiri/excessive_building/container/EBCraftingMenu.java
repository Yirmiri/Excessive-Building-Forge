package net.yirmiri.excessive_building.container;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.Block;

public class EBCraftingMenu extends CraftingMenu {

    private final ContainerLevelAccess access;
    private final Block block;

    public EBCraftingMenu(int id, Inventory playerInventoryIn, Block blockIn) {
        this(id, playerInventoryIn, ContainerLevelAccess.NULL, blockIn);
    }

    public EBCraftingMenu(int aSuper, Inventory inv, ContainerLevelAccess containerLevelAccess, Block blockIn) {
        super(aSuper, inv, containerLevelAccess);
        this.access = containerLevelAccess;
        this.block = blockIn;
    }

    @Override
    public boolean stillValid(Player playerIn) {
        return stillValid(this.access, playerIn, block);
    }
}
