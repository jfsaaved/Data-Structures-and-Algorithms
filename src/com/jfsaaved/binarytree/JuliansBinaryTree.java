package com.jfsaaved.binarytree;

public class JuliansBinaryTree<AnyType> {
	
	private Node<AnyType> root;
	
	public JuliansBinaryTree(){
		root = null;
	}
	
	
	private static class Node<AnyType>{
		
		private AnyType data;
		private Node<AnyType> left;
		private Node<AnyType> right;
		
		private Node(AnyType data, Node<AnyType> left, Node<AnyType> right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		
	}
	

}
