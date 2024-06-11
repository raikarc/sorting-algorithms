/**
 * @author Raika Roy Choudhury, APCS Peterson P2
 * Check class
 * Chapter 13 Programming Project
 * <p>
 * This class returns a boolean indicating whether the passed array is sorted (in ascending) order or not
 */
public class Check {
	/**
	 * Checks if array passed is sorted
	 * @param a     The array to be checked
	 * @return true     boolean saying whether array is sorted
	 */
	public static boolean isInOrder(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
