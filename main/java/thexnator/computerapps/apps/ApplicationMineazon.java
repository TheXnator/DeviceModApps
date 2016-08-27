package thexnator.computerapps.apps;

import java.awt.Color;

import com.mrcrayfish.device.api.app.Application;
import com.mrcrayfish.device.api.app.Layout;
import com.mrcrayfish.device.api.app.Layout.Background;
import com.mrcrayfish.device.api.app.component.Button;
import com.mrcrayfish.device.api.app.component.ItemList;
import com.mrcrayfish.device.api.app.renderer.ListItemRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import thexnator.computerapps.ComputerApps;

public class ApplicationMineazon extends Application
{
	//CATEGORIES
	private String[] categories = { "Building Blocks", "Decoration Blocks", "Redstone", "Transportation", "Miscellaneous", "Foodstuffs", "Tools", "Combat", "Brewing", "Materials" };
	//BUILDING BLOCKS
	private ItemStack[] buildingBlocks =
	{
			new ItemStack(Item.getItemFromBlock(Blocks.stone)),	
			new ItemStack(Item.getItemFromBlock(Blocks.grass)),
			new ItemStack(Item.getItemFromBlock(Blocks.dirt)),
			new ItemStack(Item.getItemFromBlock(Blocks.cobblestone)),
			new ItemStack(Item.getItemFromBlock(Blocks.planks)),
			new ItemStack(Item.getItemFromBlock(Blocks.planks), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.planks), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.planks), 1, 3),
			new ItemStack(Item.getItemFromBlock(Blocks.planks), 1, 4),
			new ItemStack(Item.getItemFromBlock(Blocks.planks), 1, 5),
			new ItemStack(Item.getItemFromBlock(Blocks.sand)),
			new ItemStack(Item.getItemFromBlock(Blocks.sand), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.gravel)),
			new ItemStack(Item.getItemFromBlock(Blocks.log)),
			new ItemStack(Item.getItemFromBlock(Blocks.log), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.log), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.log), 1, 3),
			new ItemStack(Item.getItemFromBlock(Blocks.log), 1, 4),
			new ItemStack(Item.getItemFromBlock(Blocks.log), 1, 5),
			new ItemStack(Item.getItemFromBlock(Blocks.sponge)),
			new ItemStack(Item.getItemFromBlock(Blocks.sponge), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.glass)),
			new ItemStack(Item.getItemFromBlock(Blocks.sandstone)),
			new ItemStack(Item.getItemFromBlock(Blocks.sandstone), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.sandstone), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.wool)),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 3),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 4),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 5),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 6),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 7),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 8),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 9),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 10),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 11),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 12),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 13),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 14),
			new ItemStack(Item.getItemFromBlock(Blocks.wool), 1, 15),
			new ItemStack(Item.getItemFromBlock(Blocks.brick_block)),
			new ItemStack(Item.getItemFromBlock(Blocks.bookshelf)),
			new ItemStack(Item.getItemFromBlock(Blocks.mossy_cobblestone)),
			new ItemStack(Item.getItemFromBlock(Blocks.obsidian)),
			new ItemStack(Item.getItemFromBlock(Blocks.ice)),
			new ItemStack(Item.getItemFromBlock(Blocks.snow)),
			new ItemStack(Item.getItemFromBlock(Blocks.clay)),
			new ItemStack(Item.getItemFromBlock(Blocks.pumpkin)),
			new ItemStack(Item.getItemFromBlock(Blocks.netherrack)),
			new ItemStack(Item.getItemFromBlock(Blocks.soul_sand)),
			new ItemStack(Item.getItemFromBlock(Blocks.glowstone)),
			new ItemStack(Item.getItemFromBlock(Blocks.lit_pumpkin)),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass)),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 3),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 4),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 5),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 6),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 7),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 8),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 9),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 10),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 11),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 12),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 13),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 14),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_glass), 1, 15),
			new ItemStack(Item.getItemFromBlock(Blocks.stonebrick)),
			new ItemStack(Item.getItemFromBlock(Blocks.stonebrick), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.stonebrick), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.stonebrick), 1, 3),
			new ItemStack(Item.getItemFromBlock(Blocks.melon_block)),
			new ItemStack(Item.getItemFromBlock(Blocks.mycelium)),
			new ItemStack(Item.getItemFromBlock(Blocks.nether_brick)),
			new ItemStack(Item.getItemFromBlock(Blocks.end_stone)),
			new ItemStack(Item.getItemFromBlock(Blocks.quartz_block)),
			new ItemStack(Item.getItemFromBlock(Blocks.quartz_block), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.quartz_block), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.hardened_clay)),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay)),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 3),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 4),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 5),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 6),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 7),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 8),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 9),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 10),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 11),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 12),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 13),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 14),
			new ItemStack(Item.getItemFromBlock(Blocks.stained_hardened_clay), 1, 15),
			new ItemStack(Item.getItemFromBlock(Blocks.prismarine)),
			new ItemStack(Item.getItemFromBlock(Blocks.prismarine), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.prismarine), 1, 2),
			new ItemStack(Item.getItemFromBlock(Blocks.sea_lantern)),
			new ItemStack(Item.getItemFromBlock(Blocks.hay_block)),
			new ItemStack(Item.getItemFromBlock(Blocks.red_sandstone)),
			new ItemStack(Item.getItemFromBlock(Blocks.red_sandstone), 1, 1),
			new ItemStack(Item.getItemFromBlock(Blocks.red_sandstone), 1, 2)		
	};
	
	public ApplicationMineazon()
	{
		super(ComputerApps.MODID + "mineazon", "Mineazon");
	}
	
	@Override
	public void init(int x, int y) 
	{
		Layout main = new Layout(300, 150);
		
		//Background
		main.setBackground(new Background() 
		{
			@Override
			public void render(Gui gui, Minecraft mc, int x, int y, int width, int height) 
			{
				gui.drawRect(x, y, x + width, y + 20, Color.GRAY.getRGB());
				gui.drawRect(x, y + 19, x + width, y + 20, Color.DARK_GRAY.getRGB());
				gui.drawRect(x, y + 20, x + 120, y + height, Color.LIGHT_GRAY.getRGB());
				gui.drawRect(x + 120, y + 20, x + 121, y + height, Color.DARK_GRAY.getRGB());
				gui.drawString(mc.fontRendererObj, "Welcome to Mineazon, the alternative to MineBay!", x + 5, y + 5, Color.WHITE.getRGB());
			}
		});
		
		//Categroy List
		ItemList<String> categories = new ItemList<String>(x, y, 5, 25, 95, 8);
		for(String category : this.categories)
		{
			categories.addItem(category);
		}
		
		//Item List
		ItemList<ItemStack> items = new ItemList<ItemStack>(x, y, 125, 25, 155, 4);
		for(ItemStack item : this.buildingBlocks)
		{
			items.addItem(item);
		}
		items.setListItemRenderer(new ListItemRenderer<ItemStack>(23) 
		{
			@Override
			public void render(ItemStack e, Gui gui, Minecraft mc, int x, int y, int width, int height, boolean selected)
			{
				if(selected)
				{
					gui.drawRect(x, y, x + width, y + height, Color.gray.getRGB());
				}
				else
				{
					gui.drawRect(x, y, x + width, y + height, Color.LIGHT_GRAY.getRGB());
				}
				
				mc.getRenderItem().renderItemIntoGUI(e, x + 4, y + 3);
				gui.drawString(mc.fontRendererObj, e.getDisplayName(), x + 30, y + 8, Color.WHITE.getRGB());
			}
		});

		Button buy = new Button("Buy", x, y, 125, 130, 50, 15);
		
		main.addComponent(items);
		main.addComponent(categories);
		main.addComponent(buy);
		
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
