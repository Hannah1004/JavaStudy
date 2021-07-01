package myinterface;

public class GunMain {

	public static void main(String[] args) {
		test(new Rifle(), 5);

	}

	public static void test(Gun gun, int max) {

		gun.fullLoad();
		while (true) {
			for (int i = 1; i <= max; i++) {
				System.out.printf("1발 발사했습니다.");
				System.out.println("총" + gun.shot() + "발 남았습니다");
			}

			for (int i = 1; i <= max; i++) {
				System.out.printf("1발 장전했습니다.");
				System.out.println("총" + gun.load() + "발 장전 했습니다");
			}

			if (gun.broken()) {
				System.out.println("내구도가 부족해 수리할 수 없습니다.");
				System.out.println("새로운 장비를 구입해 주세요");
				break;
			}
		}
	}

}
