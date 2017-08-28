package aroma1997.stepupfix;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.SortingIndex;

/**
 * SortingIndex to make sure, we load after Aroma1997Core
 *
 * @author Aroma1997
 */
@SortingIndex(100)
public class StepupfixCore implements IFMLLoadingPlugin {

	@Override
	public String[] getASMTransformerClass() {
		return null;
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {

	}

	@Override
	public String getAccessTransformerClass() {
		//The transformer is returned as an Access transformer rather than a normal ASM transformer to make
		//sure, it's registered after the Deobfuscation transformer. Otherwise, it wouldn't find the correct method.
		return "aroma1997.stepupfix.StepupClientTransformer";
	}

}
