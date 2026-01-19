import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetSerivceProvider {

  private List<String> blockedSites = Arrays.asList("twitter", "youtube", "facebook");

  // This method is used to log the internet request time and url
  private void internetlog(String url) {
    System.out.println(url + " is requested");
  }

  @Override
  public String serveSite(String url) {
    internetlog(url);
    if (blockedSites.contains(url)) {
      return "This website is blocked!!";
    }
    return new We().serveSite(url);

  }
}
