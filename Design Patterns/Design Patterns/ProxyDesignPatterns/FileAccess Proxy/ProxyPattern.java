public class ProxyPattern {
  public static void main(String[] args) {
    FileAccess adminAccess = new FileAccessProxy("secret.txt", "ADMIN");
    adminAccess.readFile();
    System.out.println("--------------------------------");
    FileAccess userAccess = new FileAccessProxy("secret.txt", "USER");
    userAccess.readFile();

    System.out.println("--------------------------------");
    FileAccess adminAccessLog = new FileAccessProxyWithLogging("data.txt", "ADMIN");
    adminAccessLog.readFile();
  }
}
