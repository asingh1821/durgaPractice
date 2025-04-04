package designPattern.factoryDesignPattern.example2;

public interface PizzaFactory {


    public static Pizza pizzaFactoryMethod(String pizzaType){
        if(pizzaType.equalsIgnoreCase("Cheese")){
            return new CheesePizza();
        }else if(pizzaType.equalsIgnoreCase("Garlic")){
            return new GarlicPizza();
        }
        return null;
    }
}
