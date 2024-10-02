class PizzaDecarator implements Pizza{
    protected Pizza pizza;

    public PizzaDecarator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription();
    }

    @Override
    public double getCost(){
        return pizza.getCost();
    }




}
