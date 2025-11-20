
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OneAndOnlyFactory {

    private String[] letters = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(letters);

    private static OneAndOnlyFactory oneinstance;

    public static OneAndOnlyFactory getinstance() {
        if (oneinstance == null) {
            oneinstance = new OneAndOnlyFactory();
        }
        return oneinstance;
    }

    private OneAndOnlyFactory() {
        Collections.shuffle(data);
    }

    public void printdata() {
        for (String item : data) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
