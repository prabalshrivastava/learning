package learning.designpattern.creational.factory;

import learning.designpattern.creational.factory.phone.Android;
import learning.designpattern.creational.factory.phone.IOS;
import learning.designpattern.creational.factory.phone.OS;
import learning.designpattern.creational.factory.phone.Windows;

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
