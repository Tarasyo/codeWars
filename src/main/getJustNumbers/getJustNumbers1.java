package main.getJustNumbers;

import java.util.*;
import java.util.stream.Collectors;


public class getJustNumbers1 {
//In this kata you will create a function that takes a list of non-negative
//integers and strings and returns a new list with the strings filtered out.
    public static List filterList(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toList());
    }
}
