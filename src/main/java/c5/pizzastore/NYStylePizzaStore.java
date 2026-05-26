package c5.pizzastore;


import c5.pizzas.Pizza;
import c5.pizzas.nystyle.NYStyleCheesePizza;
import c5.pizzas.nystyle.NYStyleClamPizza;
import c5.pizzas.nystyle.NYStylePepperoniPizza;
import c5.pizzas.nystyle.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {


  @Override
  protected Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new NYStyleCheesePizza();
      case "pepperoni" -> new NYStylePepperoniPizza();
      case "clam" -> new NYStyleClamPizza();
      case "veggie" -> new NYStyleVeggiePizza();
      default -> null;
    };
  }
}
