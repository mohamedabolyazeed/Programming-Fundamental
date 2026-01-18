public class CarBuilder {
  private int id;
  private String brand;
  private String model;
  private String color;
  private int nbrDoors;
  private String Screentype;
  private int weight;
  private int height;

  public CarBuilder Id(int id) {
    this.id = id;
    return this;
  }

  public CarBuilder Brand(String brand) {
    this.brand = brand;
    return this;
  }

  public CarBuilder Model(String model) {
    this.model = model;
    return this;
  }

  public CarBuilder Color(String color) {
    this.color = color;
    return this;
  }

  public CarBuilder NbrDoors(int nbrDoors) {
    this.nbrDoors = nbrDoors;
    return this;
  }

  public CarBuilder Screentype(String Screentype) {
    this.Screentype = Screentype;
    return this;
  }

  public CarBuilder Weight(int weight) {
    this.weight = weight;
    return this;
  }

  public CarBuilder Height(int height) {
    this.height = height;
    return this;
  }

  public Car build() {
    return new Car(id, brand, model, color, nbrDoors, Screentype, weight, height);
  }
}
