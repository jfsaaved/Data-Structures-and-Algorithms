package linkedlist;

import java.util.*;

/*
* Julian Saavedra
* github.com/jfsaaved
* julian.felipe.saavedra@gmail.com
*/

public class LinkedList<AnyType>
{
	private Node<AnyType> head;
	private int size;
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	
	public void addFirst(AnyType data){
		head = new Node<AnyType>(data,head);
		size++;
	}
	
	public void addLast(AnyType data){
		if(head == null){
			addFirst(data);
		}
		else{
			Node<AnyType> tmp = head;	
			while(tmp.getNext() != null){
				tmp = tmp.getNext();
			}
			tmp.setNext(new Node<AnyType>(data,null));
			size++;
		}
	}
	
	public void insertAfter(AnyType insertThis, AnyType afterThis){
		Node<AnyType> tmp = head;
		while(tmp != null && !tmp.getData().equals(afterThis)){
			tmp = tmp.getNext();
		}
		
		if(tmp != null){
			tmp.setNext(new Node<AnyType>(insertThis,tmp.getNext()));
			size++;
		}
		else{
			System.out.println(afterThis + " not found!");
		}
	}
	
	public void insertBefore(AnyType insertThis, AnyType beforeThis){
	
		if(head.getData().equals(beforeThis)){
			addFirst(insertThis);
		}
		else{
			Node<AnyType> prev = null;
			Node<AnyType> cur = head;
			
			while(cur !=null && !cur.getData().equals(beforeThis)){
				prev = cur;
				cur = cur.getNext();
			}
			
			if(cur != null){
				prev.setNext(new Node<AnyType>(insertThis,cur));
				size++;
			}
			else{
				System.out.println(beforeThis +" not found!");
			}
		}
	}
	
	public void delete(AnyType deleteThis){
		if(head == null){
			throw new RuntimeException("Nothing to delete");
		}
		
		else if(head.getData().equals(deleteThis)){
			head = head.getNext();
			size--;
		}
		
		else{
			Node<AnyType> prev = head;
			Node<AnyType> cur = head;
			
			while(cur !=null && !cur.getData().equals(deleteThis)){
				prev = cur;
				cur = cur.getNext();
			}
			if(cur == null){
				throw new RuntimeException("Can not find node " + deleteThis);
			}	
			else{
				prev.setNext(cur.getNext());
				cur = null;
				size--;
			}
		}		
	}
	
	public Node<AnyType> getFirst(){
		if(head == null) throw new NoSuchElementException();
		return head;
	}
	
	public Node<AnyType> getLast(){
		if(head == null) throw new NoSuchElementException();
		Node<AnyType> tmp = head;
		while(tmp.getNext() != null){
			tmp = tmp.getNext();
		}
		
		return tmp;
	}
	
	public AnyType peek(){
		if(head == null) throw new NoSuchElementException();
		return head.getData();
	}
	
	public int getSize(){
		return size;
	}
	
	public LinkedList<AnyType> copy(){
		if(head == null) throw new NoSuchElementException();
		
		LinkedList<AnyType> theCopy = new LinkedList<AnyType>();
		Node<AnyType> tmp = head;
		theCopy.addFirst(head.getData());
		
		while(tmp.getNext() != null){
			tmp = tmp.getNext();
			theCopy.addLast(tmp.getData());
		}
		
		return theCopy;
	}
	
	public void reverse(){
		if(head == null) throw new NoSuchElementException();
		
		Node<AnyType> tmp = head;
		
		size--;
		addFirst(tmp.getData());
		head.setNext(null);
		
		while(tmp.getNext() != null){
			tmp = tmp.getNext();
			size--;
			addFirst(tmp.getData());
		}
	}
	
	public void reverse_recur(){
		if(head == null) throw new NoSuchElementException();
		else reverse_recur(head);
	}
	
	public void reverse_recur(Node<AnyType> node){
		if(node == null) 
			return;
		if(node.getNext() == null){
			head = node;
			return;
		}
		
		reverse_recur(node.getNext());
		
		Node<AnyType> second_node = node.getNext();
		second_node.setNext(node);
		node.setNext(null);
		
	}
	
}