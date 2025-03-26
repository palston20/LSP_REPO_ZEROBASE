package org.howard.edu.lsp.assignment5;

/**
 * This class is used to test IntegerSet.
 */

public class Driver {

	/**
	 * the main method tests different methods of the IntegerSet class
	 * @param args Command line arguments (not used0
	 */
	public static void main(String[] args) {
		//Create and test first set
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());
		
		// Create and test second set
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Print sets before union operation
        System.out.println("Value of Set2 is: " + set2.toString());

        // Perform union operation
        System.out.println("Performing union of Set1 and Set2...");
        set1.union(set2);
        System.out.println("Result of union: " + set1.toString());

        // Perform intersection operation
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Performing intersection of Set1 and Set2...");
        set1.intersect(set2);
        System.out.println("Result of intersection: " + set1.toString());

        // Perform difference operation
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Performing difference (Set1 - Set2)...");
        set1.diff(set2);
        System.out.println("Result of difference: " + set1.toString());

        // Check if a set is empty
        System.out.println("Is Set1 empty? " + set1.isEmpty());

	}

}
