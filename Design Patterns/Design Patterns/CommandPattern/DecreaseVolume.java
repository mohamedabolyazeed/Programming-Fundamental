
package commandpattern;


public class DecreaseVolume implements Command{
    private Television TV;
    
    public DecreaseVolume (Television TV){
        this.TV = TV;
    }

    @Override
    public void execute() {
        TV.decreasevolume();
    }
}


