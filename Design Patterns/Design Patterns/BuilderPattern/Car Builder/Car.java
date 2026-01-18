public class Car {
  private int id;
  private String brand;
  private String model;
  private String color;
  private int nbrDoors;
  private String Screentype;
  private int weight;
  private int height;

  public Car(int id, String brand, String model, String color, int nbrDoors, String Screentype, int weight,
      int height) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.nbrDoors = nbrDoors;
    this.Screentype = Screentype;
    this.weight = weight;
    this.height = height;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNbrDoors() {
    return nbrDoors;
  }

  public void setNbrDoors(int nbrDoors) {
    this.nbrDoors = nbrDoors;
  }

  public String getScreentype() {
    return Screentype;
  }

  public void setScreentype(String Screentype) {
    this.Screentype = Screentype;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

}
