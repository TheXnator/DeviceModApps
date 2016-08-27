package thexnator.computerapps.apps;

import java.awt.Color;

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Component;
import com.mrcrayfish.device.api.app.Layout;
import com.mrcrayfish.device.api.app.component.Button;
import com.mrcrayfish.device.api.app.component.TextArea;
import com.mrcrayfish.device.api.app.component.TextField;
import com.mrcrayfish.device.api.app.listener.ClickListener;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.nbt.NBTTagCompound;
import thexnator.computerapps.ComputerApps;

public class ApplicationWebcam extends Application
{
	public ApplicationWebcam() 
	{
		super(ComputerApps.MODID + "webcam", "Webcam (Testing)");
	}
	
	@Override
	public void init(int x, int y) 
	{
		Layout main = new Layout();
		
		
		
		setCurrentLayout(main);
	}

	@Override
	public void load(NBTTagCompound tagCompound) 
	{
		
	}

	@Override
	public void save(NBTTagCompound tagCompound) 
	{
		
	}
}
