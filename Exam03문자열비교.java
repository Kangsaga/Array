import java.util.Scanner;

public class Exam03���ڿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���� ��!
		String cmp = "�ָ�";
		System.out.print("� �� ��������?");
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		//String�� ���ڿ��̹Ƿ� user�� �迭�� �ּ� ���̵ȴ�
		
		//���ڿ� �񱳴� !  ���ذ�.equals("�񱳰�") ���
		while(true) {
		if (user.equals("��")) {
			System.out.println("�̱�");
			break;
		}else if (user.equals("�ָ�")) {
			System.out.println("���");
			System.out.println("�ѹ��� ���ּ���");
			user = sc.next();
		}else if (user.equals("����")) {
			System.out.println("��");
			System.out.println("�ѹ��� ���ּ���");
			user = sc.next();
		}
		
		}
		
		
	}

}
