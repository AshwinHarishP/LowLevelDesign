public class Main {
    public static void main(String[] args) {
        System.out.println("\t!!! Welcome to Pizza Shop !!!");

        Pizza pizza = new FarmHousePizza();
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());

        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());

        pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());

        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());

        pizza = new Peppers(pizza);
        System.out.println(pizza.getDescription() + ": " + pizza.getCost());
    }
}