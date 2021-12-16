
public class Phone {
	
	//버튼갯수
	int btnNum = 12;
	//화면크기
	int displaySize;
	//전화번호
	String number;
	
	//생성자
	//클래스에 대한 크기를 지정할때 필드값도 같이 지정할수있는 메소드
	//특징 : 리터값 자체가 없다, 메소드 이름이 클래스 이름과 같다
	public Phone(int displaySize, String number) {
		//super();
		this.displaySize = displaySize;
		this.number = number;
	}
	
	//문자를 전송한다
	public void msgSend() {
		System.out.println("문자를 전송하다");
	}
	//전화를 걸다
	public void Call() {
		System.out.println("전화를 걸다");
	}
	//인터넷 연결하다
	public void Wifi() {
		System.out.println("인터넷 연결");
	}
	//사진을 찍다
	public void Camera() {
		System.out.println("사진을 찍다");
	}
	
	
	
}
