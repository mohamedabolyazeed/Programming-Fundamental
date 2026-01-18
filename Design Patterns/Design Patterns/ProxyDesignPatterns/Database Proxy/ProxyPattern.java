public class ProxyPattern {

  public static void main(String[] args) {
    Database db = new DatabaseProxy();

    db.query("SELECT * FROM users");
    db.query("SELECT * FROM users");
  }
}
