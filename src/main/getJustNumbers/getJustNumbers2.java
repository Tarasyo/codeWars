package main.getJustNumbers;

import java.util.List;


public class getJustNumbers2 {

    public static List filterList(final List<Object> list) {
        return list.stream()
                .filter(Integer.class::isInstance).toList();
    }
}
