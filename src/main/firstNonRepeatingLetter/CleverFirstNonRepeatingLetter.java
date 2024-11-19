package main.firstNonRepeatingLetter;

public class CleverFirstNonRepeatingLetter {
    public static String firstNonRepeatingLetter(String s){
        for (String str : s.split("")) {
            if (s.toUpperCase().indexOf(str.toUpperCase()) == s.toUpperCase().lastIndexOf(str.toUpperCase())) return str;
        }
        return "";
    }
}
