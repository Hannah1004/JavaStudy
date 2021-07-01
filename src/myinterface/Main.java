package myinterface;

public class Main {

	public static void main(String[] args) {
		test(new SchoolBus());

	}
	
	public static void test(Vehicle vehicle) {
		
		for(int i=0; i<100; i++) {
			System.out.println("속도를 더 냈습니다.");
			System.out.println("현재속도는 "+ vehicle.acceleration()+ "km/h 입니다");
		}

		System.out.println("속도를 감소합니다");
		for(int i=0; i<30; i++) {
			System.out.println("현재속도는 "+ vehicle.deceleration()+ "km/h 입니다");
		}
		
		for(int i=0; i<16; i++) {
			if(!vehicle.ride()) {
				System.out.println("더 이상 탈 수 없습니다");
			}else {
				System.out.println("한명이 더 탔습니다.");
			}
		}
	}
}
