package LinkedList;

//Move last element to front of a given Linked List
//approach used
//Traverse the list till last node. Use two pointers: one to store the address of last node and other for address
//of second last node. After the end of loop do following operations.
//i) Make second last as last (secLast->next = NULL).
//ii) Set next of last as head (last->next = *head_ref).
//iii) Make last as head ( *head_ref = last)

public class MoveElement {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next=null;
		}
	}
	
	void push(int data)
	{
		Node toadd = new Node(data);
		toadd.next = head;
		head = toadd;
		return;
	}
	
	void print()
	{
		Node temp =head;
		while(temp!= null)
		{
			System.out.println(temp.data + " ");
			temp =temp.next;
		}
	}
	
	 void moveLastElement()
	{
		if(head == null || head.next == null)
		{
			return;
		}
		Node seclast = null ;
		Node last = head;
		
		while(last.next != null)
		{
			seclast =last;
			last =last.next;
		}
		
		seclast.next = null;
		
		last.next = head;
		
		head = last;
	} 
	
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoveElement llist = new MoveElement();
	
		llist.push(56);
		llist.push(58);
		llist.push(65);
		llist.push(36);
		llist.push(566);
		llist.push(5684);
		
		System.out.println("list before movement of last element");
		
		llist.print();
		
		llist.moveLastElement();
		System.out.println("list after the movement of last element");
		llist.print();
	}
	

}
