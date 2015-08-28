package com.jfsaaved;

import java.util.Iterator;

import com.jfsaaved.binarytree.JuliansBinaryTree;
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
		
		
		juliansLL.reverseRecursion();
		julian_iterator = juliansLL.iterator();
		System.out.println(julian_iterator.next());
		System.out.println(julian_iterator.next());
		System.out.println(julian_iterator.next());
		
		
		JuliansBinaryTree<Integer> btree = new JuliansBinaryTree<Integer>();
		btree.insert(11);
		btree.insert(6);
		btree.insert(8);
		btree.insert(19);
		btree.insert(4);
		btree.insert(10);
		btree.insert(5);
		btree.insert(17);
		btree.insert(43);
		btree.insert(49);
		btree.insert(31);
		
		btree.preOrder();
		System.out.println("");
		btree.inOrder();
		

	}

}
