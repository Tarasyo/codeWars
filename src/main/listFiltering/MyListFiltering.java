package main.listFiltering;

import java.util.ArrayList;
import java.util.List;

public class MyListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> result = new ArrayList<>();
        for (Object n : list){
            if(isObjectInteger(n)){
                result.add(n);
            }
        }
        return result;
    }
    public static boolean isObjectInteger(Object o){
        return o instanceof Integer;
    }
}
