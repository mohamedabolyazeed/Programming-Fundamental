
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstantOneFactory {

    private String[] letters = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(letters);

    public static InstantOneFactory oneinstance = new InstantOneFactory();

    private InstantOneFactory() {
        Collections.shuffle(data);
    }

    public void printdata() {
        for (String item : data) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
