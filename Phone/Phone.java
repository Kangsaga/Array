
public class Phone {
	
	//��ư����
	int btnNum = 12;
	//ȭ��ũ��
	int displaySize;
	//��ȭ��ȣ
	String number;
	
	//������
	//Ŭ������ ���� ũ�⸦ �����Ҷ� �ʵ尪�� ���� �����Ҽ��ִ� �޼ҵ�
	//Ư¡ : ���Ͱ� ��ü�� ����, �޼ҵ� �̸��� Ŭ���� �̸��� ����
	public Phone(int displaySize, String number) {
		//super();
		this.displaySize = displaySize;
		this.number = number;
	}
	
	//���ڸ� �����Ѵ�
	public void msgSend() {
		System.out.println("���ڸ� �����ϴ�");
	}
	//��ȭ�� �ɴ�
	public void Call() {
		System.out.println("��ȭ�� �ɴ�");
	}
	//���ͳ� �����ϴ�
	public void Wifi() {
		System.out.println("���ͳ� ����");
	}
	//������ ���
	public void Camera() {
		System.out.println("������ ���");
	}
	
	
	
}
