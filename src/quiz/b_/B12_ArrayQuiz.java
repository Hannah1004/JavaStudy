package quiz.b_;

public class B12_ArrayQuiz {

	public static void main(String[] args) {
		
		int numArr[][] = new int[][] {
			{1, 1 ,1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};

		int sum=0, count=0;
		int row=0, col=0, colMax=0;
		int rowCount=0, colCount=0;
		double ava;
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				colMax++;
			}
			if(colMax>col) {
				col=colMax;
			}
			colMax=0;
			row++;
		}

		int rowSum[] = new int[row];
		int colSum[] = new int[col];
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr[i].length; j++) {
				
				numArr[i][j]=(int)(Math.random() * 101 + 1);
				System.out.printf("%d  ",numArr[i][j]);
				sum+=numArr[i][j];
				count++;
				
				if(rowCount==i) {
					rowSum[i]+=numArr[i][j];
				}
				if(colCount==j) {
					colSum[j]+=numArr[i][j];
				}
				colCount++;
			}
			colCount=0;
			rowCount++;
			System.out.println();
		}
		
		ava = sum/count;
		System.out.printf("numArr 모든 값의 합:%d 평균:%.2f \n",sum,(double)ava);
		
		for(int i=0; i<rowSum.length; i++) {
			System.out.printf("%d행의 합:%d \n",i,rowSum[i]);
		}
		for(int i=0; i<colSum.length; i++) {
			System.out.printf("%d열의 합:%d \n",i,colSum[i]);
		}
	}
}












