import java.util.Scanner;

public class Exam01배열초기화for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열길이가 6인 배열
		int[] array = new int[6];
		
		//임의의 값으로 초기화 (Scanner)
		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수 입력 : ");
//		array[0] = sc.nextInt();
//		System.out.println("두번째 정수 입력 : ");
//		array[1] = sc.nextInt();
//		System.out.println("세번째 정수 입력 : ");
//		array[2] = sc.nextInt();
//		System.out.println("네번째 정수 입력 : ");
//		array[3] = sc.nextInt();
//		System.out.println("다섯번째 정수 입력 : ");
//		array[4] = sc.nextInt();
//		System.out.println("여섯번째 정수 입력 : ");
//		array[5] = sc.nextInt();
		
		for (int i = 0; i < 6; i++) {
			System.out.print((i+1) + "째 정수 입력 : ");
			array[i] = sc.nextInt();
		}System.out.print("짝수는 :");
		//array안에서 짝수만 출력해주세요
		for (int i = 0; i<6; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
				
		}
		
		
		
	
		
		
	}

}
