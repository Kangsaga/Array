import java.util.Scanner;

public class Exam03������߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[5];
		int[] ans = { 1, 4, 3, 2, 1 };
		int result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		for (int i = 0; i < input.length; i++) {
			System.out.print(i + 1 + "���� :");
			input[i] = sc.nextInt();
		}
		System.out.println("����Ȯ��");
		for (int i = 0; i < input.length; i++) {
			if (ans[i] == input[i]) {
				System.out.print("O ");
				result += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("���� : " + result );
		
//		System.out.print("�Է��� ���� : ");
//		for (int i = 0; i < input.length; i++){
//		System.out.print(input[i] + " ");
//	}
	}

}
