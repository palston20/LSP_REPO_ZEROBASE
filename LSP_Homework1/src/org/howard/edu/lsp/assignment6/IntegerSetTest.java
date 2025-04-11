package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

	@Test
	@DisplayName ("Test for clear method")
	
	public void testClear() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(2);
		set.clear();
		assertTrue(set.isEmpty());
	}
	
	
	@Test 
	@DisplayName ("Test for length method")
	public void testLength() {
		IntegerSet set = new IntegerSet();
		assertEquals(0, set.length());
		set.add(5);
		assertEquals(1, set.length());
	}
	
	
	@Test
	@DisplayName("test for equals method)")
	public void testContains() {
		IntegerSet set = new IntegerSet();
		set.add(3);
		assertTrue(set.contains(3));
		assertFalse(set.contains(5));
	}
	
	@Test
	@DisplayName("Test for largest with elements")
	public void testLargest() {
		IntegerSet set = new IntegerSet();
		set.add(10);
		set.add(5);
		assertEquals(10, set.largest());
	}
	
	@Test
	@DisplayName("test largest with empty set (exception")
	public void testLargestException() {
		IntegerSet set = new IntegerSet();
		assertThrows(RuntimeException.class, () -> {
			set.largest();
		});
	}
	
	@Test 
	@DisplayName("Test smallest with elements")
	public void testSmallest() {
		IntegerSet set = new IntegerSet();
		set.add(3);
		set.add(7);
		assertEquals(3, set.smallest());
	}
	
	@Test
	@DisplayName("Test smallest with empty set (exception)")
	public void testSmallestException() {
		IntegerSet set = new IntegerSet();
		assertThrows(RuntimeException.class, () -> {
			set.smallest();
		});
	}
	
	@Test
	@DisplayName("Test for add method")
	public void testAdd() {
		IntegerSet set = new IntegerSet();
		set.add(1);
		set.add(1);
		assertEquals(1, set.length());
	}
	
	@Test
    @DisplayName("Test remove method")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        set.remove(5);
        assertFalse(set.contains(5));
    }

    @Test
    @DisplayName("Test union method")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test intersect method")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.intersect(set2);
        assertEquals(1, set1.length());
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test diff method")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.diff(set2);
        assertFalse(set1.contains(2));
        assertTrue(set1.contains(1));
    }

    @Test
    @DisplayName("Test complement method")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(1);
        set2.add(2);
        set1.complement(set2); // should now be [2]
        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test isEmpty method")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(4);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test toString method")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(10);
        assertEquals("[10]", set.toString());
    }
}
