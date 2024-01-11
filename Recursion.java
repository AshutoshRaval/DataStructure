package SuperChar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("The factorial value is " + factorial(6));
//		System.out.println(fibonacci(5));
		int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
//		assertTrue(0>1);

//		assert 5 > 0 : "The value must be non-negative";
		assertEquals(4, Recursion.binarySearch(sortedArray, 16, 0, sortedArray.length - 1));
        assertEquals(0, Recursion.binarySearch(sortedArray, 2, 0, sortedArray.length - 1));
        assertEquals(9, Recursion.binarySearch(sortedArray, 91, 0, sortedArray.length - 1));
        
       
        
        // Testing for non-existing elements in the array
        assertEquals(-1, Recursion.binarySearch(sortedArray, 1, 0, sortedArray.length - 1));
        assertEquals(-1, Recursion.binarySearch(sortedArray, 100, 0, sortedArray.length - 1));
        System.out.println("Cod exs");
		

	}
	
	public static int factorial(int n) {
		if(n<=1) {	
			return 1;
		}
		System.out.println(n);
		return n*factorial(n-1);
	}

	
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		else {
			
			return fibonacci(n-2) + fibonacci(n-1); 
		}	
	}

	public static int binarySearch(int[] a, int target,int left, int right) {
		
			if(left<=right) {
				int mid = ((left+right)/2);
				if(a[mid] == target) {
					return mid;	
				}
			else {
			    if(target < a[mid]) {
				  return binarySearch(a,target, left,mid-1);
			     }
			    else {
				  return binarySearch(a,target, mid+1,right);
			     }	
		     }
	        }
			return -1;
       }
  }
