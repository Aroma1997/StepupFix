package aroma1997.stepupfix;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

/**
 * Hook class. Call inserted into bytecode via asm.
 * Do not change method names.
 *
 * @author Aroma1997
 */
public class StepupHooks {

	/**
	 * Will be called once a tick.
	 *
	 * @return always false to prevent minecraft of doing their own autojump.
	 */
	public static boolean isAutojumpOn(EntityPlayerSP player) {
		if (Minecraft.getMinecraft().gameSettings.autoJump && !player.isSneaking()) {
			player.stepHeight = 1.2f;

			//TODO: Stop sprinting, when the player runs into something.
		} else {
			player.stepHeight = 0.6f;
		}
		return false;
	}

}
