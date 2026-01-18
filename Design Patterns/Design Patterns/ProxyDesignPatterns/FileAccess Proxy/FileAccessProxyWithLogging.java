class FileAccessProxyWithLogging implements FileAccess {
  private RealFileAccess realFileAccess;
  private String fileName;
  private String userRole;

  public FileAccessProxyWithLogging(String fileName, String userRole) {
      this.fileName = fileName;
      this.userRole = userRole;
  }

  @Override
  public void readFile() {
      System.out.println("Access attempt by user role: " + userRole);
      
      if ("ADMIN".equals(userRole)) {
          System.out.println("Access ALLOWED");
          if (realFileAccess == null) {
              realFileAccess = new RealFileAccess(fileName);
          }
          realFileAccess.readFile();
      } else {
          System.out.println("Access DENIED");
      }
  }
}