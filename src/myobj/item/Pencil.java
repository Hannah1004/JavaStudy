package myobj.item;

public class Pencil extends Item {
	public Pencil(String name, int price) {
		super(name, price);
	}

	public void use() {
		System.out.printf("%s로 그림을 그렸습니다. \n", name);
	}
}
