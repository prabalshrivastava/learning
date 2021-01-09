package learning.designpattern.creational.factory.phonefactory;

import learning.designpattern.creational.factory.phonefactory.phone.OS;
import learning.designpattern.creational.factory.phonefactory.phone.Windows;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		//way 1
		OS os = new Windows();
		os.spec();
		
		//way 2
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Open");
		obj.spec();
		//even if the way(code) object gets created in OperatingSystemFactory it doesnt affect our code.
		//even if we have an extra class that implements OS there will be no effect in this class
	}

}
