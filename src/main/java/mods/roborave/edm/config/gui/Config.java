package mods.roborave.edm.config.gui;
 
import mods.roborave.edm.EDM;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.config.GuiConfig;
 
public class Config extends GuiConfig {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Config(GuiScreen parent) {
        super(parent,
                new ConfigElement(EDM.getVersionConfig().getCategory(EDM.category_version)).getChildElements(),
               "TestMod", false, false, GuiConfig.getAbridgedConfigPath(EDM.getVersionConfig().toString()));
    }
}