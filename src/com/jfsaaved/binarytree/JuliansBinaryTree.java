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
		
		else if(node.data == data){
			return node;
		}
		
		else{
			
			if(node.data.compareTo(data) > 0){
				node.left = insert(node.left,data);
			}
			else {
				node.right = insert(node.right,data);
			}
			
		}
		
		return node;
		
	}
	
	
	public boolean search(AnyType data){
		return search(root,data);
	}
	
	public boolean search(Node<AnyType> node, AnyType data){
		if(node == null){
			return false;
		}
		else if(node.data.compareTo(data) == 0){
			return true;
		}
		else{
			if(node.data.compareTo(data) > 0){
				return search(node.left,data);
			}
			else{
				return search(node.right,data);
			}
		}
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
