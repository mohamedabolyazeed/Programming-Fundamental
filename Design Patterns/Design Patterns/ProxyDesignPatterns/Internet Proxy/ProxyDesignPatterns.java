package proxydesignpatterns;

import java.util.Arrays;
import java.util.List;

public class ProxyDesignPatterns {
  public static void main(String[] args) {
    List<String> Sites = Arrays.asList("google", "youtube", "facebook", "twitter");

    InternetSerivceProvider ISP = new InternetProxy();
    for (String site : Sites) {
      System.out.println(ISP.serveSite(site));
    }
  }
}
