public class ObservePattern {

  public static void main(String[] args) {

    Student Mohamed = new Student("Mohamed");
    Student Mahmoud = new Student("Mahmoud");
    Student Rami = new Student("Rami");
    Student Sami = new Student("Sami");

    Course java = new Course("Java Course");

    java.register(Mohamed);
    java.register(Mahmoud);
    java.register(Rami);
    java.register(Sami);
    java.unregister(Sami);
    java.setAvaibility(false);

  }

}
