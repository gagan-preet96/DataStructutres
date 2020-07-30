package LinkedList;

//Write a function to delete a Linked List

public class DeleteLinkedList {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next =null;
		}
	}
	
	void deleteList()
	{
		head = null;
	}
	
	void push(int data)
	{
		Node toadd = new Node(data);
		toadd.next= head;
		head = toadd;
		return;
	}
	
	void print()
	{
		Node temp =head;
		while(temp!=null)
		{
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteLinkedList llist = new DeleteLinkedList();
		llist.push(85);
		llist.push(96);
		llist.push(20);
		
		System.out.println("linked list is : ");
		llist.print();
		
		llist.deleteList();
		
		System.out.println("list is deleted");
		llist.print();
	}

}
