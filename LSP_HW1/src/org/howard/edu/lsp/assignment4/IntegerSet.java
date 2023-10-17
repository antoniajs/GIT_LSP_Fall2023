package org.howard.edu.lsp.assignment4;

import java.util.*;

/**
 * The IntegerSet class represents a set of integers and provides various
 * operations for manipulating and working with integer sets.
 * 
 * @author Antonia
 * @version 1.0
 */

public class IntegerSet {
		
// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default constructor to create an empty IntegerSet.
	 */
	public IntegerSet() {
	}
	
	/**
	 *  Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();		
	};

	/**Returns the number of integers in the set
	 * 
	 * @return The length of the set.
	 */
	public int length() {
		return set.size();
	}

	/**Returns true if the 2 sets are equal, false otherwise.
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * 
	 * @param b The IntegerSet to compare with this set.
	 * @return True if the two sets are equal or False otherwise.
	*/
	public boolean equals(IntegerSet b) {
		if (set.size() != b.length()) {
			return false;
		}
		
		for (Integer item: set) {
			if (!b.contains(item)) {
				return false;
			}
		}
		return true;
	} 

	/**
	 * Returns true if the set contains the value, otherwise false.
	 * 
	 * @param value The integer value being checked for in the set.
	 * @return True is the set contains the value or False if it does not.
	 */
	public boolean contains(int value) {
		return set.contains(value);
	}    

	/**
	 * Returns the largest item in the set. 
	 * Throws a IntegerSetException if the set is empty.
	 * 
	 * @return The largest integer value in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	public int largest() {
		if (isEmpty()) {
			throw new IntegerSetException("Set is empty");
		}
		
		int max = set.get(0);
		for (Integer item: set) {
			if (item > max) {
				max = item;
			}
		}
		
		return max;
	}

	/**
	 * Returns the smallest item in the set.
	 * Throws a IntegerSetException if the set is empty.
	 * 
	 * @return The smallest integer value in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	public int smallest() {
		if (isEmpty()) {
			throw new IntegerSetException("Set is empty");
		}
		
		int min = set.get(0);
		for(Integer item : set) {
			if(item < min) {
				min = item;
			}
		}
		
		return min;
	}

	/**
	 * Adds an integer value to the set if it is not there.
	 * 
	 * @param item The integer value to add to the set.
	 */
 	public void add(int item) {
 		if(!set.contains(item)) {
 			set.add(item);
 		}
 	} 

	/**
	 * Removes an integer value from the set if it is there.
	 * 
	 * @param item The integer value to remove from the set.
	 */
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}

	/**
	 * Performs the set union operation with another IntegerSet, adding all
	 * elements from the given set to this set.
	 * 
	 * @param intSetb The IntegerSet to perform the union operation with.
	 */
	public void union(IntegerSet intSetb) {
		for(Integer item : intSetb.set) {
			add(item);
		}
	}

	/**
	 * Performs the set intersection operation with another IntegerSet, keeping only
	 * elements that are present in both sets in this set.
	 * 
	 * @param intSetb The IntegerSet to perform the intersection operation with. 
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> intersection = new ArrayList<Integer>();
		for(Integer item: set) {
			if(intSetb.contains(item)) { 
				intersection.add(item);
			}
		}
		set = intersection;
	}

	/**
	 * Performs the set difference operation with another IntegerSet, keeping only
	 * elements that are present in this set but not in the provided set.
	 * 
	 * @param intSetb The IntegerSet to perform the difference operation with.
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> difference = new ArrayList<Integer>();
		for(Integer item : set) {
			if(!intSetb.contains(item)) {
				difference.add(item);
			}
		}
		
		set = difference;
	}

	/**
	 * Performs the set complement operation with another IntegerSet, keeping only
	 * elements that are present in this set and not in the provided set.
	 * 
	 * @param intSetb The IntegerSet to perform the complement operation with 
	 */
	public void complement(IntegerSet intSetb) {
		diff(intSetb);
	}

	/**
	 * Returns true if the set is empty, false otherwise. 
	 * 
	 * @return True if the set is empty, False otherwise.
	 */
	public boolean isEmpty() {
		return set.isEmpty();	
	}

	/**
	 * Returns a string representation of the set.
	 * 
	 * @return A string representation of the IntegerSet.
	 */
	public String toString() {
		return set.toString();
	}
}

/** 
 * Exception class for IntegerSet specific exceptions.
 */

class IntegerSetException extends RuntimeException{
	/**
	 * Constructs a new IntegerSetException with the specified message.
	 * 
	 * @param message The specified exception message.
	 */
	public IntegerSetException(String message) {
		super(message);
	}
}
