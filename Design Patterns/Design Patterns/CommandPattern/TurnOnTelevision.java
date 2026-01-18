
package commandpattern;


public class TurnOnTelevision implements Command{

    private Television TV;
    public TurnOnTelevision (Television tv){
        this.TV = tv;
    }

    @Override
    public void execute() {
        this.TV.turnOn();
    }
    
}

