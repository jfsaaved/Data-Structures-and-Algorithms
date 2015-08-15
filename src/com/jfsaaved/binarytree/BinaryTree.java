package com.jfsaaved.binarytree;

import java.util.*;

/*
* Julian Saavedra
* github.com/jfsaaved
* julian.felipe.saavedra@gmail.com
*/

public class BinaryTree<AnyType extends Comparable<AnyType>>{
	
	private Node<AnyType> parent;

	public BinaryTree(){
		parent = null;
	}
	
	public void insertNode(AnyType data){
		Node<AnyType> newNode = new Node<AnyType>(data);
	
		if(parent == null){
			parent = newNode;
		}
		else{
			Node<AnyType> tmp = parent;
			while(tmp.getLeft() != null){
				tmp = tmp.getLeft();
			}
			tmp.setLeft(newNode);
		}
	}
	
	public AnyType getParentData(){
		return parent.getData();
	}
	
	public Node<AnyType> getParent(){
		return parent;
	}

}