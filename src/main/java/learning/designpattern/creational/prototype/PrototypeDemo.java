package learning.designpattern.creational.prototype;

public class PrototypeDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs1 = new BookShop();
		bs1.setShopName("1stShop");
		bs1.loadData();
		System.out.println(bs1);

		//case 1
		//BookShop bs2 = new BookShop();
		//bs2.setShopName("2ndShop");
		//System.out.println(bs2);

		//case 2
//		BookShop bs2 = (BookShop) bs1.clone(); 
//		System.out.println(bs2);
//		bs2.getBooks().remove(0);//this gets removed from both bs1 and bs2 as it is shallow copying.
//		System.out.println(bs1);
//		System.out.println(bs2);
		
		//case 3
		BookShop bs2 = bs1.clone(); 
		System.out.println(bs2);
		bs2.getBooks().remove(0);//this gets removed from both bs1 and bs2 as it is shallow copying.
		System.out.println(bs1);
		System.out.println(bs2);
		
	}
}
