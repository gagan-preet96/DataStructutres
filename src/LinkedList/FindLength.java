package LinkedList;

//Find Length of a Linked List (Iterative and Recursive)

public class FindLength {

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
		Node toadd= new Node(data);
		toadd.next = head;
		head = toadd;
		return;
	}
	
	int findLength()   /// itreative approach
	{
		int count=0;
		Node temp=head;
		
		while(temp != null)
		{
			count ++;
			temp = temp.next;
		}
		return count;
	}
	
	int getCountRec(Node node)  /// using recursion
	{
		if(node == null)
		{
			return 0;
		}
		
		return 1 + getCountRec(node.next);
	}
	
	//wrapper over getCountRec
	
	int getCount()
	{
		return getCountRec(head);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindLength llist = new FindLength();
		
		llist.push(56);
		llist.push(566);
		llist.push(78);
		llist.push(20);
		llist.push(7);
		
		int res = llist.findLength();
		
		System.out.println("length of linked list is : " + res);
		
		int res1 = llist.getCount();
		
		System.out.println("length using recursion is : " + res1);
				
	}

}
