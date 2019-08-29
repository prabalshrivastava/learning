package learning.java;

public class CloneMethodNotAccesible implements Cloneable{
	
}

class Main{
	public static void main(String[] args) {
		CloneMethodNotAccesible cln = new CloneMethodNotAccesible();
		//cln.clone();
		//clone method should be accessible by calling cln.clone() as it is inherited from the Object class 
		//and it is considered as a part of	CloneMethodNotAccesible but is not?  
		//because the clone method is not part of CloneMethodNotAccesible class as its own member 
		//hence as access of protected is in its inheriting class and the current package.
		//about rule is applicable to Object class and not to the inheriting classes     
	}
}
