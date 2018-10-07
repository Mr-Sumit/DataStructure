package com.linkedlist.practice;

public class LinkedListTestMain {

	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		/*ll.addNodeAtFirst(ll.createNode(11));
		
		for(int i=0; i < 5; i++){
			ll.addNodeAtLast(ll.createNode(i));
		}
		
		ll.addNodeAtMid(ll.createNode(15), 3);
		
		System.out.println("Length of List is = " + ll.getLength());
		ll.printList();
		System.out.println("Removed from First = "+ll.removeNodeFromFirst().getData());
		ll.printList();
		System.out.println("Removed from Last");
		ll.removeNodeFromLast();
		ll.printList();
		ll.removeNodeFromMid(3);
		System.out.println("Removed from MId");
		ll.printList();
		//START --- making Cyclic LinkedList
		Node newNode = ll.createNode(8);
		Node midNode = ll.nthNodeFromLast(2);
		newNode.setNext(midNode);
		ll.addNodeAtLast(newNode);
		ll.printList();
		 
		//End --- Making Cyclic LinkedList
		Node[] cyclicNode = ll.findCyclicLinkedListUsingHashTable();
		System.out.println("Start Loop Node is  = " + cyclicNode[0].getData());
		System.out.println("End Loop Node is = " + cyclicNode[1].getData());
		System.out.println("Nth node from last = "+ll.nthNodeFromLast(3).getData());
		
		System.out.println(ll.findCyclicLoopUsingFlyods());
		System.out.println("Length of Cyclic loop is = " + ll.findCyclicLoopLength());
		
		
		ll2.addNodeAtLast(ll.createNode(3));
		ll2.addNodeAtLast(ll.createNode(5));
		ll2.addNodeAtLast(ll.createNode(9));
		ll2.addNodeAtLast(ll.createNode(11));
		System.out.println("Inside second List");
		ll2.insertInSortedList(ll.createNode(7));
		ll2.printList();
		System.out.println("Reverse Second List");
		ll2.reverseLinkedList();
		ll2.printList();*/
		
		//Start find Intersection Node in linked List
		/*Node n1 = ll.createNode(3);
		Node n2 = ll.createNode(6);
		Node n3 = ll.createNode(15);
		Node n4 = ll.createNode(30);
		Node n5 = ll.createNode(45);
		Node n6 = ll.createNode(60);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		ll.head = n1;
		
		Node n7 = ll2.createNode(10);
		Node n8 = ll2.createNode(15);
		
		n7.setNext(n8);
		n8.setNext(n4);
		ll2.head = n7;
		
		System.out.println("Intersected Node Data is = " + ll.findIntersactionPointInLinkedList(ll2).getData());*/
		//End of Intersection node of Linked list
		
		//Start -- Find the Middle Node
		Node n1 = ll.createNode(3);
		Node n2 = ll.createNode(6);
		//Node n3 = ll.createNode(15);
		//Node n4 = ll.createNode(30);
		//Node n5 = ll.createNode(45);
		//Node n6 = ll.createNode(60);
		n1.setNext(n2);
		//n2.setNext(n3);
		//n3.setNext(n4);
		//n4.setNext(n5);
		//n5.setNext(n6);
		ll.head = n1;
		//System.out.println(ll.findMiddleNode().getData());
		//End - find the middle Node
		
		//ll.printRecursiveLinkedList(ll.head);
		
		//Start - Merge Two sorted Linked list
		
		Node n7 = ll.createNode(1);
		Node n8 = ll.createNode(5);
		//Node n9 = ll.createNode(15);
		//Node n10 = ll.createNode(30);
		//Node n11= ll.createNode(45);
		//Node n12  = ll.createNode(60);
		n7.setNext(n8);
		//n8.setNext(n9);
		//n9.setNext(n10);
		//n10.setNext(n11);
		//n11.setNext(n12);
		ll2.head = n7;
		
		ll.mergeSortedTwoLinkedList(ll.head,ll2.head);
		System.out.println("List is even or Odd = " + ll.isLengthEvenOdd(ll.head));
		
		
	}
}
