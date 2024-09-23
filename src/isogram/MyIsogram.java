package isogram;

public class MyIsogram {
    public static boolean  isIsogram(String str) {
        // ...
        String s = str.toLowerCase();
        if(s.length() == 0){
            return true;
        }
        for(int i = 0; i <= s.length(); i++){
            String letter = s.substring(0, 1);
            s = s.substring(1);
           if(s.contains(letter)){
               return false;
           }
        }
        return true;
    }
}
