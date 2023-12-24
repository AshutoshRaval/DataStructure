package SuperChar;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] b = {6,10,8,15,12,5,2};
		int [] b = {6,3,1,7,2};
//		int target = 10;
//		int val_found = BinarySearch_Method(a,target);
//		int val_found = BinaryRecursiveSearch(a,target,0,a.length-1);
//		System.out.println(val_found);
		//bubblesort(b);
//		//selection_sort(b);
//		insertion_sort(b);
		quick_sort(b,0,b.length-1);

	}
	
	
	public static void quick_sort(int[]a, int start, int end) {
//		System.out.println("In quick sort");
		if(end<=start) {
			return;
		}
		int pivot = partition(a,start,end);
		quick_sort(a,start,pivot-1);
		quick_sort(a,pivot+1,end);
		
		System.out.println("");
		System.out.println("Sorted Array");
		for(int x : a) {
			
			System.out.print(x + " ");
			
		}
	}
	public static int partition(int[]a, int start, int end) {
//		System.out.println("in partition");
		int pivot = a[end];
		int i = start-1;
		int temp;
		for (int j = start; j <= end -1; j++) {
			if(a[j] < pivot) {
				i++;
				temp = a[i]; 
				a[i] = a[j];
				a[j] = temp;
			}	
		}
		i++;
		temp = a[end];
		a[end] = a[i];
		a[i] = temp;
		
		return i;
	}
	
	public static void insertion_sort(int[]a) {
		
		for(int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i-1;
			while(j>=0 && a[j]> temp) {
				a[j+1] = a[j];
				j--;
				
			}
			a[j+1] = temp;
			
		}
		System.out.println("Sorted Array");
		for(int x : a) {
			
			System.out.print(x + " ");
			
		}
		
	}
	
	public static void selection_sort(int[]a) {
		int minIndex;
		int temp;
		for (int i =0;i < a.length -1; i++) {
			
			minIndex = i;
			for (int j = i+1; j < a.length;j++ ) {		
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
				
			}
			temp  = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
			
			System.out.println("");
			for(int x : a) {
				
				System.out.print(x + " ");
				
			}
			
		}
		
	}
	
	public static void bubblesort(int[]a) {
		
		int temps;
		for(int i = 0; i < a.length -1; i++) {
			
			System.out.println("Lop1");
			for(int j =0; j < a.length - i - 1; j++) {
//				System.out.println("lop2");
				for(int x : a) {
					
					System.out.print(x + " ");
					
				}
//				System.out.println("");
//				System.out.println(a[j]);
//				System.out.println(a[j+1]);
				if(a[j]>a[j+1]) {
					
					temps = a[j+1];
					a[j+1] = a[j];
					a[j] = temps;
				}
				
//				System.out.println("After loop");
//				for(int x : a) {
//					
//					System.out.print(x + " ");
//					
//				}
				
			}
			
		}
		System.out.println("After sorting");
		for(int x : a) {
			
			System.out.print(x + " ");
			
		}
		
	}
	
	public static int BinaryRecursiveSearch(int[]a,int targVal, int left, int right) {
		
		if (left <= right) {
			
			int mid = ((left + right)/2);
			if (a[mid] == targVal) {
				return mid;
			}
			else {
				if (a[mid]<targVal){
					return BinaryRecursiveSearch(a,targVal,mid+1,right);
					}
				else{
					return BinaryRecursiveSearch(a,targVal,left,mid-1);
					}
				
			}
			
		}
		
		
		return -1;
	}
	
	public static int BinarySearch_Method(int[] nums, int targVal) {
		
		int left = 0;
		int right = nums.length - 1;
		int mid;
		while (left <= right) {		
			mid = ((left+right)/2);		
			if (nums[mid] == targVal) {
				return mid;
			}
			else {
				if(targVal > nums[mid]) {
					
					left = mid +1;
					
				}
				else {
					right = mid - 1;
				}				
			}
						
		}
		
		
		return -1;
	}

}
