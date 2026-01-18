public class DecoratePattern {

  public static void main(String[] args) {
    System.out.println("Sandwich 1");
    Sandwich firstsandwich = new BasicSandwich();
    System.out.println(firstsandwich.getdescription());
    System.out.println(firstsandwich.getcost());

    System.out.println("--------------------------------");
    System.out.println("Sandwich 2");
    Sandwich secondsandwich = new Foul(new BasicSandwich());
    System.out.println(secondsandwich.getdescription());
    System.out.println(secondsandwich.getcost());

    System.out.println("--------------------------------");
    System.out.println("Sandwich 3");
    Sandwich fourthsandwich = new Salta(new BasicSandwich());
    System.out.println(fourthsandwich.getdescription());
    System.out.println(fourthsandwich.getcost());

    System.out.println("--------------------------------");
    System.out.println("Sandwich 4");
    Sandwich thirdsandwich = new Salta(new Foul(new BasicSandwich()));
    System.out.println(thirdsandwich.getdescription());
    System.out.println(thirdsandwich.getcost());

    System.out.println("--------------------------------");
    System.out.println("Sandwich 5");
    Sandwich fifthsandwich = new Zethar(new Salta(new Foul(new BasicSandwich())));
    System.out.println(fifthsandwich.getdescription());
    System.out.println(fifthsandwich.getcost());

  }

}
