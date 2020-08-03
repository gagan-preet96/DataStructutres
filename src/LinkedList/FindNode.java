package LinkedList;

//Given a Linked List and a number n, write a function that returns 
// find the value at the n’th node from the end of the Linked List.
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
		while(temp != null)
		{
			length ++;
			temp = temp.next;
		}
		
		if(length < index)
			return;
		
		
		int res = length - index;
		
		if(res == 0)
		{
			System.out.println(head.data);
			return;
		}
		
		temp = head;
		for(int i=1;i <length -index+1 ;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindNode llist = new FindNode();
		
		llist.push(9);
		llist.push(8);
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		
		System.out.println("the node at 2nd index is : ");
		llist.findNode(2);
	}

}
