package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import com.jfsaaved.linkedlist.LinkedList;


public class LinkedListTest {

	@Test
	public void sizeShouldReturnOne() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.addFirst(1);
		assertEquals("getSize() should return 1", 1,linkedList.getSize());
	}

}
