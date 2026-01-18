public class RemoteControl {

  private Command[] Command;

  public RemoteControl() {
    Command = new Command[4];

  }

  public void addcommand(int slotid, Command Command) {
    this.Command[slotid] = Command;

  }

  public void ButtonPressed(int slot) {
    Command[slot].execute();
  }
}
