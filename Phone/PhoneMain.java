
public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Phone 클래스 사용
		//클래스명 객체명(변수명) = new Phone();
		Phone iPhone = new Phone(30, "2222");
//		iPhone.number = "2222";
//		iPhone.displaySize = 30;
		System.out.println(iPhone.number);
		iPhone.Camera();
		
		Phone galaxy = new Phone(50, "1111111");
//		galaxy.number = "1111111";
//		galaxy.displaySize = 50;
		
		Phone lollipop = new Phone(10, "011");
//		lollipop.number = "011";
//		lollipop.displaySize = 10;
		
		galaxy.Call();
		lollipop.Call();
		
		
	}

}
