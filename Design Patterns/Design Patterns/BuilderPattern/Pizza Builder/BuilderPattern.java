public class BuilderPattern {

  public static void main(String[] args) {

    PizzaBuilder builder = new PizzaBuilder();
    builder.Id(1).PizzaName("Deluxe Feast").Size(14).Crust("Stuffed Crust").HasCheese(true)
        .HasExtraToppings(true).IsSpicy(true).Price(25.99).DeliveryTime(30);
    Pizza pizza = builder.build();
    System.out.println(pizza);

    System.out.println("--------------------------------");

    PizzaBuilder builder1 = new PizzaBuilder();
    builder1.Id(2).PizzaName("Cheese Lover").Size(10).Crust("Thin Crust").HasCheese(true)
        .HasExtraToppings(false).IsSpicy(false).Price(10.99).DeliveryTime(20);
    Pizza pizza1 = builder1.build();
    System.out.println(pizza1);
    System.out.println(pizza1.getPizzaName());

    System.out.println("--------------------------------");
    System.out.println("Building Pizza with Director");
    PizzaDirector director = new PizzaDirector();
    director.buildDeluxePizza(builder);
    Pizza pizza2 = builder.build();
    System.out.println(pizza2.getPizzaName());
    System.out.println(pizza2.getSize());
    System.out.println(pizza2.getCrust());
    System.out.println(pizza2.isHasCheese());
    System.out.println(pizza2.isHasExtraToppings());
    System.out.println(pizza2.isIsSpicy());
    System.out.println(pizza2.getPrice());
    System.out.println(pizza2.getDeliveryTime());

    System.out.println("--------------------------------");
    System.out.println("Building Pizza with Director");
    director.buildSimplePizza(builder);
    Pizza pizza3 = builder.build();
    System.out.println(pizza3.getPizzaName());
    System.out.println(pizza3.getSize());
    System.out.println(pizza3.getCrust());
    System.out.println(pizza3.isHasCheese());
    System.out.println(pizza3.isHasExtraToppings());
    System.out.println(pizza3.isIsSpicy());
    System.out.println(pizza3.getPrice());
    System.out.println(pizza3.getDeliveryTime());
  }
}
