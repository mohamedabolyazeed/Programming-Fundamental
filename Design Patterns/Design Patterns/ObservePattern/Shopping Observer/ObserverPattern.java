public class ObserverPattern {
  public static void main(String[] args) {
    Store store = new Store();

    Product iphone = new Product("iPhone 15");
    Product samsung = new Product("Samsung Galaxy S24");

    store.addProduct(iphone);
    store.addProduct(samsung);

    Customer alice = new Customer("Alice");
    Customer bob = new Customer("Bob");

    store.attach(alice);
    store.attach(bob);

    store.makeProductAvailable("iPhone 15");

    store.detach(alice);

    store.makeProductAvailable("Samsung Galaxy S24");
  }
}
