package com.te.true2dsa.interview;

class CustomNode {
	int data;
	CustomNode nextNode;

	public CustomNode(int data) {
		this.data = data;
		nextNode = null;
	}
}

class CustomLinkedList {
	CustomNode head;

	public void addFirst(int data) {
		CustomNode node = new CustomNode(data);
		if (head == null) {
			head = node;
		} else {
			node.nextNode = head;
			head = node;
		}
	}

	public void addLast(int data) {
		CustomNode node = new CustomNode(data);
		if (head == null) {
			head = node;
		} else {
			CustomNode temp = head;
			while (temp.nextNode != null) {
				temp = node.nextNode;
			}
			node.nextNode = node;
		}
	}

	public void printElement() {
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			CustomNode temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.nextNode;
			}
			
		}
	}

}

public class InsertNewElementToAfterSpefiedElement {

	public static void main(String[] args) {
		CustomLinkedList linkedList = new CustomLinkedList();
//		linkedList.addFirst(10);
//		linkedList.addFirst(20);
//		linkedList.addFirst(30);

		linkedList.addLast(50);
		linkedList.addLast(40);
		linkedList.addLast(60);

		linkedList.printElement();

	}

}
