public class We implements InternetSerivceProvider {

  private int browesingspeed = 10;

  @Override
  public String serveSite(String url) {
    return String.format("https://www.%s.com", url);
    // throw new UnsupportedOperationException("Not supported yet."); //To change
    // body of generated methods, choose Tools | Templates.
  }

  public int getbrowsingspeed() {
    return browesingspeed;
  }
}
