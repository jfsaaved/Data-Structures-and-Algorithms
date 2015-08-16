package com.jfsaaved.linkedlist;

import java.util.Iterator;

/*
 * Julian Saavedra
 * August 16, 2015
 * julian.felipe.saavedra@gmail.com
 * GitHub: github.com/jfsaaved
 * 
 * A better implementation vs the old one
 */

public class JuliansLinkedList<AnyType> {
	
	private Node<AnyType> head;
	private int size;
	
	public JuliansLinkedList(){
		head = null;
		size = 0;
	}
	
	public void addFirst(AnyType data){
		head = new Node<AnyType>(data,head);
		size++;
	}
	
	public void addLast(AnyType data){
		if(head == null) 
			addFirst(data);
		else{
			Node<AnyType> tmp = head;
			while(tmp.next != null){
				tmp = tmp.next;
			}
			tmp.next = new Node<AnyType>(data,null);
			size++;
		}
	}
	
	public void insertBefore(AnyType beforeThis, AnyType addThis){
		
		Node<AnyType> prev = null;
		Node<AnyType> cur = head;
		
		while(!cur.data.equals(beforeThis) && cur != null){
			prev = cur;
			cur = cur.next;
		}
		
		if(cur != null){
			prev.next = new Node<AnyType>(addThis,cur);
			size++;
		}
		else{
			System.out.println("Node does not exist");
		}
		
	}
	
	
	public int getSize(){
		return size;
	}
	
	public Iterator<AnyType> iterator(){
		return new JuliansListIterator();
	}

	private static class Node<AnyType>{
		
		private AnyType data;
		private Node<AnyType> next;
		
		private Node(AnyType data, Node<AnyType> next){
			
			this.data = data;
			this.next = next;
		}

	}
	
	private class JuliansListIterator implements Iterator<AnyType> {
		
		private Node<AnyType> nextNode;
		
		public JuliansListIterator(){
			nextNode = head;
		}
		
		public boolean hasNext(){
			if(nextNode != null){
				return true;
			}
			else{
				return false;
			}
		}
		
		public AnyType next(){
			if(!hasNext()){
				System.out.println("You reached the end of the list");
				return null;
			}
			else{
				AnyType giveData = nextNode.data;
				nextNode = nextNode.next;
				return giveData;
			}
		}
		
	}

}
