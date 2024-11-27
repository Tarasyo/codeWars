package main.peterTheBaker;


import java.util.Map;

public class MyPeterTheBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        // TODO: Insert Code Here
        int cakes = 1000;
        for(Map.Entry<String, Integer> entry : recipe.entrySet()){
            String key = entry.getKey();
            int recipeValue = entry.getValue();
            if(!available.containsKey(key)){
               return 0;
            }
            int availableValue = available.get(key);
            int result = availableValue / recipeValue;
            if(result < cakes) cakes = result;
        }
        return cakes;
    }
}
