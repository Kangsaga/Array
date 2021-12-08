
public class Exam07배열과fora문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 길이가 5인 배열을 만들고
		// 1,2,3,4,5 값을 각 인데스 0번째 부터 저장한다음
		// 배열안에 모든값을 출력하시오

		int[] array = new int[5];

		for (int a = 0, b = 1; a < array.length; a++, b++) {
			array[a] = b;
			System.out.println(array[a]);
//	}
//		for (int a = 0; a < 5; a++) {
//			
//			System.out.println(array[a]);
		}
		}


	}


