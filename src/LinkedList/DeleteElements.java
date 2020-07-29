package LinkedList;

// Given a ‘key’, delete the first occurrence of this key in linked list.
public class DeleteElements {

	Node Head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next =null;
		}
	}
	
	void deleteNode(int key)
	{
		Node temp = Head;
		Node prev = null;
		// agar oh node head hi hove ta
		
		if(temp != null && temp.data == key )
		{
			Head = temp.next;
			return;
		}
		
		// now find the node and delete it
		
		while(temp != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}
		
		//if key is not present
		if(temp == null)
		{
			return;
		}
		//unlink from linked list
		prev.next = temp.next;
	}
	
	void push (int data)  /// adds data in front of a linked list
	{
		Node toadd = new Node(data);
		toadd.next = Head;
		Head = toadd;
	}
	
	void print()
	{
		Node temp = Head;
		while (temp != null)
		{
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteElements llist = new DeleteElements();
		
		llist.push(5);
		llist.push(51);
		llist.push(85);
		llist.push(21);
		llist.push(7);
		
		System.out.println("linked list before deleting : ");
		llist.print();
		
		llist.deleteNode(85);
		
		System.out.println("list after deleting 85 : ");
		llist.print();
	}

}
