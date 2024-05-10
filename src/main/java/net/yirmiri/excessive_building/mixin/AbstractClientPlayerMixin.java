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

import java.util.List;

@Mixin(AbstractClientPlayer.class)
public abstract class AbstractClientPlayerMixin extends Player {
    //Capes For devs, contributors, and supporters of Excessive Building
    private static final List<String> AZURUNE = List.of("1cedf927-5c8f-4650-95e9-808fc8f94d00", "bd35c402-fa9c-4d00-afe6-b4ed9ebe90c4"); //Developers
    private static final List<String> BEETROOT = List.of("9778ff53-d83d-4233-8fa6-8aab7b89c4c0"); //Special thank you for helping me with some assets at a very low point
    private static final List<String> DEMONHEART = List.of("c12df14d-24ed-4247-84e8-e10c111237df"); //Special thank you for helping me with some assets at a very low point
    private static final List<String> DICE = List.of("3fd1d511-62d6-4e18-a28d-3e3d4fd93620"); //Helped out with dyed blocks & datagen shenanigans
    private static final List<String> HEX = List.of("452ec9e4-a4f8-4edf-bd3c-ab3d7b751359"); //j++
    private static final List<String> FUDGE_SUNDAE = List.of("7a6a8c68-8b73-47f6-b08f-0dde5f1848dd"); //This guy should not have a cape
    private static final List<String> RU_RU_TRANSLATORS = List.of("27da47ed-a98a-45de-8d2f-eaa103dfbef6"); //Russian Translators
    private static final List<String> UK_UA_TRANSLATORS = List.of("f7ab161c-7370-4ec2-9bf5-8f5d37eb91f6"); //Ukrainian Translators
    private static final List<String> CONTRIBUTORS = List.of(); //Contributors
    private static final List<String> SUPPORTERS = List.of(); //Supporters

    public AbstractClientPlayerMixin(Level level, BlockPos pos, float v, GameProfile profile) {
        super(level, pos, v, profile);
    }

    @Inject(method = "getCloakTextureLocation", at = @At(value = "HEAD"), cancellable = true)
    public void getCloakTextureLocation(CallbackInfoReturnable<ResourceLocation> cir) {
        if (AZURUNE.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/azurune.png"));
        if (BEETROOT.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/beetroot.png"));
        if (DEMONHEART.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/demonheart.png"));
        if (DICE.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/dice.png"));
        if (HEX.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/hex.png"));
        if (FUDGE_SUNDAE.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/fudge_sundae.png"));
        if (RU_RU_TRANSLATORS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors_ru_ru.png"));
        if (UK_UA_TRANSLATORS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors_uk_ua.png"));
        if (CONTRIBUTORS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors.png"));
        if (SUPPORTERS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_supporters.png"));
    }
}