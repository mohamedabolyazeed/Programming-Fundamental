
package commandpattern;


public class TurnOffTelevision implements Command{
    
    private Television TV;
    public TurnOffTelevision (Television tv){
        this.TV = tv;
    }
    @Override
    public void execute() {
        this.TV.turnoff();
    }
}

