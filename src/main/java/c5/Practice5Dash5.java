package c5;

import c5.pizzas.Pizza;
import c5.pizzastore.NYStylePizzaStore;
import c5.pizzastore.PizzaStore;

public class Practice5Dash5 {

  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYStylePizzaStore();
    Pizza pizza = nyPizzaStore.orderPizza("cheese");
    System.out.println(pizza);
  }

}
