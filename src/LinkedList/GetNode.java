package LinkedList;

//Write a GetNth() function that takes a linked list and an integer index and
//returns the data value stored in the node at that index position
//approach used
//1. Initialize count = 0
//2. Loop through the link list
  //   a. if count is equal to the passed index then return current node
  //b. Increment count
  //c. change current to point to next of the current.
public class GetNode {

	Node head;
	
	class Node {
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
	
	int findNode(int index)
	{
		int count =0;
		Node temp = head;
		
		while (temp != null)
		{
			if (count == index)
			{
				return temp.data;
			}
			count ++;
			temp = temp.next;
		}
		assert(false);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetNode llist = new GetNode();
		llist.push(32);
		llist.push(56);
		llist.push(21);
		llist.push(10);
		llist.push(24);
		
		int res = llist.findNode(3);
		
		System.out.println("element at index 3 is : " + res);
		
	}

}
