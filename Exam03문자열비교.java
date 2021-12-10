import java.util.Scanner;

public class Exam03문자열비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//가위 바위 보!
		String cmp = "주먹";
		System.out.print("어떤 걸 낼껀가요?");
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		//String은 문자열이므로 user는 배열의 주소 값이된다
		
		//문자열 비교는 !  기준값.equals("비교값") 사용
		while(true) {
		if (user.equals("보")) {
			System.out.println("이김");
			break;
		}else if (user.equals("주먹")) {
			System.out.println("비김");
			System.out.println("한번더 내주세요");
			user = sc.next();
		}else if (user.equals("가위")) {
			System.out.println("짐");
			System.out.println("한번더 내주세요");
			user = sc.next();
		}
		
		}
		
		
	}

}
