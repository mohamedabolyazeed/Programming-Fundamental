public class Director {
  public void buildC(CarBuilder carBuilder) {
    carBuilder.Brand("BMW")
        .Model("X5")
        .Color("red")
        .NbrDoors(4)
        .Screentype("Big")
        .Weight(5000)
        .Height(1000);
  }

  public void buildH(CarBuilder carBuilder) {
    carBuilder.Brand("Hyundai")
        .Model("Creta")
        .Color("blue")
        .NbrDoors(4)
        .Screentype("Medium")
        .Weight(4000)
        .Height(900);
  }
}
