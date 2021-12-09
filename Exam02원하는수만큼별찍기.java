import java.util.Scanner;

public class Exam02원하는수만큼별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열의 인덱스 안에 수만큼 별을 찍는다

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int a = 0; a < array.length; a++) {
			System.out.print("숫자입력 :");
			array[a] = sc.nextInt();

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " : ");
			for (int a = array[i]; a >= 1; a--) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
