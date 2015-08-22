package com.jfsaaved;

import java.util.Iterator;
import com.jfsaaved.linkedlist.JuliansLinkedList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Running stuff");
		JuliansLinkedList<Integer> juliansLL = new JuliansLinkedList<Integer>();
		
		juliansLL.addFirst(5);
		juliansLL.addFirst(6);
		juliansLL.insertAfter(5,7);
		
		Iterator<Integer> julian_iterator = juliansLL.iterator();
		System.out.println(julian_iterator.next());
		System.out.println(julian_iterator.next());
		System.out.println(julian_iterator.next());
		
		
		juliansLL.reverse();
		julian_iterator = juliansLL.iterator();
		System.out.println(julian_iterator.next());
		System.out.println(julian_iterator.next());
		System.out.println(julian_iterator.next());
		

	}

}
