class LinkedList 
{
	
    static Node head;  //define head
	
    class Node 
    {
		
		int data;
		Node next;

        Node(int a)
        {
			
            data = a;
            next = null;
			
        }
    }

    void removelater(int key)
	
    {
		
        Node temp = head; 
		Node prev = null;
		
        while (temp != null && temp.data == key) 
        {
			
            head = temp.next; //when delete key value it allocate head to secend value and make them head
            temp = head; 
			
        }

        while (temp != null) 
        {
            while (temp != null && temp.data != key) 
            {
                prev = temp;
                temp = temp.next;
            }

            if (temp == null)
                return;

            prev.next = temp.next;

            temp = prev.next;

        }

    }


    public void push(int new_data) //push new data into list
    {
        Node new_node = new Node(new_data);
        new_node.next = head; //allocate to the head to the linkslists first element
        head = new_node;
    }
 
    public void printList()
    {
        Node t = head;
		
        while (t!= null) 
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList l= new LinkedList();
        l.push('C');  //push the emlement into the linklist
        l.push('D');
        l.push('A');
        l.push('B');
        l.push('M');
        l.push('P');
        l.push('R');
		l.push('S');
 
        int key = 'A';  // allocate key
 
        System.out.println("Created Linked list is:"); //ascii value display before removal of key value

        l.printList(); //printing list list and displays the ascii value

        l.removelater(key); // remove the key 
 
        System.out.println("\nLinked List after Deletion is:"); // after removing key value

        l.printList();

    }
}