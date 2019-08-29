package learning.designpattern.structural.composite;

import learning.designpattern.creational.builder.phone.Phone;

public class CompositeTest {
	
	public static void main(String[] args) {
		Component hd = new Leaf(4000, "HDD");
		Component mouse = new Leaf(500, "mouse");
		Component CPU = new Leaf(9000, "CPU");
		Component monitor = new Leaf(8000, "monitor");
		Component ram = new Leaf(3000, "ram");
		
		Composite ph = new Composite("Peripheral");
		Composite cabinet = new Composite("cabinet");
		Composite motherBoard= new Composite("MotherBoard");
		Composite computer = new Composite("computer");
		
		motherBoard.addComponent(CPU);
		motherBoard.addComponent(ram);
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(motherBoard);
		cabinet.addComponent(motherBoard);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		ram.showPrice();
		ph.showPrice();
	}
}
