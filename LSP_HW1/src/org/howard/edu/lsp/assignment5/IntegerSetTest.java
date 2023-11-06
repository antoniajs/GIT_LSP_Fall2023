package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	private IntegerSet integerSet;
	
	@BeforeEach
	void setUp() {
		integerSet = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for clear()")
	public void testClear() {
		//JUnit test case for clear
		integerSet.add(5);
		integerSet.clear();
		assertTrue(integerSet.isEmpty());	
	}
	
	@Test
	@DisplayName("Test case for length()")
	public void testLength() {
		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(3);
		assertEquals(integerSet.length(), 3);		
	}
	
	@Test
	@DisplayName("Test case for equals()")
	public void testEquals() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		IntegerSet set2 = new IntegerSet();
		
		set2.add(3);
		set2.add(2);
		set2.add(1);
		
		assertTrue(set1.equals(set2));
	}
	
	@Test
	@DisplayName("Test case for contains()")
	public void testContains() {
		integerSet.add(4);
		assertTrue(integerSet.contains(4));
		assertFalse(integerSet.contains(5));
	}
	
	@Test
	@DisplayName("Test case for largest()")
	public void testLargest() {
		integerSet.add(5);
		integerSet.add(6);
		assertEquals(integerSet.largest(), 6);
	}
	
	@Test
	@DisplayName("Test case for smallest()")
	public void testSmallest() {
		integerSet.add(7);
		integerSet.add(8);
		assertEquals(integerSet.smallest(), 7);
	}
	
	@Test
	@DisplayName("Test case for add()")
	public void testAdd() {
		integerSet.add(9);
		integerSet.add(10);
		assertTrue(integerSet.contains(9));
		assertTrue(integerSet.contains(10));
	}
	
	@Test
	@DisplayName("Test case for remove()")
	public void testRemove() {
		integerSet.add(11);
		integerSet.add(12);
		integerSet.remove(12);
		assertTrue(integerSet.contains(11));
		assertFalse(integerSet.contains(12));
	}
	
	@Test
	@DisplayName("Test case for union()")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
				
		IntegerSet set2 = new IntegerSet();
		
		set2.add(2);
		set2.add(3);
		
		set1.union(set2);
				
		assertTrue(set1.contains(3));
	}
	
	@Test
	@DisplayName("Test case for intersect()")
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
				
		IntegerSet set2 = new IntegerSet();
		
		set2.add(2);
		set2.add(3);
		
		set1.intersect(set2);
				
		assertTrue(set1.contains(2));
		assertFalse(set1.contains(1));
		assertFalse(set1.contains(3));
	}
	
	@Test
	@DisplayName("Test case for difference()")
	public void testDiff() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
				
		IntegerSet set2 = new IntegerSet();
		
		set2.add(2);
		set2.add(3);
		
		set1.diff(set2);
				
		assertTrue(set1.contains(1));
		assertFalse(set1.contains(2));
		assertFalse(set1.contains(3));
	}
	
	@Test
	@DisplayName("Test case for complement()")
	public void testComplement() {
		IntegerSet set1 = new IntegerSet();
		
		set1.add(1);
		set1.add(2);
				
		IntegerSet set2 = new IntegerSet();
		
		set2.add(2);
		set2.add(3);
		
		set1.complement(set2);
				
		assertTrue(set1.contains(2));
		assertFalse(set1.contains(1));
		assertFalse(set1.contains(3));
	}
	
	@Test
	@DisplayName("Test case for isEmpty()")
	public void testIsEmpty() {
		assertTrue(integerSet.isEmpty());
		integerSet.add(1);
		assertFalse(integerSet.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString()")
	public void testtoString() {
		integerSet.add(1);
		integerSet.add(2);
		assertEquals("{1, 2}", integerSet.toString());

	}
		
	
}
