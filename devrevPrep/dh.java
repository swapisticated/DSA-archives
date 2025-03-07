package devrevPrep;

public class dh {
    public static int getMinutesBetweenTimes(String timeRange) {
        String[] times = timeRange.split("-");

        int minutes1 = convertToMinutes(times[0]);
        int minutes2 = convertToMinutes(times[1]);

        int diff = minutes2 - minutes1;
        if (diff < 0) {
            diff += 24 * 60; // Adjust for next day
        }

        return diff;
    }

    private static int convertToMinutes(String time) {
        boolean isPM = time.contains("pm");
        time = time.replace("am", "").replace("pm", "");
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        if (isPM && hours != 12) hours += 12;
        if (!isPM && hours == 12) hours = 0;

        return hours * 60 + minutes;
    }

    public static void main(String[] args) {
        System.out.println(getMinutesBetweenTimes("11:30pm-1:15am")); // 105
        System.out.println(getMinutesBetweenTimes("8:00am-10:30am")); // 150
        System.out.println(getMinutesBetweenTimes("10:45pm-2:30am")); // 225
    }
}
