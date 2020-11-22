package learning.java8.nileshsirwebinar;

import java.util.stream.Stream;

// stream creation and reduce() operation
public class StreamDemo02Main {
	public static void main(String[] args) {
		/*
		// stream of random numbers
		//Stream.generate(() -> Math.random());
		Stream<Double> strm1 = Stream.generate(Math::random).limit(10);
		//strm1.forEach(System.out::println);
		Double res1 = strm1.reduce(0.0, (a,i)->a+i);
		System.out.println("Result 1: " + res1);
		*/
		
		/*
		// stream of sequential numbers - sum of numbers
		Stream<Integer> strm2 = Stream.iterate(1, i->i+1).limit(5);
		//Integer res2 = strm2.reduce(0, (a,i) -> a + i);
		Integer res2 = strm2.reduce(0, (a,i) -> {
			System.out.println(a + " + " + i);
			return a + i;
		});
		System.out.println("Result 2: " + res2);
		*/

		/*
		// stream of sequential numbers - multiplication of numbers 
		Stream<Integer> strm4 = Stream.iterate(1, i->i+1).limit(5);
		Integer res4 = strm4.reduce(1, (a,i) -> a * i);
		System.out.println("Result 4: " + res4);
		*/
		
		/*
		// stream of primitive types -- better performance with primitive types - no auto-boxing
		IntStream strm3 = IntStream.rangeClosed(1, 5);
		int res3 = strm3.sum(); // average(), max(), min(), ... // built-in functions
		System.out.println("Result 3: " + res3);
		res3 = strm3.reduce(1, (a,i) -> a * i);
		*/
		
		/*
		// stream using stream builder
		Builder<Object> bldr = Stream.builder();
		bldr.add("A").add("B").add("C");
		Stream<Object> strm5 = bldr.build();
		String res5 = strm5
			.map(obj -> obj.toString())
			.reduce("", (a,s) -> a.concat(s));
		System.out.println("Result 5: " + res5);
		*/
		
		/*
		// sum stream of arrays & using Optional
		Stream<Integer> strm6 = Stream.of();
		Optional<Integer> res6 = strm6.reduce(Integer::sum);
		System.out.println("Result: " + res6.toString());
		System.out.println("Result: " + res6.orElse(0));
		if(res6.isPresent())
			System.out.println("Result: " + res6.get());
		else
			System.out.println("No Result.");
		*/
		
		Stream<Double> strm7 = Stream.generate(Math::random).limit(10);
		Double res7 = strm7.reduce(1.0, StreamDemo02Main::divide);
		System.out.println("Result: " + res7);
	}
	
	public static Double divide(Double a, Double b) {
		try {
			return a / b;
		} catch (Exception e) {
			return a;
		}
	}
}
