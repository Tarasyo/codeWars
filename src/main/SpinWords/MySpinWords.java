package main.SpinWords;

public class MySpinWords {
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] words = sentence.split(" ");
        for(int i=0; i< words.length; i++){
            if(words[i].length() >= 5){
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}
