package SuperChar;

public class DynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10; // Find the 10th Fibonacci number
	     int result = fibonacci(n);
	     System.out.println("Fibonacci(" + n + ") = " + result);

	}
	
	public static int fibonacci(int size) {
		
		int[] fib = new int[size+1];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2; i <= size; i++) {
			
			fib[i] = fib[i-2] + fib[i-1];
		}
		System.out.println(fib.length);
//		System.out.println(fib[12]);
		return fib[size];
	}

}
