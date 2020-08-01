package LinkedList;

//Given a Linked List and a number n, write a function that returns 
//the value at the n’th node from the end of the Linked List.
public class FindNode {

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
	
	void push(int data)
	{
		Node toadd = new Node(data);
		toadd.next = head;
		head = toadd;
		return;
	}
	
	void findNode(int index)
	{
		int length =0;
		Node temp= head;
		while(temp.next != null)
		{
			length ++;
			temp = temp.next;
		}
		
		if(length < index)
			return;
		
		temp = head;
		
		for(int i=0;i <length -index +1;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindNode llist = new FindNode();
		
		llist.push(85);
		llist.push(96);
		llist.push(20);
		llist.push(7);
		llist.push(321);
		
		System.out.println("the node at 4th index is : ");
		llist.findNode(4);
	}

}
