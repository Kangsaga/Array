
public class Exam01�Ͼ�Ŀ���°� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2���� �迭
		int[][] numArray = new int[3][5];
		//1�� �����ϴ� ���� �ְ� �ͱ� ������
		//���ο� ��������
		int a = 1;
		//������ �迭 (0,0) (0,1) (0,2) �� �����ϸ鼭 1�� �������� �ͱ⶧����
		// �տ��� ���߿� �������� �ݺ����� �����
		// ���� ���� ���ϰ� 10 �̸��� ���� ������ �д�
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[0].length; j++) {
				numArray[i][j] = a;
				a++;
				if (numArray[i][j] < 10) {
					System.out.print(" " + numArray[i][j] + " ");
				} else {
					System.out.print(numArray[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
