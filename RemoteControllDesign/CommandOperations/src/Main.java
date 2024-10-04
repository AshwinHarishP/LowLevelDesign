public class Main {

   public static void main(String[] args) {

       AirConditioner airConditioner = new AirConditioner();
       Remote remote = new Remote();

       remote.addCommand(new ONACCommand(airConditioner));
       remote.addCommand(new OFFACCommand(airConditioner));
       remote.addCommand(new SETTemperatureCommand(airConditioner, 27));
       remote.pressButton();
    }
}