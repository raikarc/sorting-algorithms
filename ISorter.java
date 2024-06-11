/**
 * @author Raika Roy Choudhury, APCS Peterson P2
 * ISorter interface
 * Chapter 13 Programming Project
 * <p>
 * This interface is to be implemented by each of the sorting algorithms, contains their main sorting functions 
 */
public interface ISorter {
	/**
	 * Abstract method that, when implemented, will sort the passed array
	 * @param a     The array to be sorted
	 * @return     SortStats object detailing statistics of given sorted algorithm
	 */
	ISortStats sort(int[] a);
}
