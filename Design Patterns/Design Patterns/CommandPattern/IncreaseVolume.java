
package commandpattern;

public class IncreaseVolume implements Command{
    
    private Television TV;
    
    public IncreaseVolume (Television TV){
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.increasevolume();
    }
}

