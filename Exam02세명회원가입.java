import java.util.Scanner;

public class Exam02세명회원가입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 회원가입 -> id와 qw 필요
		String[] id = new String[3]; // id를 저자할 배열
		int[] qw = new int[3]; // qw를 저장할 배열
		Scanner sc = new Scanner(System.in);
		// "회원가입을 시작합니다!" 문구를 출력!
		// 회원가입을 해주세요 ->id 배열과, qw배열에 데이터 입력
		// 반복!! 단, 3명 초과해서 회원가입을 한다면
		// 종료! 시켜주세요
		int num = 0;

		while (true) {
			System.out.println("1.회원가입 2.로그인 3.프로그램종료");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (num < 3) {
					System.out.println("회원가입을 시작합니다!");
					System.out.print("ID :");
					id[num] = sc.next();
					System.out.print("QW :");
					qw[num] = sc.nextInt();
					num = num + 1;
				} else {
					System.out.println("종료!");
					break;
				}

			} else if (menu == 2) {
				System.out.println("로그인 해주세요");
				System.out.print("ID :");
				String id1 = sc.next();
				System.out.print("QW :");
				int qw1 = sc.nextInt();
				for (int i = 0; i < id.length; i++) {
					if (id[i].equals(id1) && qw[i] == qw1) {
						System.out.println("로그인성공");
					} else {
						System.out.println("로그인 실패");

					}break;
				}
			}else {
				System.out.println("종료");
				break;
				
			}
		}

	}

}
