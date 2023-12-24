package SuperChar;
import java.util.Iterator;

public class Custom_Itreators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Apple", "Banana", "Orange"};
		CustomCollection x1 = new CustomCollection(words);
		Iterator<String> i1 = x1.iterator();
		System.out.println(i1.hasNext());
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
		}

	}

}

class CustomCollection implements Iterable<String>{

	private final String[] data;
	
	public CustomCollection(String[] a) {
		this.data = a;
		
	}
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new CustomIterator();
	}
	
	private class CustomIterator implements Iterator<String>  {
		private int index = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < data.length;
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			if (!hasNext()) {
                throw new IndexOutOfBoundsException("No more elements");
            }
            return data[index++];
		}
		
		
	}
	
	
	
	
}
