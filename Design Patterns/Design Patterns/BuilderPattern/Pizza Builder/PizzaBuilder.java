public class PizzaBuilder {
  private int id;
  private String pizzaName;
  private int size;
  private String crust;
  private boolean hasCheese;
  private boolean hasExtraToppings;
  private boolean isSpicy;
  private double price;
  private int deliveryTime;

  public PizzaBuilder Id(int id) {
    this.id = id;
    return this;
  }

  public PizzaBuilder PizzaName(String pizzaName) {
    this.pizzaName = pizzaName;
    return this;
  }

  public PizzaBuilder Size(int size) {
    this.size = size;
    return this;
  }

  public PizzaBuilder Crust(String crust) {
    this.crust = crust;
    return this;
  }

  public PizzaBuilder HasCheese(boolean hasCheese) {
    this.hasCheese = hasCheese;
    return this;
  }

  public PizzaBuilder HasExtraToppings(boolean hasExtraToppings) {
    this.hasExtraToppings = hasExtraToppings;
    return this;
  }

  public PizzaBuilder IsSpicy(boolean isSpicy) {
    this.isSpicy = isSpicy;
    return this;
  }

  public PizzaBuilder Price(double price) {
    this.price = price;
    return this;
  }

  public PizzaBuilder DeliveryTime(int deliveryTime) {
    this.deliveryTime = deliveryTime;
    return this;
  }

  public Pizza build() {
    return new Pizza(id, pizzaName, size, crust, hasCheese, hasExtraToppings, isSpicy, price, deliveryTime);
  }
}
