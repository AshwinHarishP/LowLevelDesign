public class OFFACCommand implements ICommand{
    AirConditioner ac;

    public OFFACCommand(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void excute(){
        ac.turnOffAC();
    }
}