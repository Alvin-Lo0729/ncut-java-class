package c5.pizzas;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public abstract class Pizza {

  @Setter
  protected String name;
  protected String dough;
  protected String sauce;
  protected List<String> toppings;

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Dough: " + dough);
    System.out.println("Adding sauce: " + sauce);
    System.out.println("Adding toppings: " + String.join(", ", toppings));
  }

  public void bake() {
    System.out.println("bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }


}
