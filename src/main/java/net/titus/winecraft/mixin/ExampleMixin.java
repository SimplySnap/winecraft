package net.titus.winecraft.mixin;

import net.titus.winecraft.WineCraft;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V") //V is meant to be there lol
	private void init(CallbackInfo info) {
		WineCraft.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
