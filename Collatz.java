// Demonstrates the Collatz conjecture.

public class Collatz {
	public static void main(String args[]) {
	    int numSeeds = Integer.parseInt(args[0]); // Highest number of seed.
		String mode = args[1]; // “v” (verbose) or “c” (concise).

		// Test the Collatz conjecture for all seeds from 1 to the given seeds number.
		for (int seed = 1; seed <= numSeeds; seed +=1) {
			int currentnum = seed;
			// Used to print the Collatz conjecture numbers based on the mode.
			String numbersText = currentnum + " ";
			int numSteps = 1;
			// Test the Collatz conjecture for a specific seed until it gets to 1.
			while (currentnum != 1 || numSteps == 1) {
				if (currentnum % 2 == 0) {
					currentnum = currentnum / 2;
				} else {
					currentnum = (currentnum * 3) + 1;
				}

				numbersText += currentnum  + " ";
				numSteps += 1;
			}

			// If the mode is "v" (verbose), prints a specific seed's sequence and the number of steps
			//  it took to reach 1.
			if (mode.equals("v")) {
				System.out.println(numbersText + "(" + numSteps + ")");
			}
		}

		// Prints a summary about the Collatz conjecture tests.
		String summary = String.format("Every one of the first %s hailstone sequences reached 1.",
		 numSeeds);
		System.out.println(summary);
	}
}