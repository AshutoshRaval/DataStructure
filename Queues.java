package SuperChar;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q1 = new Queue();
		q1.enqueue(1);
		q1.enqueue(10);
		q1.enqueue(4);
		q1.enqueue(2);
		q1.enqueue(7);
		
		System.out.println(q1.toDisplay());
	}

}

class Node {
	
    int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
        this.next = null;	
	}
}

class Queue{
	private Node front;
	private Node rear;
	
	public Queue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (rear == null)
		{
			front = newNode;
			rear = newNode;
		}
		else {
			rear.next = newNode;
			rear = newNode;
		}
		
	}
	public int dequeue() {
		if (isEmpty()) {
			return -1;
		}
		int data = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		return data;
	}
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		int data = front.data;	
		return data;
		
	}
	public int size() {
		int count = 0;
		Node current = front;
		if(current != null)
		{
			count ++;
			current = current.next;
		}
		return count;	
	} 
	public int[] toDisplay() {
		int[] a = new int[size()];
		 int count = 0;
		 Node current = front;
		 while(current != null) {
			 System.out.println(current.data);
			 a[count] = current.data;
			 current = current.next;
//			 System.out.println();
		 }
		 return a;
		
	}
	
	
	
}