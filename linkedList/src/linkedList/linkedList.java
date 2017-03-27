package linkedList;

public class linkedList {
	public static class LinkedList {
		public Node head;
		
		static class Node {
			int data;
			Node next;
			Node(int d) {
				data = d;
			}
		}
	}
	
	public static void printList(LinkedList l) {
		LinkedList.Node n = l.head;
		while (n != null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	public static void push(int new_data, LinkedList list) {
		LinkedList.Node new_node = new LinkedList.Node(new_data);
		new_node.next = list.head;
		list.head = new_node;
		
	}
	
	public static void insertAfter(LinkedList.Node prevnode, int new_data, LinkedList list) {
		if (prevnode == null) append(list, new_data);
		LinkedList.Node new_node = new LinkedList.Node(new_data);
		new_node.next = prevnode.next;
		prevnode.next = new_node;
		
	}
	
	public static void append(LinkedList list, int new_data) {
		LinkedList.Node new_node = new LinkedList.Node(new_data);
		if (list.head == null) {
			list.head = new_node;
			//return;
		}
		new_node.next = null;
		LinkedList.Node last = list.head;
		while (last.next != null) 
			last = last.next;
		last.next = new_node;
		//return;
	}
	
	public static void insertBefore(LinkedList.Node afterNode, int new_data, LinkedList list) {
		if (afterNode == null) append(list, new_data);
		LinkedList.Node new_node = new LinkedList.Node(new_data);
		LinkedList.Node curnode = list.head;
		while (curnode.next != afterNode) 
			curnode = curnode.next;
		new_node.next = curnode.next;
		curnode.next = new_node;
	}
	
	public static void deleteNode(int key, LinkedList list) {
		LinkedList.Node temp = list.head, prev = null;
		if (temp != null && temp.data == key) {
			list.head = temp.next;
		}
		while (temp.data != key && temp != null) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) return;
		prev.next = temp.next;
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head = new LinkedList.Node(1);
		LinkedList.Node second = new LinkedList.Node(2);
		LinkedList.Node third = new LinkedList.Node(3);
		
		list.head.next = second;
		second.next = third;
		third.next = null;
		
		push(4, list);
		insertAfter(second, 5, list);
		append(list, 6);
		insertBefore(second, 7, list);
		deleteNode(6, list);
		
		
		printList(list);	
	}
}
