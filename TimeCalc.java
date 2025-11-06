// Adds minutes to the time stamp.

public class TimeCalc {
    public static void main(String[] args) {
        // Gets the time stamp from the user.
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        // Calculates the new hours and minutes after adding the given minutes.
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        // Adds 0 before single minutes (under 10 minutes).
        String minutesText = String.format("%s", newMinutes);
        if (newMinutes < 10) {
            minutesText = String.format("0%s", newMinutes);
        }

        // Adds 0 before single hours (under 10 hours).
        String hoursText = String.format("%s", newHours);
        if (newHours < 10) {
            hoursText = String.format("0%s", newHours);
        }

        // Prints the new time stamp.
        String newTime = hoursText + ":" + minutesText;
        System.out.println(newTime);
    }
}