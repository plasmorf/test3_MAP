import javafx.beans.binding.MapBinding;
import javafx.collections.ObservableMap;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by plasmorf on 25.09.2015.
 */
public class InOut {

    public static Map<String, Integer> scan(Reader r) throws IOException {
        String word="";
        Map<String, Integer> myList = new HashMap<>();
        int c, count;

        while ((c = r.read())!= -1){
            if (Character.isLetter(c)){
                word = word + (char)c;
            }
            else if (word.length() > 0) {
                count = myList.get(word)==null?1:(myList.get(word)+1);
                myList.put(word, count);
                word = "";
            }
        }

        return myList;
    }

    public static void outResult(List<Map.Entry<String, Integer>> m, Writer w) throws IOException {

        int totalWords = 0;

        for (Map.Entry<String, Integer> entry : m) {
            totalWords+=entry.getValue();
        }

        totalWords = totalWords==0?1:totalWords;

        // Вывод
        for (Map.Entry<String, Integer> entry : m) {
            // Вывод на экран

            if (w==null){
                System.out.printf("%s \t: %d  \t  %.1f %n", entry.getKey(), entry.getValue(), entry.getValue()*100./totalWords);
            }
            // Вывод в файл
            else{
                w.write(entry.getKey() +" :     " + entry.getValue());
            }


        }

    }

}
