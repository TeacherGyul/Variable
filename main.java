import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
    //플러그인 실행 시에 실행되는 부분
    @Override
    public void onEnable(){
        System.out.println("귤쌤의 변수 실습용 플러그인 실행");
    }
    //플러그인 종료 시에 실행되는 부분
    @Override
    public void onDisable(){
        System.out.println("빠이빠이");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("t")){
            int tmp;
            tmp=1;
            String str = Integer.toString(tmp);
            sender.sendMessage(str);
        }
        return true;
    }
}
