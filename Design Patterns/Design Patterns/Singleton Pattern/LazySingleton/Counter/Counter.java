
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Counter {

    private Integer[] count = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private List<Integer> data = Arrays.asList(count);

    public static Counter oneinstance;

    private Counter() {
        Collections.shuffle(data);
    }

    public static Counter getInstance() {
        if (oneinstance == null) {
            oneinstance = new Counter();
        }
        return oneinstance;
    }

    public void printdata() {
        for (Integer item : data) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
