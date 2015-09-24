import java.io.*;
import java.util.HashMap;

/**
 * Created by Администратор on 24.09.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(new BufferedInputStream(new FileInputStream(String.join(" ", args))));
        MyList l = new MyList();
        l.scan(r);

    }
}
