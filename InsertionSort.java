/**
 *  @author Raika Roy Choudhury, APCS Peterson P2
 *  InsertionSort Class
 *  Chapter 13 Programming Project
 *  <p>
 *  Compares element in array to preceding elements and inserts it into exact position to maintain an ascending order
 *
 */

public class InsertionSort implements ISorter {
	/**
	 * Null Constructor
	 */
	public InsertionSort() {	
	}
	
	
	/**
	 * Inherited Sorting Method from ISorter interface
	 * Loops through array and swaps (sorts) elements accordingly
	 * @param a     The array passed in to be sorted
	 * @return SortStats     The statistics of the algorithm as described by the SortStat object 
	 */
	public ISortStats sort(int[] a) {
		int comparisons = 0;
		int moves = 0;
		long startTime = System.nanoTime();
		
		for (int j = 1; j < a.length; j++) {  
            int key = a[j];  
            int i = j - 1;  
            moves++;
            
            while (i >= 0 && (a[i] > key ) ) {  
                a[i + 1] = a[i];  
                i--;  
                comparisons++;
                moves++;
            }              
            a[i + 1] = key;  
            comparisons++;
            moves++;
        }  
		
		long time = System.nanoTime() - startTime;
		return new SortStats("InsertionSort", a.length, comparisons, moves, time);
		
	}
}
