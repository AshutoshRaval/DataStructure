package SuperChar;

public class stack_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack Stack = new ArrayStack(5);
		Stack.push(1);
		Stack.push(4);
		Stack.push(2);
		Stack.push(6);
		Stack.push(7);
		System.out.println(Stack.pop());
		System.out.println(Stack.peek());
	}

}

class ArrayStack{
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	ArrayStack(int size){
		stackArray = new int[size];
		top = -1;
	}
	
	public void push(int value) {
		if( top <= stackArray.length) {
			stackArray[++top] = value;
		}else {
			System.out.println("Stack Overflow");
		}
	}
	
	public int pop() {
		if(top >= 0) {
			return stackArray[top--];
		}
		else 
		{
		System.out.println("Stack is empty!");
		return -1;
		}
	}
	
	public int peek() {
		if(top>=0) {
			return stackArray[top];	
		}else {
			System.out.println("Stack is empty!");
			return -1;
			
		}
		
	}
	
	 public boolean isEmpty() {
	        return (top == -1);
	    }
	    
	    public int size() {
	        return top + 1;
	    }
			
	
}
