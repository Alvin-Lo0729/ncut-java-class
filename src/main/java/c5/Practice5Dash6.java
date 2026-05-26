package c5;

import c5.pizzas.Pizza;
import c5.pizzastore.NYStylePizzaStore;
import c5.pizzastore.PizzaStore;
import c5.util.PizzaDescribeUtil;

public class Practice5Dash6 {

  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYStylePizzaStore();
    Pizza pizza = nyPizzaStore.orderPizza("cheese");
    System.out.println("=========");
    PizzaDescribeUtil.describePizza(pizza);
  }

}
