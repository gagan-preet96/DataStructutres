package LinkedList;

//delete a linked list node at the given position.
public class DeleteNode {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next= null;
		}
	}
	
	void push(int data)
	{
		Node toadd =new Node(data);
		toadd.next = head;
		head = toadd;
		return;
	}
	
	void deleteNode(int position)
	{
		//if linked list is empty
		if(head == null)
		{
			return;
		}
		Node temp=head;
		//if head needs to be deleted
		if(position == 0)
		{
			head = temp.next;
			return;
		}
		
		//find previous of the node to be deleted
		for(int i=0; temp!= null && i<position -1; i++)
		{
			temp =temp.next;
		}
		
		//if the position is more than number of nodes
		if(temp == null || temp.next == null)
		{
			return;
		}
		// Node temp.next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
		
		Node next = temp.next.next;
		//unlink the deleted node
		temp.next = next;
	}
	
	void print()
	{
		Node temp= head;
		while(temp!= null)
		{
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeleteNode llist = new DeleteNode();
		llist.push(5);
		llist.push(85);
		llist.push(96);
		llist.push(20);
		llist.push(8520);
		
		System.out.println("list is : ");
		llist.print();
		
		llist.deleteNode(4);
		llist.deleteNode(6);
		
		System.out.println("list after deletion : ");
		llist.print();
	}

}
