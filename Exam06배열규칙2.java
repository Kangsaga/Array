
public class Exam06배열규칙2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//배열은 변수가 아닌 주소를 복사한다
		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = array1;
		
		
		array1[3] = 999;
		
		
		System.out.println(array2[3]);
		
		
		
		
	}

}
