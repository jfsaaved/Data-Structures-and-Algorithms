package com.jfsaaved.practice;

public class Main {
	
	
	public static void main(String[] args){
		
		
		Child child = new Child();
		
		if(child instanceof Test1){
			child.talk();
		}
		
		if(child instanceof Test2){
			child.run();
		}
		
	}

}
