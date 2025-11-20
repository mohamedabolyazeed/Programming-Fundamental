
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Logger {

    private String[] logs = {"log1", "log2", "log3", "log4", "log5"};
    private List<String> data = Arrays.asList(logs);

    private Logger() {
        Collections.shuffle(data);
    }

    private static Logger oneinstance;

    public static Logger getInstance() {
        if (oneinstance == null) {
            oneinstance = new Logger();
        }
        return oneinstance;
    }

    public void printlogs() {
        for (String items : data) {
            System.out.print(items + " ");
        }
        System.out.println(" ");
    }

}
