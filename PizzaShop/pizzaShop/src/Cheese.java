public class Cheese extends PizzaDecarator{
    public Cheese(Pizza pizza ){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return "Cheese Pizza";
    };

    @Override
    public double getCost(){
        return 499;
    }
}
