package tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jfsaaved.linkedlist.JuliansLinkedList;


public class LinkedListTest {
	JuliansLinkedList<Integer> linkedList;

	
	@Before
	public void init(){
		linkedList = new JuliansLinkedList<Integer>();
	}
	
	@Test
	public void addFirst_getSize_ShouldReturnOne() {
		linkedList.addFirst(1);
		assertEquals("getSize() should return 1", 1,linkedList.getSize());
	}
	
	@Test
	public void addLast_getSize_ShouldReturnOne(){
		linkedList.addFirst(1);
		assertEquals("getSize() should return 1", 1,linkedList.getSize());
	}
	
	@Test
	public void addFirst_onEmpty_shouldReturn23(){
		linkedList.addFirst(23);
		assertEquals("getFirst() should return 23", (Integer) 23,linkedList.getFirst());
	}
	
	@Test
	public void addLast_onEmpty_shouldReturn23(){
		linkedList.addLast(23);
		assertEquals("getFirst() should return 23", (Integer) 23,linkedList.getFirst());
	}

}
