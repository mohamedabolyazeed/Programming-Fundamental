public class Pizza {
  private int id;
  private String pizzaName;
  private int size;
  private String crust;
  private boolean hasCheese;
  private boolean hasExtraToppings;
  private boolean isSpicy;
  private double price;
  private int deliveryTime;

  public Pizza(int id, String pizzaName, int size, String crust, boolean hasCheese, boolean hasExtraToppings,
      boolean isSpicy, double price, int deliveryTime) {
    this.id = id;
    this.pizzaName = pizzaName;
    this.size = size;
    this.crust = crust;
    this.hasCheese = hasCheese;
    this.hasExtraToppings = hasExtraToppings;
    this.isSpicy = isSpicy;
    this.price = price;
    this.deliveryTime = deliveryTime;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPizzaName() {
    return pizzaName;
  }

  public void setPizzaName(String pizzaName) {
    this.pizzaName = pizzaName;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getCrust() {
    return crust;
  }

  public void setCrust(String crust) {
    this.crust = crust;
  }

  public boolean isHasCheese() {
    return hasCheese;
  }

  public void setHasCheese(boolean hasCheese) {
    this.hasCheese = hasCheese;
  }

  public boolean isHasExtraToppings() {
    return hasExtraToppings;
  }

  public void setHasExtraToppings(boolean hasExtraToppings) {
    this.hasExtraToppings = hasExtraToppings;
  }

  public boolean isIsSpicy() {
    return isSpicy;
  }

  public void setIsSpicy(boolean isSpicy) {
    this.isSpicy = isSpicy;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getDeliveryTime() {
    return deliveryTime;
  }
  
  public void setDeliveryTime(int deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  @Override
  public String toString() {
    return "Pizza [id=" + id + ", pizzaName=" + pizzaName + ", size=" + size + ", crust=" + crust + ", hasCheese=" + hasCheese + ", hasExtraToppings=" + hasExtraToppings + ", isSpicy=" + isSpicy + ", price=" + price + ", deliveryTime=" + deliveryTime + "]";
  }
}
