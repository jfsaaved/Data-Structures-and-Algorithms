package com.jfsaaved.binarytreeold;

import java.util.*;

/*
* Julian Saavedra
* github.com/jfsaaved
* julian.felipe.saavedra@gmail.com
*/

public class Node<AnyType>{

	private AnyType data;
	private Node<AnyType> left;
	private Node<AnyType> right;

	public Node(AnyType data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setLeft(Node<AnyType> left){
		this.left = left;
	}
	
	public void setRight(Node<AnyType> right){
		this.right = right;
	}
	
	public Node<AnyType> getLeft(){
		return left;
	}

	public Node<AnyType> getRight(){
		return right;
	}
	
	public AnyType getData(){
		return data;
	}

}