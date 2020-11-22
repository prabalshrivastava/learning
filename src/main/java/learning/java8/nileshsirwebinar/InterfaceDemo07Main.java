package learning.java8.nileshsirwebinar;

@FunctionalInterface
interface IFunctional1 {
	void fun1(); // SAM
}

class Class1 implements IFunctional1 {
	@Override // Must be overridden
	public void fun1() {
		System.out.println("Class1.fun1() called.");
	}
}

@FunctionalInterface
interface IFunctional2 {
	void fun1(); // SAM
	default void fun2() {
		System.out.println("Default implementation: IFunctional2.fun2()");
	}
}

class Class2A implements IFunctional2 {
	@Override
	public void fun1() {
		System.out.println("Class2A.fun1() called.");
	}
}

class Class2B implements IFunctional2 {
	@Override
	public void fun1() {
		System.out.println("Class2B.fun1() called.");
	}
	@Override
	public void fun2() {
		System.out.println("Class2B.fun2() called.");
	}
}

@FunctionalInterface
interface IFunctional3 {
	void fun1(); // SAM
	@Override String toString(); // Object.toString()
}

interface IFunctional4 {
	void fun1();
	// error: cannot override method from java.lang.Object class.
//	default String toString() { 
//		System.out.println("Default toString()");
//	}
}

//@FunctionalInterface // error: not a functional interface -- 2 abstract methods
interface INonFunctional1 {
	void fun1(); // abstract
	void fun2(); // abstract	
}

//@FunctionalInterface // error: not a functional interface -- 0 abstract methods
interface INonFunctional2 {
	default void fun1() {
		System.out.println("INonFunctional2.fun1()");
	}
	default void fun2() {
		System.out.println("INonFunctional2.fun2()");
	}	
}

// static method in interface
@FunctionalInterface
interface IFunctional5 {
	void fun1(); // SAM
	default void fun2() {
		System.out.println("Default implementation: IFunctional5.fun2()");
	}
	// helper method
	static void callFunc(IFunctional5 obj) {
		obj.fun1();
		obj.fun2();
	}
}

class Class5A implements IFunctional5 {
	@Override
	public void fun1() {
		System.out.println("Class5A.fun1() called.");
	}
}

class Class5B implements IFunctional5 {
	@Override
	public void fun1() {
		System.out.println("Class5B.fun1() called.");
	}
	@Override
	public void fun2() {
		System.out.println("Class5B.fun2() called.");
	}
}

public class InterfaceDemo07Main {
	public static void main(String[] args) {
		IFunctional5 obj = new Class5A();
		IFunctional5.callFunc(obj);
	}
}