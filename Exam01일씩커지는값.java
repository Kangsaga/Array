
public class Exam01일씩커지는값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열
		int[][] numArray = new int[3][5];
		//1씩 증가하는 수를 넣고 싶기 때문에
		//새로운 변수지정
		int a = 1;
		//변수를 배열 (0,0) (0,1) (0,2) 씩 증가하면서 1씩 더해지고 싶기때문에
		// 앞에를 나중에 더해지는 반복문을 만든다
		// 또한 보기 편하게 10 미만의 수는 공백을 둔다
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[0].length; j++) {
				numArray[i][j] = a;
				a++;
				if (numArray[i][j] < 10) {
					System.out.print(" " + numArray[i][j] + " ");
				} else {
					System.out.print(numArray[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
