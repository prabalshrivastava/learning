package learning.designpattern.creational.factory.phonefactory;

import learning.designpattern.creational.factory.phonefactory.phone.Android;
import learning.designpattern.creational.factory.phonefactory.phone.IOS;
import learning.designpattern.creational.factory.phonefactory.phone.OS;
import learning.designpattern.creational.factory.phonefactory.phone.Windows;

public class OperatingSystemFactory {
	public OS getInstance(String s) {
		if(s.equalsIgnoreCase("Open")) {
			return new Android();
		}else if(s.equalsIgnoreCase("Closed")) {
			return new IOS();
		}else {
			return new Windows();
		}
	}
}	
