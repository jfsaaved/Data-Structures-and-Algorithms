package com.jfsaaved.doublylinkedlist;


public class DLL<AnyType>{
	
	private Node<AnyType> head;
	private Node<AnyType> tail;
	
	public DLL(){
	/*
		head = new Node;
		tail = new Node;
	*/
		head = null;
		tail = null;
	}
	
	public void addFirst(AnyType data){
		Node<AnyType> tmp = new Node<AnyType>(data, null, head);
		
		if(head == null){
			tail = tmp;
		}
		else if(head != null){
			head.prev = tmp;
		}
		head = tmp;
	}
	
	public void addLast(AnyType data){
		if(head == null){
			head = new Node<AnyType>(data, null, head);
			tail = head;
		}else{
			Node<AnyType> tmp = head;
			
			while(tmp.next != null)
				tmp = tmp.next;

			tail = new Node<AnyType>(data, tmp, null);
			tmp.next = tail;
		}
	}
	
	public void insertBefore(AnyType beforeThis, AnyType data){
		
	}
	
	public Node<AnyType> getHead(){
		return head;
	}
	
	public Node<AnyType> getTail(){
		return tail;
	}
	
	public class Node<AnyType>{
		
		private AnyType data;
		private Node<AnyType> prev;
		private Node<AnyType> next;
		
		public Node(AnyType data, Node<AnyType> prev, Node<AnyType> next){
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
		
		public AnyType getItem(){
			return data;
		}
		
		public Node<AnyType> getNext(){
			return next;
		}
		
		public Node<AnyType> getPrev(){
			return prev;
		}
		
		
	}

	
	
	public static void main(String[] args){
		
		System.out.println("Start");
		DLL<Integer> test = new DLL<Integer>();
		test.addLast(3);
		test.addLast(2);
		test.addLast(1);
		
		System.out.println(test.getHead().getItem());
		System.out.println(test.getHead().getNext().getItem());
		System.out.println(test.getHead().getNext().getNext().getItem());
		
		System.out.println(test.getTail().getItem());
		System.out.println(test.getTail().getPrev().getItem());
		System.out.println(test.getTail().getPrev().getPrev().getItem());
		
		
	}
	
}

