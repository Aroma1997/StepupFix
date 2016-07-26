package aroma1997.stepupfix;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

/**
 * Hook class. Call inserted into bytecode via asm.
 * Do not change method names.
 * @author Aroma1997
 *
 */
public class StepupHooks {

	public static boolean isAutojumpOn(EntityPlayerSP player) {
		if (Minecraft.getMinecraft().gameSettings.field_189989_R && !player.isSneaking()) {
			player.stepHeight = 1.2f;
		} else {
			player.stepHeight = 0.6f;
		}
		return false;
	}

}
