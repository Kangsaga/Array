
public class Exam01�������迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �迭�� ����
		// �ڷ���[][] �迭�� = new �ڷ���[ù��° ���� ũ��][�ι�° ���� ũ��]

		// 5�� 5���� �迭 �����ϱ�
		int[][] array = new int[5][5];

		// 1.�迭�� �����Ͱ� �����ϱ�
//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;
//		array[0][3] = 4;
//		array[0][4] = 5;

//		array[1][0] = 6;
//		array[1][1] = 7;

		// �迭�� �ս��� �����ϱ� ���� for�� Ȱ���ϱ�
		// ��(��)�� �ݺ��� �ټ� �ִ� for�� �ۼ�

		// �ϳ��� ���� �����Ǵ� ���� ���!
		int num = 1;

		for (int i = 0; i < array.length; i++) {
			// ��(���� ȣ��)�� �ݺ��� �� �� �ִ� for�� �ۼ�
			for (int j = 0; j < array.length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		// 2.�迭�� ���� �� Ȯ���ϱ� -> ���� for�� ���

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.printf(" %2d", array[i][j]);
			}
			System.out.println();
		}

	}

}
