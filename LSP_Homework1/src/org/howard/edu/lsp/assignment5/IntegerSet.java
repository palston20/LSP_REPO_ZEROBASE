package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;
/**
 * This class represents sets of integers.
 * It will have functions and operations such as union intersection, max, min, etc
 * using an Array List
 */
public class IntegerSet {
	//Store set elements in ArrayList
	private List<Integer> set = new ArrayList<Integer>();
	
	//Default Constructor 
	public IntegerSet() {
		/**
		 * Constructor will initialize the set with given values.
		 * @param set List of integers to initialize the set
		 */
		
}

	//Constructor if you want to pass in already initialized 
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
		for(int num: set) {
			if (!this.set.contains(num)) {
				this.set.add(num);
			}
		}
	};
	
	//Clears the internal representation of the set.
	public void clear() {
		set.clear();
	};
	
	
	/**
	 * returns the length of the set
	 * @return Number of elements in the set. 
	 */
	
	//Returns the length of the set.
	public int length() {
		return 0;
		
	}; 
	
	/*
	 * Checks if two sets are equal.
	 * @param o Another object to compare
	 * @return True if sets have the same elements,, false otherwise.
	 */
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof IntegerSet) {
			IntegerSet otherSet = (IntegerSet) o;
			return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
		}
		return false;
	};
	
	/**
     * Checks if the set contains a given value.
     * @param value Value to check.
     * @return True if value exists in the set, false otherwise.
     */
	
	//Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return set.contains(value);
	};
	
	
	/**
     * Returns the largest item in the set.
     * @return Largest integer in the set.
     * @throws RuntimeException if set is empty
     */
	
	// Returns the largest item in the set. 
	public int largest()  {
		if (set.isEmpty()) {
			throw new RuntimeException("Set is empty");
		}
		return set.stream().max(Integer::compareTo).get();
		}; 

	/**
	 * Returns the smallest item in set	
	 * @return Smallest integer in set
	 * @throws RuntimeException is set is empty.
	 */
		
	// Returns the smallest item in the set. 
	public int smallest()  {
		if (set.isEmpty()) {
			throw new RuntimeException("Set is empty");
		}
		return set.stream().min(Integer::compareTo).get();
	};
	
	/**
	 * Adds an item to the set if it's not already there
	 * @param item Adds item
	 */

	// Adds an item to the set or does nothing it already there. 
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
			}
		} // adds item to the set or does nothing if it is in set
	
	
	/**
	 * Removes an item from the set
	 * @param item Removes item
	 */

	// Removes an item from the set or does nothing if not there.
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
		
	}; 
	
	/**
	 * Unites with another set
	 * @param intSetb Another IntegerSet.
	 */

	// Set union. 
	public void union(IntegerSet intSetb) {
		for (int num : intSetb.set) {
			if (!set.contains(num) ) {
				set.add(num);
			}
		}
		
	}
	
	
	/**
	 * Intersects with another set 
	 * @param intSetb Another IntegerSet
	 */

	// Set intersection, all elements in s1 and s2. 
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
		
	}; 

	
	/**
	 * Finds the set difference
	 * @param intSetb Another IntegerSet 
	 */
	// Set difference, i.e., s1 –s2. 
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
		
	}; // set difference, i.e. s1 - s2
	
	
	
	/**
	 * Finds the complement between sets.
	 * @param intSetb Another IntegerSet
	 */

	// Set complement, all elements not in s1. 
	public void complement(IntegerSet intSetb) { 
		List<Integer> temp = new ArrayList<>(intSetb.set);
		temp.removeAll(set);
		set = temp;
		
	};
	
	
	/**
	 * Checks if a set is empty
	 * @return True if the set is empty, false otherwise.
	 */

	// Returns true if the set is empty, false otherwise. 
	boolean isEmpty() {
		return set.isEmpty();
		
	}; 
	
	/**
	 * Returns a string representation of the set.
	 * @return String representation fo set elemtns
	 */

	// Return String representation of your set.  This overrides the equal method from 
	// the Object class.
	@Override
	public String toString() {
		return set.toString();
		
	};	// return String representation of your set

	
}
