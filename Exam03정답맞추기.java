import java.util.Scanner;

public class Exam03정답맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[5];
		int[] ans = { 1, 4, 3, 2, 1 };
		int result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for (int i = 0; i < input.length; i++) {
			System.out.print(i + 1 + "번답 :");
			input[i] = sc.nextInt();
		}
		System.out.println("정답확인");
		for (int i = 0; i < input.length; i++) {
			if (ans[i] == input[i]) {
				System.out.print("O ");
				result += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("총점 : " + result );
		
//		System.out.print("입력한 값은 : ");
//		for (int i = 0; i < input.length; i++){
//		System.out.print(input[i] + " ");
//	}
	}

}
