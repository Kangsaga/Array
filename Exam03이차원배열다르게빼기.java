
public class Exam03�������迭�ٸ��Ի��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[5][5];
		int num = 21;
		
		// �迭 [0][0] ���� [0][4]���� ������� 21�� �����ϸ鼭 �־�����
		System.out.println("����");
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = num;
				num++;
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("�ſ�");
		//�迭�� [0][4]���� [0][0]���� �������� �̰�ʹ�
		for (int i = 0; i < array.length; i++) {
			for (int j = array[0].length-1; j >= 0; j--) {
				System.out.printf(" %2d",array[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
