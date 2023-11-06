/**
 * The Driver class serves as the driver program to test the IntegerSet class.
 * 
 * @author Antonia
 * @version 1.0
 */

package org.howard.edu.lsp.assignment5;

import java.util.*;


public class Driver {
	/**
	 * The main method to execute all the methods from IntegerSet
	 * 
	 * @param args The command-line arguments (not used in this program).
	 */
	public static void main(String[] args) {
		
		//create an IntegerSet object using the constructor
		IntegerSet set1 = new IntegerSet();
		
		//add elements to the set using the add() method
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		//test all the methods
		System.out.println("Value of Set1 is: " + set1.toString()); //toString() method
		set1.remove(4); //removing the value 4 using the remove() method
		System.out.println("Value of Set1 is now: " + set1.toString());
		System.out.println("The set is empty: " + set1.isEmpty()); //isEmpty() method
		System.out.println("Length of the set: "+ set1.length()); //length() method
		System.out.println("The value 4 is in the set: " + set1.contains(4)); //contains() method
		System.out.println("Smallest value in Set1 is: " + set1.smallest()); //smallest() method
		System.out.println("Largest value in Set1 is: " + set1.largest()); //largest() method

		//create a second set to test more methods
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);

		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("Value of Set2 is:" + set2.toString());
		System.out.println("Set1 is equal to Set2: "+ set1.equals(set2)); //equals() method
		set1.union(set2);	// union of set1 and set2 using the union() method
		System.out.println("Union with set 2: " + set1.toString());
		set1.intersect(set2); //intersect() method
		System.out.println("Intersection with Set2: " + set1.toString());
		set1.diff(set2); //diff() method
		System.out.println("Set1 difference with Set2: " + set1.toString());
		set1.complement(set2); //complement() method
		System.out.println("Complement with Set2: " + set1.toString());
		
		//clear the set using the clear() method
		set1.clear();
		System.out.println("Cleared Set1:" + set1.toString());

	}

}
