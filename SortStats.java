/**
 * @author Raika Roy Choudhury, APCS Peterson P2
 * SortStats class
 * Chapter 13 Programming Project
 * <p>
 * Creates SortStats object 
 * <p>
 * Details the overall efficiency of a sorting algorithm, including nanoseconds (time) taken to sort, 
 * number of comparisons, and amount of moves made while sorting
 */
public class SortStats implements ISortStats {	
	// private variables
	private String algorithm;
	private int numItems;
	private int numComparisons;
	private int numMoves;
	private long numNanoseconds;
	
	/**
	 * Constructor method for SortStats
	 * @param alg		the name of the algorithm 
	 * @param items		the amount of items in array
	 * @param comps		the number of comparisons made
	 * @param moves		the number of moves made
	 * @param nanos		the time taken to sort in nanoseconds
	 */
	public SortStats(String algorithm, int items, int comparisons, int moves, long nanoseconds) {
		this.algorithm = algorithm;
		numItems = items;
		numComparisons = comparisons;
		numMoves = moves;
		numNanoseconds = nanoseconds;
	}
	
	/**
	 * Accessor method
     * @Override
     * @return algorithm		Name of the algorithm
	 */
	public String getAlgorithm() {
		return algorithm;
	}
	
	/**
	 * Accessor method
     * @Override
     * @return numItems		Number of items in array
	 */
	public int getNumItems() {
		return numItems;
	}

	/**
	 * Accessor method 
     * @Override
     * @return numComparisons     Number of comparisons made
	 */
	public int getNumComparisons() {
		return numComparisons;
	}

	/**
	 * Accessor method 
     * @Override
     * @return numMoves     Number of moves made
	 */
	public int getNumMoves() {
		return numMoves;
	}
	
	/**
	 * Accessor method 
     * @Override
     * @return numNanoseconds     Nanoseconds (time) taken to sort
	 */
	public long getNumNanoseconds() {
		return numNanoseconds;
	}
	
	/**
	 * @Override
     * toString method that converts SortStats object into string 
     * @return String     The string conversion of the instance variables
     */
	public String toString() {
		return "\"Algorithm\"\t: \"<" + algorithm + ">\","
		+ "\n\"NumItems\"\t: \"<" + numItems + ">\","
		+ "\n\"NumComparisons\": \"<" + numComparisons + ">\","
		+ "\n\"NumMoves\"\t: \"<" + numMoves + ">\","
		+ "\n\"NumNanoseconds\": \"<" + numNanoseconds + ">\"";
		}

}
