// Demonstrates the Collatz conjecture.

public class Collatz {
	public static void main(String args[]) {
		int numSeeds = Integer.parseInt(args[0]); // Highest number of seeds.
		String mode = args[1]; // “v” (verbose) or “c” (concise).

		// Test the Collatz conjecture for all seeds from 1 to the highest seeds number.
		for (int seed = 1; seed <= numSeeds; seed += 1) {
			int currentNum = seed;
			String seedSequence = currentNum + " ";
			int numSteps = 1;
			// Test the Collatz conjecture for a specific seed until it gets to 1.
			while (currentNum != 1 || numSteps == 1) {
				if (currentNum % 2 == 0) {
					currentNum = currentNum / 2;
				} else {
					currentNum = (currentNum * 3) + 1;
				}

				seedSequence += currentNum + " ";
				numSteps += 1;
			}

			// If the mode is "v" (verbose), prints the seed's sequence and the number 
			//  of steps it took to reach 1.
			if (mode.equals("v")) {
				System.out.println(seedSequence + "(" + numSteps + ")");
			}
		}

		// Prints a summary about the Collatz conjecture tests.
		String summary = String.format("Every one of the first %s hailstone sequences reached 1.",
				numSeeds);
		System.out.println(summary);
	}
}