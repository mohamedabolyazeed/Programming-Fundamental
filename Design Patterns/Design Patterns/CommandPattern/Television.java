public class Television {
  private int volume = 10;

  public void turnOn() {
    System.out.println("TV is ON");
  }

  public void turnoff() {
    System.out.println("TV is Off");
  }

  public void increasevolume() {
    if (volume < 100) {
      volume++;
      System.out.println("Volume increased to: " + volume);
    } else {
      System.out.println("Maximum volume reached");
    }
  }

  public void decreasevolume() {
    if (volume > 0) {
      volume--;
      System.out.println("Volume decreased to: " + volume);
    } else {
      System.out.println("Minimum volume reached");
    }
  }
}
