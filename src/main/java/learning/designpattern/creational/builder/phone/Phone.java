package learning.designpattern.creational.builder.phone;

import learning.designpattern.creational.factory.OperatingSystemFactory;
import learning.designpattern.creational.factory.phone.OS;
import learning.designpattern.creational.factory.phone.Windows;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	
	
	
}
