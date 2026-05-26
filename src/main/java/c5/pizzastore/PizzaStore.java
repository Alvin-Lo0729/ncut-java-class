package c5.pizzastore;

import c5.pizzas.Pizza;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;

  }

  protected abstract Pizza createPizza(String type);
}
