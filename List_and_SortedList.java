package SuperChar;
import java.util.ArrayList;
import java.util.TreeSet;

public class List_and_SortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> basicList = new ArrayList<>();

        // Adding elements to the list
        basicList.add(50);
        basicList.add(20);
        basicList.add(80);
        basicList.add(10);
        basicList.add(10);
        basicList.add(10);

        // Displaying elements of the list
        System.out.println("Basic List (Unsorted): " + basicList);
//        
        
        TreeSet<Integer> sortedList = new TreeSet<>();

        // Adding elements to the sorted list
        sortedList.add(5);
        sortedList.add(2);
        sortedList.add(8);
        sortedList.add(1);
        sortedList.add(1);
        sortedList.add(1);

        // Displaying elements of the sorted list
        System.out.println("Sorted List: " + sortedList);

	}

}
