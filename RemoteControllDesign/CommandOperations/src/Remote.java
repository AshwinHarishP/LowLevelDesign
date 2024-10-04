import java.util.ArrayList;
import java.util.List;

//Invoker
public class Remote {
    List<ICommand> commands = new ArrayList<>();

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void pressButton(){
        for(ICommand command: commands){
            command.excute();
        }
        commands.clear();
    }
}