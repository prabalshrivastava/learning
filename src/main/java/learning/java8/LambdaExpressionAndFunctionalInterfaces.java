package learning.java8;

//@Functional annotation ensures that the interface can’t have more than one abstract method. 
//If we define more than one abstract method in this interface, then the compiler shows an error ‘Invalid '@FunctionalInterface' annotation.’
@FunctionalInterface
interface ZeroParamFI {
	public abstract void show();
}

@FunctionalInterface
interface OneParamFI {
	public abstract void show(int n);
}

@FunctionalInterface
interface TwoParamFI {
	public abstract int sum(int a, int b);
}


class LambdaExpressionImpl {
	public static void main(String[] args) {
		
		//Zero Parameter Functional Interface
		//1
		ZeroParamFI zero = () -> {};//The lambda expression is an anonymous method (a method without a name) that is used to implement the abstract method of the functional interface.
		zero.show();
		
		//2
		zero = () -> {System.out.println("2");};
		zero.show();
		
		//3
		zero = () -> System.out.println("3");
		zero.show();
		
		//4
		zero = () -> {{}};
		zero.show();
		
		//One Parameter Functional Interface
		//1
		OneParamFI one = (n) -> {};
		one.show(1);
		
		//2
		one = (n) -> {System.out.println(n);};
		one.show(2);
		
		//3
		one = (n) -> System.out.println(n);
		one.show(2);
		
		//4
		one = n -> System.out.println(n);
		one.show(2);
		
		
		//Two Parameter Functional Interface
		//1
		TwoParamFI two = (a,b) -> {return a+b;};
		two.sum(1,2);
		
		//2 error
		//two = (a,b) -> return a+b;
						
	}
}
//Functional interfaces are also called Single Abstract Method interfaces (SAM Interfaces). 
//As name suggest, they permit exactly one abstract method inside them but it can have any number of default and static methods. 
@FunctionalInterface
interface SingleAbstractMethod {
	abstract void abstractMethod();
	
	//abstract void abstractMethod2(); //error because of @FunctionalInterface 
	
	public static void staticMethod1() {
		System.out.println("static method 1");
	}
	public static void staticMethod2() {
		System.out.println("static method 2");
	}
	public static void staticMethod3() {
		System.out.println("static method 3");
	}
	
	public default void defaultMethod1() {
		System.out.println("default method 1");
	}
	public default void defaultMethod2() {
		System.out.println("default method 2");
	}
	public default void defaultMethod3() {
		System.out.println("default method 3");
	}
	
	
	//If an interface declares an abstract method overriding one of the public methods of java.lang.Object, 
	//that also does not count toward the interface’s abstract method count since any implementation of the interface will have an implementation from java.lang.Object or elsewhere.
	@Override
    public String toString();                //Overridden from Object class
 
    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}

//Rules for writing lambda expressions
//A lambda expression can have zero, one or more parameters.
//The type of the parameters can be explicitly declared or it can be inferred from the context.
//Multiple parameters are enclosed in mandatory parentheses and separated by commas. Empty parentheses are used to represent an empty set of parameters.
//When there is a single parameter, if its type is inferred, it is not mandatory to use parentheses. e.g. a -> return a*a.
//The body of the lambda expressions can contain zero, one or more statements.
//If body of lambda expression has single statement curly brackets are not mandatory and the return type of the anonymous function is the same as that of the body expression. When there is more than one statement in body than these must be enclosed in curly brackets.
