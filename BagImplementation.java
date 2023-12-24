package SuperChar;

public class BagImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Integer> stringBag = new ArrayBag<>(10);
		stringBag.add(10);
		stringBag.add(30);
		stringBag.add(20);
		stringBag.add(60);
		stringBag.add(90);
		
		System.out.println(stringBag.isEmpty());

	}
	
}

interface Bag<Item>{
	void add(Item item);
	boolean isEmpty();
	int size();
}

class ArrayBag<Item> implements Bag<Item>{
	private Item[] items;
	private int count;
	
	
	public ArrayBag(int Capacity) {
		items = (Item[]) new Object[Capacity];
		count = 0;
	}
	@Override
	public void add(Item item) {
		// TODO Auto-generated method stub
		items[count] = item;
		count ++;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	
}


