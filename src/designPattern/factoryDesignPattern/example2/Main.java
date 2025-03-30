package designPattern.factoryDesignPattern.example2;

public class Main {

    public static void main(String[] args) {
        Pizza garlicP = PizzaFactory.pizzaFactoryMethod("Garlic");
        String finalGarlicPizza = garlicP.createPizza();
        System.out.println(finalGarlicPizza);

        Pizza cheesePiz = PizzaFactory.pizzaFactoryMethod("Cheese");
        String finalCheesePizza = cheesePiz.createPizza();
        System.out.println(finalCheesePizza);
    }
}
