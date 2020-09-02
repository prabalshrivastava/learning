
package learning.java.exception;

import java.io.IOException;

class X1 {
    X1() throws IOException {
        System.out.println("Inside Constructor");
//		throw new IOException();
    }

//	X(Integer integer) throws IOException {
//		System.out.println("Inside Constructor");
//		throw new IOException();
//	}
}

public class I2 /*extends X1 */ {

    public static void main(String[] args) {
        System.out.println("Inside main before");
//		try {
//			I2 x = new I2();
//		}catch (IOException e){
//			e.printStackTrace();
//		}

        I2 x = new I2();
        System.out.println("Inside main after");
    }
}