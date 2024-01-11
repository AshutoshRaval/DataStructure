package SuperChar;

public class stack_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   LinkedList myList = new LinkedList();

	        // Add nodes to the linked list
	        myList.addNode(5);
	        myList.addNode(10);
	        myList.addNode(15);
	        myList.addNode(20);

	        // Display the contents of the linked list
	        System.out.println("Linked List contents:");
	        myList.toDisplay();
	        System.out.println(myList.size());

	}

}

class node_ll{
	
	int data;
	node_ll next;
	
	node_ll(int data){
		this.data = data;
		this.next = null;
	}
	
}

class LinkedList{
	
	private node_ll front = null;
	private node_ll rear = null;
	private int count = 0;
	
	
	LinkedList(){
		front = null;
		rear = null;
	}
	
	public int isEmpty() {
		
		if (front == null) {
			return -1;
		}
		return 1;
		
	}
	
	public void addNode(int a) {
		
		node_ll n = new node_ll(a);
		count ++;
		if(rear == null) {
			
			front  = n;
			rear = n;
			
		}
		else {
			rear.next = n;
	        rear = n; 
	        
		}
	}
		
	public void toDisplay() {
		node_ll current = front;
	    while (current != null) {
	        System.out.print(current.data + " "); // Display the data in the current node
	        current = current.next; // Move to the next node
	    }
	    System.out.println(); 
		
	}
	public int size() {
		
		return count;
//		if (front == null) {
//			return -1;
//		}
//		return 1;
		
	}
		
		
}
	