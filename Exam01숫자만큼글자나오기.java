import java.util.Scanner;

public class Exam01���ڸ�ŭ���ڳ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("=== ���� ���� Start! ===");
		System.out.print("���ڸ� �Է��ϼ��� >>");
		int n = sc.nextInt();
		String[] array = new String[n];

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array[i] = "��";
			} else {
				array[i] = "��";
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
