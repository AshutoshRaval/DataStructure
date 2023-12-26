package SuperChar;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divider D1 = new Divider();
		try { D1.Divide(10, 0);}
		catch (ArithmeticException e){ System.out.println("Exception: " + e.getMessage());}
	}

}
class Divider{
	public double Divide(int dividend, int divisor)throws ArithmeticException{
		if(divisor == 0) { throw new ArithmeticException("Cannot divide by zero");}
		return (double)(dividend/divisor);
	}
}
