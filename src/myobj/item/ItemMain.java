package myobj.item;

public class ItemMain {

	public static void useItem(Item item) {
		item.info();
		item.use();
		System.out.println();
	}	
	
	public static void main(String[] args) {
		useItem(new Pencil("pencil",500));
		useItem(new Eraser("eraser",300));
		useItem(new Paints("paints",1500));
	}


}
