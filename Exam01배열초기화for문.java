import java.util.Scanner;

public class Exam01�迭�ʱ�ȭfor�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�迭���̰� 6�� �迭
		int[] array = new int[6];
		
		//������ ������ �ʱ�ȭ (Scanner)
		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° ���� �Է� : ");
//		array[0] = sc.nextInt();
//		System.out.println("�ι�° ���� �Է� : ");
//		array[1] = sc.nextInt();
//		System.out.println("����° ���� �Է� : ");
//		array[2] = sc.nextInt();
//		System.out.println("�׹�° ���� �Է� : ");
//		array[3] = sc.nextInt();
//		System.out.println("�ټ���° ���� �Է� : ");
//		array[4] = sc.nextInt();
//		System.out.println("������° ���� �Է� : ");
//		array[5] = sc.nextInt();
		
		for (int i = 0; i < 6; i++) {
			System.out.print((i+1) + "° ���� �Է� : ");
			array[i] = sc.nextInt();
		}System.out.print("¦���� :");
		//array�ȿ��� ¦���� ������ּ���
		for (int i = 0; i<6; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
				
		}
		
		
		
	
		
		
	}

}
