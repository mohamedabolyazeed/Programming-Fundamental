public class DatabaseProxy implements Database {
  private RealDatabase realDatabase;
  private String cachedQuery;

  @Override
  public void query(String sql) {
    if (realDatabase == null) {
      realDatabase = new RealDatabase();
    }

    if (cachedQuery != null && cachedQuery.equals(sql)) {
      System.out.println("Returning cached result for: " + sql);
    } else {
      realDatabase.query(sql);
      cachedQuery = sql;
    }
  }
}
