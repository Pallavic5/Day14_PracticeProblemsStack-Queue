package com.bridgelabz.stackqueue;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Stack {
	Node top = null;
	static int counter;

	public void push(int data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		counter++;
	}

	public boolean isEmpty() {
		return (top == null) ? true : false;
	}

	public void pop() {
		
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println(top.data + "");	
			top = top.next;
			counter--;
		}
	}
	
	public int peak() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		return top.data;
	}

	public void display() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

}
