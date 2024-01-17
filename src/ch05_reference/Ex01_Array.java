package ch05_reference;

import java.util.Arrays;

public class Ex01_Array {

	public static void main(String[] args) {
		// 배열의 두 가지 특징
		// 단점, 동일한 자료형 생성시 크기(저장공간)를 한번지정 후 변경x
		// 장점, 차례대로 메모리가 들어가 있다
		//. 엑세스 하기 편하고 데이터 처리속도가 빠르다
		// 1.동일한 자료형만 묶어서 저장 가능
		// 2.생성시 크기를 지정(이후 크기 변경불가*)
		//배열의 선언
		//자료형[]
		//배열을 생성하면서 값을 지정하는 경우
		int[]score = {80, 90, 78, 93, 65}; // Array 생성 방법 1
		char grade[] = {'B','A','C','A','D'}; // Array 생성 방법 2
		// 배열을 생성하면서 크기를 지정하는 경우
		int[] newArray = new int[10];
		
		//배열 인덱싱
		System.out.println(score[0] + ","+ score[4]);
		for (int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		System.out.println();
		
		// 값을 할당
		score[0] = 90; grade[0] = 'A';
		
		for (int i = 0; i < newArray.length; i++)
			newArray[i] = 1 + (int) (Math.random() * 6);
		// **외우기 [2, 3, 2, 6, 3, 2, 3, 1, 4, 2]으로 나옴 **굉장히 유용한 방법!!
		System.out.println(Arrays.toString(newArray)); 
		System.out.println(Arrays.toString(score));
		
		// int[]a;
		//a = new int[3];  --> 잘못된 방법,잘안씀 
		
	}

}
