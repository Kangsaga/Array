import java.util.Scanner;

public class Exam02����ȸ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ȸ������ -> id�� qw �ʿ�
		String[] id = new String[3]; // id�� ������ �迭
		int[] qw = new int[3]; // qw�� ������ �迭
		Scanner sc = new Scanner(System.in);
		// "ȸ�������� �����մϴ�!" ������ ���!
		// ȸ�������� ���ּ��� ->id �迭��, qw�迭�� ������ �Է�
		// �ݺ�!! ��, 3�� �ʰ��ؼ� ȸ�������� �Ѵٸ�
		// ����! �����ּ���
		int num = 0;

		while (true) {
			System.out.println("1.ȸ������ 2.�α��� 3.���α׷�����");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (num < 3) {
					System.out.println("ȸ�������� �����մϴ�!");
					System.out.print("ID :");
					id[num] = sc.next();
					System.out.print("QW :");
					qw[num] = sc.nextInt();
					num = num + 1;
				} else {
					System.out.println("����!");
					break;
				}

			} else if (menu == 2) {
				System.out.println("�α��� ���ּ���");
				System.out.print("ID :");
				String id1 = sc.next();
				System.out.print("QW :");
				int qw1 = sc.nextInt();
				for (int i = 0; i < id.length; i++) {
					if (id[i].equals(id1) && qw[i] == qw1) {
						System.out.println("�α��μ���");
					} else {
						System.out.println("�α��� ����");

					}break;
				}
			}else {
				System.out.println("����");
				break;
				
			}
		}

	}

}
