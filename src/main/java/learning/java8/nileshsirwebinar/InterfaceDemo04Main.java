package learning.java8.nileshsirwebinar;
/*************************************************************************
 * Java8 Functional Programming Webinar at Sunbeam Infotech.
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Demo: InterfaceDemo04Main.java
 * Date: 24-Oct-2020
 *************************************************************************/

interface Flyable {
//    default void fly() {
//        System.out.println(this.getClass().getName() + " - Fly");
//    }

    default void flyHigh(){
        System.out.println("fly high");
    }
    static void print(){
        System.out.println("Flyable.print()");
    }
}

interface Aeroplane extends Flyable {
//    default void fly() {
//        System.out.println(this.getClass().getName() + " - Fly above clouds.");
//    }


    @Override
    default void flyHigh() {
        Flyable.super.flyHigh();
    }
}

interface Bird extends Flyable {
	default void fly() {
		System.out.println(this.getClass().getName() + " - Fly below clouds.");
	}
}

interface AeroplaneBird extends Aeroplane, Bird {
//	default void fly() {
//		System.out.println(this.getClass().getName() + " - Fly whereever.");
//	}
}

class RealAeroplaneBird implements AeroplaneBird {

}

public class InterfaceDemo04Main {
    public static void main(String[] args) {
        Flyable f = new RealAeroplaneBird();
        Aeroplane a = new RealAeroplaneBird();
        Bird b = new RealAeroplaneBird();
        AeroplaneBird ab = new RealAeroplaneBird();
        RealAeroplaneBird r = new RealAeroplaneBird();
//        f.fly();
//        a.fly();
        b.fly();
        ab.fly();
        r.fly();
    }
}