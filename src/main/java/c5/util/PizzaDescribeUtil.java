package c5.util;

import c5.pizzas.Pizza;

public final class PizzaDescribeUtil {

  public static void describePizza(Pizza pizza) {
    System.out.println("init name:" + pizza.getName());
    System.out.println(pizza);
    pizza.setName("test11111");
    System.out.println("change name:" + pizza.getName());
    System.out.println(pizza);
  }

}
