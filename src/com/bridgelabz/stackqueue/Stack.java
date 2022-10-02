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

	public void display() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

}
