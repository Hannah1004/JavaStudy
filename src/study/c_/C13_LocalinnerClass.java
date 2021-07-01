package study.c_;

public class C13_LocalinnerClass {
	/*
		지역 내부 클래스
			- 클래스는 사실 메서스 내부에도 정의할 수 있다
			- 메서드가 끝나면 해당 클래스도 수명이 다한다
	 */
	public static void main(String[] args) {
		
		class Apple{
			
			int price;
			int color;
			
			public Apple(int price, int color) {
				this.price = price;
				this.color = color;
			}
			@Override
			public String toString() {
				return "price: " + price + "원\ncolor값: " + color;
			}
		}
		
		Apple a = new Apple(1000, 1); 
		System.out.println(a);
		
		banana();
		Fruitt fruit = banana();
		System.out.println("바나나는 개당"+ fruit.check()+ "원입니다.");
		
	}
	
	public static Fruitt banana() {
		class Banana extends Fruitt{
			int bana_count;
			int price;
			
			public Banana(int bana_count, int price) {
				this.bana_count = bana_count;
				this.price = price;
			}
			
			double check() {
				return price / (double)bana_count;
			}
		}	
		System.out.println(new Banana(11,3000).check()+"원");
		return new Banana(11,3000);
	}
}


abstract class Fruitt{
	abstract double check();
}












