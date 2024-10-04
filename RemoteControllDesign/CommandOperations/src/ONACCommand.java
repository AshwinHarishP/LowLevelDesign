public class ONACCommand implements ICommand{
    AirConditioner ac;

    public ONACCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void excute(){
        ac.turnOnAC();
    }

}