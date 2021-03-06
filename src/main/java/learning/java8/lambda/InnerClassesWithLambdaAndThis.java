package learning.java8.lambda;

//this example represents that inside anonymous inner class refers 'this' to the inner class instance
//whereas
//inside lambda function 'this' to the outer class instance
class InnerClassesWithLambdaAndThis {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.r.run();

		System.out.println("\n\n\n");
		h.lambda.run();

	}
}

class Hello {
	String message = "this is an outer string";
	public Runnable r = new Runnable() {
		public void run() {
			//Here this refers to the toString of the Runnable instance
			System.out.println(this);
			System.out.println(toString());

			//Here Hello.this this refers to the toString of the Hello Class instance
			System.out.println(Hello.this);
			System.out.println(Hello.this.toString());

			System.out.println("I can access variable outside : it says ->" + message);
		}

		@Override
		public String toString() {
			return "Runnable instance toString()";
		}
	};

	public Runnable lambda = () -> {
		//Here this refers to the toString of the Hello Class instance
		System.out.println(this);
		System.out.println(toString());

		//Here Hello.this this refers to the toString of the Hello Class instance
		System.out.println(Hello.this);
		System.out.println(Hello.this.toString());

		System.out.println("I can access variable outside : it says ->" + message);
		r.run();
	};
	public String toString() {
		return "Hello's instance toString()";
	}
}
