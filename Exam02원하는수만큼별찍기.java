import java.util.Scanner;

public class Exam02���ϴ¼���ŭ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭�� �ε��� �ȿ� ����ŭ ���� ��´�

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int a = 0; a < array.length; a++) {
			System.out.print("�����Է� :");
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
