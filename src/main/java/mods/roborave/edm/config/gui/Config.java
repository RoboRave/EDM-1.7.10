package mods.roborave.edm.config.gui;
 
import cpw.mods.fml.client.config.GuiConfig;
import mods.roborave.edm.EDM;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
 
public class Config extends GuiConfig {
    public Config(GuiScreen parent) {
        super(parent,
                new ConfigElement(EDM.getVersionConfig().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
               "TestMod", false, false, GuiConfig.getAbridgedConfigPath(EDM.getVersionConfig().toString()));
    }
}