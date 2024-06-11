import java.util.Arrays;

/**
 *  @author Raika Roy Choudhury, APCS Peterson P2
 *  MergeSort Class
 *  Chapter 13 Programming Project
 *  <p>
 *  Splits given array into halves and recursively divides array into sub-arrays and puts them back sorted through comparisons
 *  <p>
 *  Puts the sub-arrays back into halves by comparing the elements in their respective original halves, and sorting them
 *  then comparing the elements in the halves, and sorting them (i.e. which element is bigger in the same index of the different sub-array?)
 *
 */

public class MergeSort implements ISorter {
	/**
	 * The amount of moves performed in the algorithm
	 */
	private int moves;
	/**
	 * The number of comparisons made in the algorithm
	 */
	private int comparisons;
	
	
	/**
	 * Null Constructor
	 */
	public MergeSort() {
		moves = 0;
		comparisons = 0;
	}
	
	
	/**
	 * Inherited Sorting Method from ISorter interface
	 * Divides array and swaps/sorts accordingly through calling 'split' helper method
	 * @param a     The array to be sorted
	 * @return SortStats     The statistics of the algorithm as described by the SortStat object 
	 */
	public ISortStats sort(int[] a) {
		long startTime = System.nanoTime();
		split(a);
		long time = System.nanoTime() - startTime;
		return new SortStats("MergeSort", a.length, comparisons, moves, time);
	}
	
	
	/**
	 * Main code for the recursive MergeSort algorithm
	 * @param a     The array to be sorted
	 */
	private void split(int[] a) {
		if (a.length > 1) {
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			
			split(left);
			split(right);
			
			merge(a, left, right);
		}
	}
	
	
	/**
	 * Helper method to merge the 'split' sub-arrays in the correct arrays
	 * @param a     (Sub)Array passed (recursively) to be sorted
	 * @param left     Left half of given array
	 * @param right     Right half of given array
	 */
	private void merge(int[] a, int[] left, int[] right) {
		int i1 = 0;
		int i2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				a[i] = left[i1];
				i1++;
				
				//only add comparisons if the left condition is false so that we know the elements are compared (right condition)
				if (i2 < right.length) {
					comparisons++;
				}
			} else {
				a[i] = right[i2];
				i2++;
				comparisons++;
			}
			moves++;
		}
	}
	
	
	/*
	 *
	// REFERENCED MERGE SORT CODE (TAKEN FROM BUILDING JAVA PROGRAMS TEXTBOOK)
	//places the elements of given array into sorted order recursively
	public static void mergeSort(int[] a) {
		if (a.length > 1) {
			//split array into 2 halves
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length/2, a.length);
			
			//recursively sort the 2 halves
			mergeSort(left);
			mergeSort(right);
			
			//merge sorted halves into a sorted whole
			merge(a, left, right);
		}
	}
	
	//merges given left and right arrays into result array
	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0; //index into left array
		int i2 = 0; //index into right array
		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1]; //take from left
				i1++;
			} else {
				result[i] = right[i2]; //take from right
				i2++;
			}
		}
	}
	*
	*/
	
}
