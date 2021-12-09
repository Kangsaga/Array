import java.util.Scanner;

public class Exam01숫자만큼글자나오기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("=== 수박 게임 Start! ===");
		System.out.print("숫자를 입력하세요 >>");
		int n = sc.nextInt();
		String[] array = new String[n];

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = "수";
			} else {
				array[i] = "박";
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
