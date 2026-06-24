public class PizzaApp {
    public static void main(String[] args) {
        //Basic Pizza
        Pizza pizza = new BasicPizza();

        //Add Cheese
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}