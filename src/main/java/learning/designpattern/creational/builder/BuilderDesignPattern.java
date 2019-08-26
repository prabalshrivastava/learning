package learning.designpattern.creational.builder;

import learning.designpattern.creational.builder.phone.Phone;
import learning.designpattern.creational.builder.phone.PhoneBuilder;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		//Approach 1 without builder pattern
		Phone phone = new Phone("Android", 8, "Quolcom", 5.5, 3100);
		System.out.println(phone);
		
		//Approach 2 with builder pattern
		PhoneBuilder phoneBuilder  = new PhoneBuilder().setOs("Android").setRam(8).setBattery(3100);
		Phone phone1 = phoneBuilder.getPhone();
		System.out.println(phone);
	}
}
