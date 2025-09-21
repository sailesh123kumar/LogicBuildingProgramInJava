package com.linkedlist;

public class Runner {

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);

		traversal(head);
		traversal(reverseALinkedList(head));
	}

	private static Node reverseALinkedList(Node head) {

		Node current = head;
		Node next = null;
		Node prev = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	private static void traversal(Node head) {

		Node current = head;
		System.out.println("");
		while (current != null) {
			
			System.out.print(current.getData() + " ");
			current = current.next;
		}

	}

}
