public class ObservePattern {

  public static void main(String[] args) {

    Student Mohamed = new Student("Mohamed");
    Student Samaa = new Student("Samaa");
    Student Rami = new Student("Rami");
    Student Sami = new Student("Sami");

    Course java = new Course("Java Course");

    java.register(Mohamed);
    java.register(Samaa);
    java.register(Rami);
    java.register(Sami);
    java.unregister(Sami);
    java.setAvaibility(true);

  }

}
