package com.linkedlist.practice;

import java.util.Hashtable;

import com.linkedlist.exception.EmptyListException;
import com.linkedlist.exception.WrongPositionException;

public class LinkedList {
	Node head = null;
	
	public Node createNode(int data){
		return new Node(data, null);
	}
	
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
	
	public void addNodeAtLast(Node n){
		if(head == null){
			head = n;
		}else{
			Node tempNode = head;
			while(tempNode.getNext() != null){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(n);
		}
	}
	
	public void addNodeAtFirst(Node n){
		if(head == null){
			head = n;
		}else{
			Node tempNode = head;
			n.setNext(tempNode);
			head = n;
		}
	}
	
	public void addNodeAtMid(Node n, int position){
		Node tempNode = head;
		for(int i = 1; i < position-1; i++){
			tempNode = tempNode.getNext();
		}
		n.setNext(tempNode.getNext());
		tempNode.setNext(n);
	}
	
	public int getLength(){
		Node tempNode = head;
		int length = 0;
		while(tempNode != null){
			length++;
			tempNode = tempNode.getNext();
		}
		return length;
	}
	
	public Node removeNodeFromFirst() throws EmptyListException{
		Node tempNode = null;
		if(head == null){
			throw new EmptyListException("List is Empty");
		}else{
			tempNode = head;
			head = head.getNext();
		}
		return tempNode;
	}
	
	public void removeNodeFromLast(){
		Node tempNode = head;
		Node previous = null;
		while(tempNode.getNext() != null){
			previous = tempNode;
			tempNode = tempNode.getNext();
		}
		previous.setNext(null);
	}
	
	public void removeNodeFromMid(int position){
		if(position < 0 || position > getLength()){
			throw new WrongPositionException("Position Not Found");
		}else{
			Node tempNode = head;
			for(int i=1; i < position-1; i++){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
		}
	}
	
	public Node nthNodeFromLast(int position){
		int length = getLength();
		int nodePositionFromStart = length - position;
		Node tempNode = head;
		for(int i = 0; i < nodePositionFromStart; i++){
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}
	
	//Using HashTable find the Cyclic node in LinkedList.
	public Node[] findCyclicLinkedListUsingHashTable(){
		Node tempNode = head;
		Node previousNode = null;
		Node[] nodeArray = new Node[2];
		Hashtable<Node, Integer> ht = new Hashtable<Node, Integer>();
		while(tempNode != null){
			if(ht.containsKey(tempNode)){
				nodeArray[0] = tempNode;
				nodeArray[1] = previousNode;
				return nodeArray;
			}else{
				previousNode = tempNode;
				tempNode = tempNode.getNext();
				//previousNode.setNext(null);
				ht.put(previousNode, previousNode.getData());
			}
		}
		return null;
	}
	
	//Find LinkedList is cyclic or not using slow and fast pointer
	public boolean findCyclicLoopUsingFlyods(){
		Node slowPtr = head;
		Node fastPtr = head;
		while(fastPtr != null){
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(fastPtr == slowPtr){
				return true;
			}
		}
		return false;
	}
	
	//Find Length of Loop
	public int findCyclicLoopLength(){
		Node slowPtr = head;
		Node fastPtr = head;
		boolean isCyclic = false;
		int length = 0;
		while(fastPtr != null){
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(fastPtr == slowPtr){
				isCyclic = true;
				break;
			}
		}
		if(isCyclic){
			do{
				slowPtr = slowPtr.getNext();
				length++;
			}while(slowPtr != fastPtr);
		}
		return length;
	}
	
	//Insert Node in sorted Linked List
	public void insertInSortedList(Node n){
		Node currentNode = head;
		Node tempNode = null;
		if(head == null){
			head = n;
		}else{
			while(currentNode != null && currentNode.getData() < n.getData()){
					tempNode = currentNode;
					currentNode = currentNode.getNext();
			}
			n.setNext(tempNode.getNext());
			tempNode.setNext(n);
		}
	}
	
	//Reverse Linked List
	public void reverseLinkedList(){
		Node currentNode = head;
		Node nextNode = head;
		Node previous = null;
		
		while(currentNode.getNext() != null){
			nextNode = currentNode.getNext();
			currentNode.setNext(previous);
			previous = currentNode;
			currentNode = nextNode;
		}
		currentNode.setNext(previous);
		head = currentNode;
	}
	
	//Find the Middle Node in list
	public Node findMiddleNode(){
		Node slowPtr = head;
		Node fastPtr = head;
		if(head != null){
			while(fastPtr != null && fastPtr.getNext() != null){
				fastPtr = fastPtr.getNext().getNext();
				slowPtr = slowPtr.getNext();
			}
		}
		return slowPtr;
	}
	
	//Intersection points of Two Linked List.
	public Node findIntersactionPointInLinkedList(LinkedList ll2){
		int length1 = this.getLength();
		int length2 = ll2.getLength();
		Node temp1 = this.head;
		Node temp2 = ll2.head;
		
		System.out.println("Lengths = "+ length1 + " " + length2);
		if(length1 > length2){
			for(int i = 0; i < (length1-length2); i++){
				temp1 = temp1.getNext();
			}
		}else{
			for(int i = 0; i < (length2-length1); i++){
				temp2 = temp2.getNext();
			}
		}
		
		while(temp1 != null && temp2 != null){
			if(temp1.getNext() == temp2.getNext()){
				return temp1.getNext();
			}
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
		}
		return null;
	}
	
	public void printRecursiveLinkedList(Node n){
		if(n == null){
			return;
		}
		printRecursiveLinkedList(n.getNext());
		System.out.println(n.getData());
	}
	
	public void mergeSortedTwoLinkedList(Node head1, Node head2){
		Node head3 = createNode(0);
		Node currentNode = head3;
		while(head1 != null && head2 != null){
			if(head1.getData() <= head2.getData()){
				currentNode.setNext(createNode(head1.getData()));
				head1 = head1.getNext();
			}else{
				currentNode.setNext(createNode(head2.getData()));
				head2 = head2.getNext();
			}
			currentNode = currentNode.getNext();
		}
		while(head3!=null){
			System.out.println(head3.getData());
			head3 = head3.getNext();
		}
	}
	
	/* Given Linked list length is even or odd */
	public boolean isLengthEvenOdd(Node head){
		Node fastPtr = head;
		while(fastPtr != null && fastPtr.getNext() != null){
			fastPtr = fastPtr.getNext().getNext();
		}
		return fastPtr == null ? true : false;
	}
	
}