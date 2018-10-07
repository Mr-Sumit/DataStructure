package com.linkedlist.practice;

public class Node {
	private int data;
	private Node next;
	
	public Node(int data, Node ll){
		this.data = data;
		this.next = ll;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}