public class PizzaDirector {

  public void buildDeluxePizza(PizzaBuilder pizzaBuilder) {
    pizzaBuilder.PizzaName("Deluxe Feast")
        .Size(14)
        .Crust("Stuffed Crust")
        .HasCheese(true)
        .HasExtraToppings(true)
        .IsSpicy(true)
        .Price(25.99)
        .DeliveryTime(30);
  }

  public void buildSimplePizza(PizzaBuilder pizzaBuilder) {
    pizzaBuilder.PizzaName("Cheese Lover")
        .Size(10)
        .Crust("Thin Crust")
        .HasCheese(true)
        .HasExtraToppings(false)
        .IsSpicy(false)
        .Price(10.99)
        .DeliveryTime(20);
  }
}
