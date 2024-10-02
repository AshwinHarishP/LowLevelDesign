public class Peppers extends PizzaDecarator{
    public Peppers(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return "Pepper Pizza";
    }

    @Override
    public double getCost() {
        return 399.0;
    }
}
