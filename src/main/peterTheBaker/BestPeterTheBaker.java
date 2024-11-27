package main.peterTheBaker;

import java.util.Map;

public class BestPeterTheBaker {
    public static int cakes(Map<String, Integer> requirements, Map<String, Integer> availableResources) {
        int maxSets = Integer.MAX_VALUE;
        for (String key: requirements.keySet()) {
            if (!availableResources.containsKey(key)) return 0;

            maxSets = Integer.min(maxSets, availableResources.get(key) / requirements.get(key));
        }
        return maxSets;
    }
}
