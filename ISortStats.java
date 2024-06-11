/**
 * @author Raika Roy Choudhury, APCS Peterson P2
 * ISortStats interface
 * Chapter 13 Programming Project
 * <p>
 * This interface is to be implemented by SortStats
 * <p>
 * Lays out methods for SortStats class to use
 */
public interface ISortStats {
	/**
	 * Abstract Method
	 * @return String     Name of algorithm
	 */
	String getAlgorithm();
	
	/**
	 * Abstract Method
	 * @return int     Number of items in each array
	 */
	int getNumItems();
	
	/**
	 * Abstract Method 
	 * @return int     Number of comparisons made by each sorting algo
	 */
	int getNumComparisons();
	
	/**
	 * Abstract Method
	 * @return int  Number of moves made by each sorting algo   
	 */
	int getNumMoves();
	
	/**
	 * Abstract Method
	 * @return long     Nanoseconds taken to sort by each sorting algo
	 */
	long getNumNanoseconds();
}
