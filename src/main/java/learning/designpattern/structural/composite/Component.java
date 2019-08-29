package learning.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public interface Component {
	void showPrice();
}

class Leaf implements Component{
	int price;
	String name;
	@Override
	public void showPrice() {
		System.out.println(name  + " : " + price);
	}
	public Leaf(int price, String name) {
		super();	
		this.price = price;
		this.name = name;
	}
}


class Composite implements Component{
	String name;
	List<Component> components = new ArrayList<Component>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponent(Component comp) {
		components.add(comp);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for (Component component : components) {
			component.showPrice();
		}
	}
}