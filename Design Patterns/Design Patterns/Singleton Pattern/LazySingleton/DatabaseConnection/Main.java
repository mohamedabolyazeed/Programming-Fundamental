public class Main {
  public static void main(String[] args) {
    DatabaseConnection db1 = DatabaseConnection.getInstance();
    db1.printconnect();
    DatabaseConnection db2 = DatabaseConnection.getInstance();
    db2.printdisconnect();
    System.out.println("Are objects same? " + (db1 == db2));
  }
}
