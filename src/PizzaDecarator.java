
abstract class PizzaDecarator implements Pizza{
    protected Pizza pizza;

    public PizzaDecarator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){}

    @Override
    public double getCost(){}




}
