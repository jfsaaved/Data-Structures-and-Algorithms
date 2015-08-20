package com.jfsaaved.binarytree;

public class JuliansBinaryTree<AnyType extends Comparable<AnyType>> {
	
	private Node<AnyType> root;
	
	public JuliansBinaryTree(){
		root = null;
	}
	
	public void insert(AnyType data){
		root = insert(root,data);
	}
	
	public Node<AnyType> insert(Node<AnyType> node, AnyType data){
		
		if(node == null){
			node = new Node<AnyType>(data);
		}
		else{
			
		}
		
		
		return node;
		
	}
	
	private static class Node<AnyType>{
		
		private AnyType data;
		private Node<AnyType> left;
		private Node<AnyType> right;
		
		private Node(AnyType data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		
	}
	

}
