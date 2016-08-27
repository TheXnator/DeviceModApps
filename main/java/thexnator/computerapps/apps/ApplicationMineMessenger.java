package thexnator.computerapps.apps;

import java.awt.Color;

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Component;
import com.mrcrayfish.device.api.app.Layout;
import com.mrcrayfish.device.api.app.component.Button;
import com.mrcrayfish.device.api.app.component.TextArea;
import com.mrcrayfish.device.api.app.component.TextField;
import com.mrcrayfish.device.api.app.listener.ClickListener;
import com.mrcrayfish.device.api.task.Callback;
import com.mrcrayfish.device.api.task.Task;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import thexnator.computerapps.ComputerApps;

public class ApplicationMineMessenger extends Application
{
	private TextArea messages;
	private String text;
	private int chatTimer = 25;
	private boolean timerDecrement = false;
	
	public ApplicationMineMessenger() 
	{
		super(ComputerApps.MODID + "chatapp", "Mine Messenger (WIP)");
		icon = new ResourceLocation("xa", "icons/chatapp.png");
	}
	
	@Override
	public void init(int x, int y) 
	{
		Layout main = new Layout();
		
		//Messages Recieved
		messages = new TextArea(x, y, 5, 5, 190, 70);
		messages.setBorderColour(Color.GREEN);
		
		//Send Messages (Text)
		final TextField message = new TextField(x, y, 5, 80, 160);
		
		//Send Messages (Button)
		Button send = new Button("Send", x, y, 170, 80, 30, 15);
		send.setClickListener(new ClickListener() 
		{
			@Override
			public void onClick(Component c, int mouseButton)
			{
				if(mouseButton == 0)
				{
					EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;
					String text = message.getText();
					if(text != "" || text != " ")
					{
						timerDecrement = true;
						messages.writeText("[" + player.getName() + "] " + text + "\n");
					}
					message.clear();
					markDirty();
				}
			}
		});
		
		//Adding Components
		main.addComponent(messages);
		main.addComponent(message);
		main.addComponent(send);
		
		setCurrentLayout(main);
	}
	
	@Override
	public void onTick() 
	{
		super.onTick();
		if(chatTimer <= 0)
		{
			chatTimer = 25;
			timerDecrement = false;
			messages.clear();
		}
		if(timerDecrement)
		{
			chatTimer--;
		}
		messages.setFocused(false);
	}
	
	Task serverText = new Task("serverMessages")
	{
		@Override
		public void processResponse(NBTTagCompound nbt) 
		{
			//setCallback(serverText.);
			text = nbt.getString("messages");
		}
		
		@Override
		public void processRequest(NBTTagCompound nbt, World world, EntityPlayer player)
		{
			nbt.setString("messages", messages.getText());
		}
		
		@Override
		public void prepareResponse(NBTTagCompound nbt)
		{
			nbt.setString("messages", messages.getText());
		}
		
		@Override
		public void prepareRequest(NBTTagCompound nbt) 
		{
			nbt.setString("messages", messages.getText());
		}
	};

	@Override
	public void load(NBTTagCompound tag) 
	{
		
	}

	@Override
	public void save(NBTTagCompound tag) 
	{
		
	}
}
