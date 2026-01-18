class RealFileAccess implements FileAccess {
  private String fileName;

  public RealFileAccess(String fileName) {
    this.fileName = fileName;
    loadFile();
  }

  private void loadFile() {
    System.out.println("Loading file: " + fileName);
  }

  @Override
  public void readFile() {
    System.out.println("Reading file: " + fileName);
  }
}