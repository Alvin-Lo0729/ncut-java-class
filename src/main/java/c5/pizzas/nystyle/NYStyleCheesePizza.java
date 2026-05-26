package c5.pizzas.nystyle;

import c5.pizzas.Pizza;
import java.util.ArrayList;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class NYStyleCheesePizza extends Pizza {

  public NYStyleCheesePizza() {
    super.name = "NY Style Sauce and Cheese Pizza";
    super.dough = "Thin Crust Dough";
    super.sauce = "Marinara Sauce";
    super.toppings = new ArrayList<>();
  }
}
