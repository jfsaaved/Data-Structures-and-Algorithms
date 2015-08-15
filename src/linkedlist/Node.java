package linkedlist;

import java.util.*;

/*
* Julian Saavedra
* github.com/jfsaaved
* julian.felipe.saavedra@gmail.com
*/

public final class Node<AnyType>
{
   private AnyType data;
   private Node<AnyType> next;

   public Node(AnyType data, Node<AnyType> next)
   {
      this.data = data;
      this.next = next;
   }
   
   public AnyType getData(){
	  return data;
   }
   
   public Node<AnyType> getNext(){
	  return next;
   }
   
   public void setNext(Node<AnyType> next){
		this.next = next;
   }
   
}