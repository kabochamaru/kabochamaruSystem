package kabochamaru.kabochamaruSystem;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;


public class kabochamaruSystem extends JavaPlugin implements Listener{
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("�v���O�C�����L���ɂȂ�܂���");
	}
	public boolean onCommand(CommandSender sender, Command command, String Label, String[] args){
		switch(command.getName()){
		case "kabochamaru":
			try {
				if (args[0] != null) {
					Player player = getServer().getPlayer(args[0]);
					   if (player != null) {
						   player.getInventory().clear();
						   ItemStack item = new ItemStack(Material.PUMPKIN);
						   for(int i=0; i<=35; i++){
							   player.getInventory().setItem(i , item);
						   }
						   player.sendMessage("��a[KABOCHAMARU]��f���ڂ���܂�̎􂢂�������܂���");
					   }else {
						   sender.sendMessage("��a[KABOCHAMARU]��f����PLAYER�̓T�[�o�[�ɂ��܂���");
					   }
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				sender.sendMessage("��f>>>/kabochamaru [���O] |�@kabochamaru noroi");
			}
		}
		return false;
	}
}
