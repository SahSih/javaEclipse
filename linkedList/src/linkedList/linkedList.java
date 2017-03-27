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
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head = new LinkedList.Node(1);
		LinkedList.Node second = new LinkedList.Node(2);
		LinkedList.Node third = new LinkedList.Node(3);
		
		list.head.next = second;
		second.next = third;
		third.next = null;
		
		printList(list);	
	}
}
