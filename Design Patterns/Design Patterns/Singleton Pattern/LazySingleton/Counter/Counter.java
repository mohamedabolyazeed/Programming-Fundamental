
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Counter {

    private Integer[] count = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private List<Integer> data = Arrays.asList(count);

    private static Counter oneInstance;

    private Counter() {
        Collections.shuffle(data);
    }

    public static Counter getInstance() {
        if (oneInstance == null) {
            oneInstance = new Counter();
        }
        return oneInstance;
    }

    public void printdata() {
        for (Integer item : data) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
