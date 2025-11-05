// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numTerms = Integer.parseInt(args[0]);
		double seriesSum = 0;
		Boolean isAddNum = true; // Adds a number to the sum when True, else removes from it.

		// Converge the sum to π / 4 based on the given number of terms.
		for(int oddNum = 1; oddNum < numTerms * 2; oddNum += 2) {
			if (isAddNum) {
				seriesSum += (double) 1 / oddNum;
			} else {
				seriesSum -= (double) 1 / oddNum;
			}
			isAddNum = !isAddNum;
		} 

		// Prints pi according to java next to the calculated approximated pi.
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4 * seriesSum);
	}
}