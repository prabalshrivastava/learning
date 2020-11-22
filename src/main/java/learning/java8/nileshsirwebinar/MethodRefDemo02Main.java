package learning.java8.nileshsirwebinar;

import java.util.function.BinaryOperator;

public class MethodRefDemo02Main {
	public static void main(String[] args) {

		BinaryOperator<Integer> ref1b = (a, b) -> Integer.sum(a,b);
		ref1b = Integer::sum;
		BinaryOperator<Integer> ref1c = (a,b) -> a + b;
		//System.out.println("sum1a : " + ref1a.apply(10, 5));
		System.out.println("sum1b : " + ref1b.apply(10, 5));
		System.out.println("sum1c : " + ref1c.apply(10, 5));
		
		BinaryOperator<Integer> ref2b = (a,b) -> a.compareTo(b);
		ref2b = Integer::compareTo;
		BinaryOperator<Integer> ref2c = (a,b) -> (int)Math.signum(a-b);
		//System.out.println("diff2a : " + ref2a.apply(10, 5));
		System.out.println("diff2b : " + ref2b.apply(10, 5));
		System.out.println("diff2c : " + ref2c.apply(10, 5));
	}
}