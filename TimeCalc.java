public class TimeCalc {
    public static void main(String[] args) {
        // Gets the time stamp and the added minutes from the user.
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

        // Prints the new time stamp.
        String message = newHours + ":" + minutesText;
        System.out.println(message);
    }
}
