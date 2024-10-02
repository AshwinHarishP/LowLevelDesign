public class Olives extends PizzaDecarator{

    public Olives(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return "Olives Pizza";
    }
    @Override
    public double getCost() {
        return 299.0;
    }
}
