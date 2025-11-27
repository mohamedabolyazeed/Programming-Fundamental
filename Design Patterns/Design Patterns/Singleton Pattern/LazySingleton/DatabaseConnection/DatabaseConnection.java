import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DatabaseConnection {
  private String[] dataconnect = { "Connecting to database..." };
  private String[] datadisconnect = { "Disconnecting from database..." };

  private List<String> connect = Arrays.asList(dataconnect);
  private List<String> disconnect = Arrays.asList(datadisconnect);

  private static DatabaseConnection oneInstance;

  private DatabaseConnection() {
    Collections.shuffle(connect);
    Collections.shuffle(disconnect);
  }

  public static DatabaseConnection getInstance() {
    if (oneInstance == null) {
      oneInstance = new DatabaseConnection();
    }
    return oneInstance;
  }

  public void printconnect() {
    for (String item : connect) {
      System.out.print(item + " ");
    }
    System.out.println("");
  }

  public void printdisconnect() {
    for (String item : disconnect) {
      System.out.print(item + " ");
    }
    System.out.println("");
  }
}
