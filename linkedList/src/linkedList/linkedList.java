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
	
	public static void delPosition(int position, LinkedList list) {
		if (list.head == null) return;
		LinkedList.Node temp = list.head;
		if (position == 0) {
			list.head = temp.next;
		}
		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;
		//LinkedList.Node next = temp.next.next;
		//temp.next = next;
		temp.next = temp.next.next;
	}
	
	public static int getCount(LinkedList list) {
		LinkedList.Node temp = list.head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println(count);
		return count;
	}
	
	public static int recurCount(LinkedList.Node temp) {
		if (temp == null) return 0;
		return 1 + recurCount(temp.next);
	}
	
	public static void recurCountRes(LinkedList list) {
		System.out.println(recurCount(list.head));
	}
	
	public static void check(LinkedList list, int x) {
		LinkedList.Node temp = list.head;
		while (temp != null) {
			if (temp.data == x) System.out.println("true");
			temp = temp.next;
		}
		System.out.println("false");
	}
	
	public static void swap(int x, int y, LinkedList list) {
		
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head = new LinkedList.Node(1);
		LinkedList.Node second = new LinkedList.Node(2);
		LinkedList.Node third = new LinkedList.Node(3);
		
		//1, 2, 3
		list.head.next = second;
		second.next = third;
		third.next = null;
		
		//4, 1, 2, 3
		push(4, list);
		//4, 1, 2, 5, 3
		insertAfter(second, 5, list);
		//4, 1, 2, 5, 3, 6
		append(list, 6);
		//4, 1, 7, 2, 5, 3, 6
		insertBefore(second, 7, list);
		//4, 1, 7, 2, 5, 3
		deleteNode(6, list);
		//4, 1, 7, 2, 5
		delPosition(5, list);
		
		//5 elements
		getCount(list);
		recurCountRes(list);
		
		//3 is not exist 4, 1, 7, 2, 5
		check(list, 3);
		
		//print list
		printList(list);	
		
		swap(4, 5, list);
		printList(list);
	}
}
