package main.listFiltering;

import java.util.List;
import java.util.stream.Collectors;

public class BestListFiltering {
    public static List filterList(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toList());
    }
}
