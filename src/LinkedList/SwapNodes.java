package LinkedList;

//Swap nodes in a linked list without swapping data
//approach used:
//The idea it to first search x and y in given linked list. If any of them is not present, then return. 
//While searching for x and y, keep track of current and previous pointers. First change next of previous pointers, 
//then change next of current pointers. Following are C and Java implementations of this approach.

public class SwapNodes {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next = null;	
		}
	}
	
	void push(int data)
	{
		Node toadd = new Node(data);
		toadd.next = head;
		head =toadd;
		return;
	}
	
	void print()
	{
		Node temp =head;
		while(temp != null)
		{
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
	}
	
	void swapNodes(int x ,int y)
	{
		if(x ==y)
		{
			return;
		}
		Node prevX= null, currX = head;
		while(currX !=null && currX.data != x)
		{
			prevX =currX;
			currX = currX.next;
		}
		
		Node prevY=null, currY= head;
		while(currY != null && currY.data != y)
		{
			prevY = currY;
			currY = currY.next;
		}
		// if one of the node given is not present
		if (currX == null || currY == null)
		{
			return;
		}
		
		if(prevX != null)
		  prevX.next =currY;
		else
			head=currY;
		
		if(prevY !=null)
			prevY.next = currX;
		else
			head=currX;
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapNodes llist = new SwapNodes();
		
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		
		System.out.println("linked list before swaping : " );
		llist.print();
		
		llist.swapNodes(4, 3);
		
		System.out.println("linked list after swaping");
		llist.print();
	}

}
