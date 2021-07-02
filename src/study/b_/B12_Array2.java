package study.b_;

public class B12_Array2 {

	public static void main(String[] args) {
		/*
			배열 내부에도 배열을 넣을 수 있다.
			
		 */
		int numbers[] = {1, 2, 3, 4, 5, 6};
		int arr2[][] = {
				{65, 66, 67, 68, 69},
				{1, 2, 3, 4},
				{9, 9, 9, 9, 9, 9, 9, 9, 9},
				numbers
		};
		
		System.out.println(arr2[0][3]);
		System.out.println(numbers);
		System.out.println(arr2[1]);
		
		//n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				System.out.printf("arr2[%d][%d]: %d \n",i,j,arr2[i][j]);
			}
		}
		
		
		int block1[][] = {
				{0,1,1},
				{0,0,1},
				{0,0,1}
		};
		for(int i=0; i<block1.length; i++) {
			for(int j=0; j<block1[i].length; j++) {
				if(block1[i][j]==0) {
					System.out.print("□");
				}else if(block1[i][j]==1) {
					System.out.print("■");
				}
			}
			System.out.println();
		}
	}

}