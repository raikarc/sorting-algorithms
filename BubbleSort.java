/**
 * @author Raika Roy Choudhury, APCS Peterson P2
 * BubbleSort class
 * Chapter 13 Programming Project
 * <p>
 * Compares two adjacent elements in array and swaps based on which is larger
 * <p>
 * Swaps the larger element in the comparison towards the right of the array;
 * it "bubbles" the largest element through comparisons to the end of the array
 * This repeats until the algorithm passes through the array without completing any swaps (once more than sorted). 
 * 
 */

public class BubbleSort implements ISorter {
	/**
	 * Null Constructor
	 */
	public BubbleSort() {		
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
		long starttime = System.nanoTime();
			
		for(int i = a.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				comparisons++;
				if(a[j] > a[j + 1]){
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					moves += 3;
				}
			}
		}
			
		long time = System.nanoTime() - starttime;
		return new SortStats("BubbleSort", a.length, comparisons, moves, time);
	}
		
//	/**
//	 * Separate swapping method accessed in 'sort' method to swap values
//	 * @param list     The list to be sorted
//	 * @param i     The first value to be swapped
//	 * @param j     The second value to be swapped
//	 */
//	private static void swap(int[] list, int i, int j) {
//		int temp = list[i];
//		list[i] = list[j];
//		list[j] = temp;
//	}
	
}
