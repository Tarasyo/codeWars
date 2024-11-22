package main.secondsToHumanTime;

import java.util.ArrayList;
import java.util.List;

public class MySecondsToHumanTime {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        // Define time units in seconds
        int yearInSeconds = 365 * 24 * 60 * 60;
        int dayInSeconds = 24 * 60 * 60;
        int hourInSeconds = 60 * 60;
        int minuteInSeconds = 60;

        // Calculate the number of years, days, hours, minutes, and seconds
        int years = seconds / yearInSeconds;
        seconds %= yearInSeconds;

        int days = seconds / dayInSeconds;
        seconds %= dayInSeconds;

        int hours = seconds / hourInSeconds;
        seconds %= hourInSeconds;

        int minutes = seconds / minuteInSeconds;
        seconds %= minuteInSeconds;

        // Create a list to store the components of the duration
        List<String> components = new ArrayList<>();

        // Add non-zero components to the list
        if (years > 0) components.add(years + " year" + (years > 1 ? "s" : ""));
        if (days > 0) components.add(days + " day" + (days > 1 ? "s" : ""));
        if (hours > 0) components.add(hours + " hour" + (hours > 1 ? "s" : ""));
        if (minutes > 0) components.add(minutes + " minute" + (minutes > 1 ? "s" : ""));
        if (seconds > 0) components.add(seconds + " second" + (seconds > 1 ? "s" : ""));

        // Combine the components into the final string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < components.size(); i++) {
            if (i > 0) {
                result.append(i == components.size() - 1 ? " and " : ", ");
            }
            result.append(components.get(i));
        }

        return result.toString();
    }
}
