import java.io.*;

/**
 * Created by Администратор on 24.09.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try(Reader r = new InputStreamReader(new BufferedInputStream(new FileInputStream(args[0])))) { //String.join(" ", args)
            MyList l = new MyList();
            l.setList(InOut.scan(r));

            Writer w = null;

            if (args.length > 1){
                w = new OutputStreamWriter(new FileOutputStream(args[1]));

            }
            InOut.outResult(l.sort(), w);
        }
    }
}
