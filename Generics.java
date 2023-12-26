package SuperChar;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericsCollections<Integer> t = new genericsCollections<>(5);
		System.out.println(t.getgenericsCollections());

	}

}

class genericsCollections<T>{
	
	private T t;
	
	public genericsCollections(T t) {
		this.t = t;
	}
	
	public T getgenericsCollections() {
		return t;
	}
	
	
	
	
}
