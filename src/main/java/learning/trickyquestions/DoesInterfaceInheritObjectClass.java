package learning.trickyquestions;

public interface DoesInterfaceInheritObjectClass {
	public static void main(String[] args) {
		
	}

	@Override
	int hashCode();

	@Override
	boolean equals(Object obj);

	Object clone() throws CloneNotSupportedException;

	@Override
	String toString();

	void finalize() throws Throwable;
	
}


//https://stackoverflow.com/questions/6056124/do-interfaces-inherit-from-object-class-in-java
//Do interfaces inherit from Object class in Java?
//No, they don't. And there is no common "root" interface implicitly inherited by all interfaces either (as in the case with classes) for that matter.(*)
//If no then how we are able to call the method of object class on interface instance
//An interface implicitly declared one method for each public method in Object. Thus the equals method is implicitly declared as a member in an interface (unless it already inherits it from a superinterface).
//If an interface has no direct superinterfaces, then the interface implicitly declares a public abstract member method m with signature s, return type r, and throws clause t corresponding to each public instance method m with signature s, return type r, and throws clause t declared in Object, unless a method with the same signature, same return type, and a compatible throws clause is explicitly declared by the interface.
