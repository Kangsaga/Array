import java.util.ArrayList;

public class 배열list연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList

		int[] array = new int[5];

		// ArrayList 선언방법
		// ArrayList<타입> 이름 = new ArrayList<타입>();

		ArrayList<String> arrayList = new ArrayList<String>();

		array[0] = 10;

		// ArrayList의 값 추가
		// 이름.add("들어갈 값 ")

		arrayList.add("범수");
		arrayList.add("병관");
		arrayList.add("수민");

		// 원하는 위치에 값 추가 -> 삽입!
		arrayList.add(1, "태경");
		arrayList.add(2, "하라");

		// 값 삭제 -> .remove(인데스)
		arrayList.remove(arrayList.size() - 1);
		arrayList.remove(1);

		// ArrayList 출력
		// ArrayList의 크기는 size다
		for (int i = 0; i < arrayList.size(); i++) {
			// 값 가져오기 -> 이름.get(index)
			System.out.println(arrayList.get(i));
		}
		System.out.println(arrayList.get(1));
	}

}
