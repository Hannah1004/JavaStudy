package myobj.item;

abstract public class Item {
	
	String name;
	int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	final public void info() {
		System.out.println("이름 : "+name);
		System.out.println("가겨 : "+price + "원");
	}
	
	abstract public void use();
}
