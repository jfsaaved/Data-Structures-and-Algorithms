package com.jfsaaved;

import java.util.Iterator;

import com.jfsaaved.binarytree.JuliansBinaryTree;
import com.jfsaaved.linkedlist.JuliansLinkedList;

public class Main {

	public static void main(String[] args) {
		
		/*System.out.println("Running stuff");
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
		System.out.println(julian_iterator.next());*/
		
		
		JuliansBinaryTree<Integer> btree = new JuliansBinaryTree<Integer>();
		btree.insert(5);
		btree.insert(4);
		btree.insert(3);
		
		System.out.println(btree.search(5));
		System.out.println(btree.search(4));
		System.out.println(btree.search(3));
		System.out.println(btree.search(1));

	}

}
