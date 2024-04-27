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
    private static final List<String> COTTON_CANDY = List.of("66a11b55-08c2-4765-b618-3071dc222b64"); //Knitted wool artist + LIKE MORE BLOCKS I THINK
    private static final List<String> FUDGE_SUNDAE = List.of("7a6a8c68-8b73-47f6-b08f-0dde5f1848dd"); //This guy should not have a cape
    private static final List<String> HEX = List.of("452ec9e4-a4f8-4edf-bd3c-ab3d7b751359"); //j++
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
        if (COTTON_CANDY.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/cotton_candy.png"));
        if (FUDGE_SUNDAE.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/fudge_sundae.png"));
        if (HEX.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/hex.png"));
        if (RU_RU_TRANSLATORS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors_ru_ru.png"));
        if (UK_UA_TRANSLATORS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors_uk_ua.png"));
        if (CONTRIBUTORS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_contributors.png"));
        if (SUPPORTERS.contains(stringUUID)) cir.setReturnValue(new ResourceLocation(ExcessiveBuilding.MODID, "textures/capes/eb_supporters.png"));
    }
}