package learning.java.exception;

import java.io.IOException;

class X{
	X() throws IOException {
		System.out.println("Inside Constructor");	
//		throw new IOException();
	}

//	X(Integer integer) throws IOException {
//		System.out.println("Inside Constructor");
//		throw new IOException();
//	}
}

public class I1 extends X1 {

	I1() throws IOException{
		super(); //X()
	}

	public static void main(String[] args) throws IOException{
		System.out.println("Inside main before");	
		I2 x = new I2();
		System.out.println("Inside main after");	
	}
}