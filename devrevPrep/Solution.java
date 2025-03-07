package devrevPrep;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Solution {
    public static String getMinutesBetweenTimes(String timeRange) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mma");

        String[] times = timeRange.split("-");
        LocalTime time1 = LocalTime.parse(times[0], formatter);
        LocalTime time2 = LocalTime.parse(times[1], formatter);

        long minutesBetween = Duration.between(time1, time2).toMinutes();
        if (minutesBetween < 0) {
            minutesBetween += 24 * 60; // Add 24 hours if the second time is earlier
        }

        return String.valueOf(minutesBetween);
    }

    public static void main(String[] args) {
        System.out.println(getMinutesBetweenTimes("11:30pm-1:15am")); // 105
        System.out.println(getMinutesBetweenTimes("8:00am-10:30am")); // 150
        System.out.println(getMinutesBetweenTimes("10:45pm-2:30am")); // 225
    }
}
