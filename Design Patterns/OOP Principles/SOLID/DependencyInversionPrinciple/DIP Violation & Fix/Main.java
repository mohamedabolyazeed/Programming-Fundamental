public class Main {
  public static void main(String[] args) {
      Person person = new Person(new CarDriver());
      person.goToWork();

      Person person2 = new Person(new TruckDriver());
      person2.goToWork();
  }
}