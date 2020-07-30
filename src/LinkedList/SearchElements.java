package LinkedList;

//Search an element in a Linked List (Iterative and Recursive)
public class SearchElements {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next =null;
		}
	}
	
	void push (int data)
	{
		Node toadd = new Node(data);
		toadd.next = head;
		head = toadd;
		return;
	}
	
	boolean findElement(int key)  /// iterative method
	{
		Node temp =head;
		while (temp.next != null)
		{
			if (temp.data == key)
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	boolean searchElement(Node head,int key) // recursive method
	{
		if (head == null)
		{
			return false;
		}
		if(head.data == key)
		{
			return true;
		}
		
		return searchElement(head.next,key);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchElements llist = new SearchElements();
		
		llist.push(96);
		llist.push(20);
		llist.push(7);
		llist.push(24);
		
		boolean res = llist.findElement(20);
		System.out.println( "whether 20 is present in list or not : " + res);
		boolean res1 = llist.searchElement(llist.head, 96);
		System.out.println( "whether 96 is present in list or not : " + res1);
		boolean res2= llist.searchElement(llist.head, 36);
		System.out.println( "whether 36 is present in list or not : " + res2);
	}

}
