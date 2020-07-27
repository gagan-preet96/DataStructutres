package LinkedList;

// create a new linked list and traverse it
public class CreateLinkedList {

	 Node Head;
	 
	 void add(int data)
	 {
		 Node toAdd= new Node(data);
		 
		 if(Head == null)    // checks if linked list is empty
		 {
			 Head = toAdd;
			 return;
		 }
		 
		 Node temp=Head;
		 while(temp.next != null) // add the element at last of list
		 {
			 temp =temp.next;
		 }
		 temp.next = toAdd;
		 
	 }
	 class Node{
		 int data;
		 Node next;
		 
		 Node(int d)
		 {
			 data =d;
			 next =null;
		 }
	 }
  
	 void print()    /// prints the linked list
	 {
		 Node temp=Head;
		 while(temp != null) {
			 System.out.println(temp.data + " ");
			 temp=temp.next;
		 }
	 }
    
    public static void main(String[] args) 
    { 
        
    	CreateLinkedList llist = new CreateLinkedList();
    	
    	llist.add(10);
    	llist.add(85);
    	
    	llist.print();
    } 
}
