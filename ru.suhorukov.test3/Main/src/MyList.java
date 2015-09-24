import com.sun.javafx.collections.MappingChange;

import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * Created by Администратор on 24.09.2015.
 */
public class MyList {
    Map<String, Integer> myList;
    public int totalWords=0;

    public void scan(Reader r) throws IOException {
        String word="";
        int c, count;


        while ((c = r.read())!= -1){
            if (Character.isLetter(c)){
              word = word + (char)c;
            }
            else if (word.length() > 0) {
                count = myList.get(word)==null?1:myList.get(word);
                myList.put(word, count);
                word = "";
                totalWords++;
            }
        }
    }


    void sort () {

        List<Map.Entry<String,Integer>> cl = new ArrayList<Map.Entry<String,Integer>>(myList.entrySet());

        class Comp implements Comparator<Map.Entry<String, Integer>> {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()>o2.getValue()?1:(o1.getValue()<o2.getValue()?-1:0);
            }
        }

        Collections.sort(cl, new Comp() );

        myList = Collections.emptyMap();

    }


    public Map<String, Integer> getMyList() {
        return myList;
    }
}
