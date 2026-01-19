public class We implements InternetSerivceProvider {

  // This is the browsing speed of the internet
  private int browesingspeed = 10;

  @Override
  public String serveSite(String url) {
    return String.format("https://www.%s.com", url);

  }
  // This method is used to get the browsing speed of the internet
  public int getbrowsingspeed() {
    return browesingspeed;
  }
}
