package LinkedList;

// add elemts in linked list
// at the begining
// after a given node
// at the end

public class AddElements {

	Node Head;
	
	class Node {
		int data;
		Node next;
		
		Node (int d)
		{
			data =d;
			next=null;
		}
	}
	
	// adding in front lets call function push
	
	void push(int data)
	{
		Node toadd = new Node(data);
		
		toadd.next =Head;
		
		Head = toadd;
	}
	
	
	// insert after a given node
	
	void insertAfter(Node prev_node , int data)
	{
		if(prev_node == null)
		{
			System.out.println("previous node cannot be null");
			return;
		}
		
		Node toadd = new Node(data);
		
		  toadd.next= prev_node.next;
		  
		  prev_node.next = toadd;
	}
	
	// add in last 
	
	void append(int data)
	{
		Node toadd =new Node(data);
		if (Head == null)
		{
			Head = toadd;
			return;
		}
		toadd.next = null;
		Node temp =Head;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = toadd;
	}
	
	// print the list
	void print()
	{
		Node temp=Head;
		while(temp != null)
		{
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddElements llist = new AddElements();
		
		llist.append(6);
		llist.push(7);
		llist.push(1);
		llist.append(4);
		llist.insertAfter(llist.Head.next.next, 8);
	
		
		llist.print();
	}

}
