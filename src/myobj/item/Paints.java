package myobj.item;

public class Paints extends Item {
	public Paints(String name, int price) {
		super(name, price);
	}

	public void use() {
		System.out.printf("%s로 그림을 색칠했습니다. \n", name);
	}
}