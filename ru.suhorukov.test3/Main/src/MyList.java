import com.sun.javafx.collections.MappingChange;

import java.io.IOException;
import java.io.Reader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Администратор on 24.09.2015.
 */
public class MyList {
    Map<String, Integer> myList;

    void setList(Map<String, Integer> m) {
        myList = m;
    }

    List<Map.Entry<String, Integer>> sort () {

        List<Map.Entry<String, Integer>> cl = new ArrayList<>(myList.entrySet());

        class Comp implements Comparator<Map.Entry<String, Integer>> {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue() ? 1 : 0);
            }
        }

        Collections.sort(cl, new Comp());
        return cl;
        /*myList.clear();
        for (Map.Entry<String, Integer> c2 : cl) {
            myList.put(c2.getKey(), c2.getValue());
        }*/

    }

}
