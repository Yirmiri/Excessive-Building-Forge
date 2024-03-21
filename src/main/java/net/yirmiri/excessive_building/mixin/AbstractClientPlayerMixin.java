package net.yirmiri.excessive_building.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayer.class)
public abstract class AbstractClientPlayerMixin extends Player {
    public AbstractClientPlayerMixin(Level level, BlockPos pos, float v, GameProfile profile) {
        super(level, pos, v, profile);
    }

    @Inject(method = "getCloakTextureLocation", at = @At(value = "HEAD"), cancellable = true)
    public void getCloakTextureLocation(CallbackInfoReturnable<ResourceLocation> cir) {
        String username = this.getDisplayName().getString();
        if (ExcessiveBuilding.AZURUNE.contains(username)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/azurune.png"));
        if (ExcessiveBuilding.RU_RU_TRANSLATORS.contains(username)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors_ru_ru.png"));
        if (ExcessiveBuilding.UK_UA_TRANSLATORS.contains(username)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors_uk_ua.png"));
        if (ExcessiveBuilding.CONTRIBUTORS.contains(username)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors.png"));
        if (ExcessiveBuilding.SUPPORTERS.contains(username)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_supporters.png"));
    }
}
