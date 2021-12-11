
public class Exam02이차원배열순서대로값넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[5][5];
		int num = 21;
		
		for(int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = num;
				num++;
			}
		}
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
