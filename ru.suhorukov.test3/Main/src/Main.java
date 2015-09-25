import java.io.*;

/**
 * Created by Администратор on 24.09.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try(Reader r = new InputStreamReader(new BufferedInputStream(new FileInputStream(args[0])))) { //String.join(" ", args)
            MyList l = new MyList();
            l.setList(InOut.scan(r));
            l.sort();

            if (args[1] != ""){
                Writer w = new OutputStreamWriter(new FileOutputStream(args[1]));

            }
            l.getMyList();
        }
    }
}
