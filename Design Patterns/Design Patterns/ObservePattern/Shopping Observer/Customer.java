public class Customer implements Observer {
  private String name;

  public Customer(String name) {
    this.name = name;
  }

  @Override
  public void update(Product product) {
    if (product.isAvailable()) {
      System.out.println(name + ": Hurray! The " + product.getName() + " is now available in the store!");
    }
  }
}
