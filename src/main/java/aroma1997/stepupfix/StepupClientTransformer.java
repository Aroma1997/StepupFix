package aroma1997.stepupfix;

import aroma1997.core.coremod.asm.CallHookInsertionTransformer;

public class StepupClientTransformer extends CallHookInsertionTransformer {

	public StepupClientTransformer() {
		super("aroma1997.stepupfix.StepupHooks", true);
		addClass("net.minecraft.client.entity.EntityPlayerSP");
		addMethodHook("func_189809_N", "isAutojumpOn");
	}

}
