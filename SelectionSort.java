/**
 * @author Raika Roy Choudhury, APCS Peterson P2
 * SelectionSort class
 * Chapter 13 Programming Project
 * <p>
 * Traverses through an array and searches for the lowest, not examined value, 
 * swapping it with the first index of the array that has not been examined.
 *
 */

public class SelectionSort implements ISorter {
	/**
	 * Null Constructor
	 */
	public SelectionSort() {		
	}
		
	
	/**
	 * Inherited Sorting Method from ISorter interface
	 * Loops through array and swaps (sorts) elements accordingly
	 * @param a     The array passed in to be sorted
	 * @return SortStats     The statistics of the algorithm as described by the SortStat object 
	 */
	public ISortStats sort(int[] a) {
		int moves = 0;
		int comparisons = 0;
		long startTime = System.nanoTime();
					
		for(int i = 0; i < a.length - 1; i++) {
			int smallest = i;
			for(int j = i + 1; j < a.length; j++) {
				comparisons++;
				if(a[j] < a[smallest]) {
					smallest = j;
				}
			}
			if (i != smallest) {
				int swap = a[i];
				a[i] = a[smallest];
				a[smallest] = swap;
				moves += 3;
			}
		}
			
		long time = System.nanoTime() - startTime;
		return new SortStats("SelectionSort", a.length, comparisons, moves, time);
	}
		
//	// method swaps two array values
//	private static void swap(int[] list, int i, int j) {
//		int temp = list[i];
//		list[i] = list[j];
//		list[j] = temp;
//	}
}
