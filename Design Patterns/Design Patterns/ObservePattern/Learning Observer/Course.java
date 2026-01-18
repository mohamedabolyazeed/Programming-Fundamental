import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
  private String name;
  private String availability;
  private List<Observer> observerlist;

  public Course(String name) {
    this.name = name;
    observerlist = new ArrayList<>();
  }

  @Override
  public void register(Observer observer) {
    observerlist.add(observer);
  }

  @Override
  public void unregister(Observer observer) {
    observerlist.remove(observer);
  }

  @Override
  public void notifyallObservers() {
    for (Observer obs : observerlist) {
      obs.update(availability);
    }
  }

  // true
  public void setAvaibility(boolean avaiable) {
    availability = name + (avaiable ? "Avaiable" : "Not Avaiable");
    notifyallObservers();
  }

}
