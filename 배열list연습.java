import java.util.ArrayList;

public class �迭list���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList

		int[] array = new int[5];

		// ArrayList ������
		// ArrayList<Ÿ��> �̸� = new ArrayList<Ÿ��>();

		ArrayList<String> arrayList = new ArrayList<String>();

		array[0] = 10;

		// ArrayList�� �� �߰�
		// �̸�.add("�� �� ")

		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");

		// ���ϴ� ��ġ�� �� �߰� -> ����!
		arrayList.add(1, "�°�");
		arrayList.add(2, "�϶�");

		// �� ���� -> .remove(�ε���)
		arrayList.remove(arrayList.size() - 1);
		arrayList.remove(1);

		// ArrayList ���
		// ArrayList�� ũ��� size��
		for (int i = 0; i < arrayList.size(); i++) {
			// �� �������� -> �̸�.get(index)
			System.out.println(arrayList.get(i));
		}
		System.out.println(arrayList.get(1));
	}

}
