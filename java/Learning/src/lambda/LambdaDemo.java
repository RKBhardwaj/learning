package lambda;

interface MyNumber {
	double getValue();
}

public class LambdaDemo {
	public static void main(String args[]) {
		MyNumber mynum;
		
		mynum = () -> 123.45;
		
		System.out.println("A fixed value: " + mynum.getValue());
		
		mynum = () -> Math.random() * 100;
		System.out.println("A random value: " + mynum.getValue());
		System.out.println("Another random value: " + mynum.getValue());
	}
}
