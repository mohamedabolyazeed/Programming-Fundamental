public class RealDatabase implements Database {
  public RealDatabase() {
    System.out.println("Connecting to the database...");
  }

  @Override
  public void query(String sql) {
    System.out.println("Executing query: " + sql);
  }
}
