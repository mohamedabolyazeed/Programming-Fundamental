class FileAccessProxy implements FileAccess {
  private RealFileAccess realFileAccess;
  private String fileName;
  private String userRole;

  public FileAccessProxy(String fileName, String userRole) {
    this.fileName = fileName;
    this.userRole = userRole;
  }

  @Override
  public void readFile() {
    if ("ADMIN".equals(userRole)) {
      if (realFileAccess == null) {
        realFileAccess = new RealFileAccess(fileName);
      }
      realFileAccess.readFile();
    } else {
      System.out.println("Access Denied: User role is not ADMIN");
    }
  }
}