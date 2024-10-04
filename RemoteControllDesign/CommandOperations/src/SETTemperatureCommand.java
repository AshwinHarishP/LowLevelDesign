public class SETTemperatureCommand implements ICommand{
    public int temp;
    AirConditioner ac;
    public SETTemperatureCommand(AirConditioner ac, int temp){
        this.temp = temp;
        this.ac = ac;
    }
    @Override
    public void excute(){
        ac.setTemperature(temp);
    }
}