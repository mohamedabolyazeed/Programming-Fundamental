public class BuilderPattern {

  public static void main(String[] args) {

    CarBuilder builder = new CarBuilder();
    builder.Id(100).Brand("Verna");

    Car c = builder.build();
    System.out.println(c.getId());
    System.out.println(c.getBrand());
    System.out.println(c.getColor());

    System.out.println("--------------------------------");

    CarBuilder builder1 = new CarBuilder();
    builder1.Id(90).Brand("Toyota").Color("red");
    Car c1 = builder1.build();
    System.out.println(c1.getId());
    System.out.println(c1.getBrand());
    System.out.println(c1.getColor());

    System.out.println("--------------------------------");
    System.out.println("Building Car with Director");
    Director builderDirector = new Director();
    builderDirector.buildC(builder);
    Car c2 = builder.build();
    System.out.println(c2.getBrand());
    System.out.println(c2.getColor());
    System.out.println(c2.getNbrDoors());
    System.out.println(c2.getScreentype());
    System.out.println(c2.getWeight());
    System.out.println(c2.getHeight());

    System.out.println("--------------------------------");
    System.out.println("Building Car with Director");
    builderDirector.buildH(builder);
    Car c3 = builder.build();
    System.out.println(c3.getBrand());
    System.out.println(c3.getColor());
    System.out.println(c3.getNbrDoors());
    System.out.println(c3.getScreentype());
    System.out.println(c3.getWeight());
    System.out.println(c3.getHeight());
  }
}
