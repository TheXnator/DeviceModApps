package thexnator.computerapps;

import com.mrcrayfish.device.api.ApplicationManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import thexnator.computerapps.apps.ApplicationMineMessenger;
import thexnator.computerapps.apps.ApplicationMineazon;
import thexnator.computerapps.apps.ApplicationWebcam;

@Mod(modid = ComputerApps.MODID, version = ComputerApps.VERSION, acceptedMinecraftVersions = "[1.8.9,)", dependencies = "required-after:cdm@[1.0,)")
public class ComputerApps
{
	public static final String MODID = "xnatorapps";
	public static final String VERSION = "1.0";
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		ApplicationManager.registerApplication(new ApplicationMineMessenger());
		ApplicationManager.registerApplication(new ApplicationWebcam());
		ApplicationManager.registerApplication(new ApplicationMineazon());
	}
}
