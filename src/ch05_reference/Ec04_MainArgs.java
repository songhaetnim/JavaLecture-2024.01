package ch05_reference;

import java.util.Arrays;

public class Ec04_MainArgs {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));   // 매개변수의 타입은 문자열, 배열 형태로 패싱됨
		
		String[]command = "git add .".split(" ");
		command = "git  commit   -m \"Weference Type\"".split("\\s+");  // 공백(white space) 여러개로 분리
		System.out.println(Arrays.toString(command));
		

	}

}
// 따옴표는 무시하면 되니깐 나중에~