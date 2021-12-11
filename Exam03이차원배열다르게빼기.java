
public class Exam03이차원배열다르게빼기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[5][5];
		int num = 21;
		
		// 배열 [0][0] 부터 [0][4]까지 차래대로 21이 증가하면서 넣어진다
		System.out.println("원본");
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("거울");
		//배열을 [0][4]부터 [0][0]까지 역순으로 뽑고싶다
		for (int i = 0; i < array.length; i++) {
			for (int j = array[0].length-1; j >= 0; j--) {
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
