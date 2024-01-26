package pp;

public class Ex_String문제_240117 {

	public static void main(String[] args) {
		// 연습문제
		// 1. 1에서 1000사이에 0은 몇번, 1은 몇번, ..., 9는 몇번 사용되었는가?
		String numStr = "";
		for (int i = 0; i <= 1000; i++) {
			numStr += i;
		}
		for (int k = 0; k <= 9; k++) {
			int count = numStr.length() -numStr.replace(Integer.toString(k),"").length();
			System.out.println(k +"의 갯수" + count);
		}
		

		// 2. 디지털 시계, 00:00 ~ 23:59
		// 하루동안 3이 표시되는 시간은 몇초인가?
		int displayTime = 0;
		for (int hour = 0; hour <= 23; hour++) {
		    for (int minute = 0; minute <= 59; minute++) {
		        String clock = hour + ":" + minute;
		        if (clock.indexOf("3") >= 0)
		        displayTime += 60;
		        		
		        
		    }
		}
		System.out.println("하루동안 3이 표시되는 시간은" + displayTime + "초 입니다.");   

		// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때
		// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
		int maxPal = 0, max1 = 0, max2 = 0;
		for (int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				int mul = i * k;
				if (isPalindrome(Integer.toString(mul))) {
					if (mul > maxPal) {
						maxPal = mul; 
						max1 = i; 
						max2 = k;
					}
				}
			}
		}
		System.out.println(max1 + "x" + max2 + "=" + maxPal);  // 913 x 993 = 906609
		


		// 4. C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
		// 에서 파일명(04.String연습.js)만 출력하세요.
		String file = "C:/Workspace/Webproject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
				System.out.println(file.substring(50, 64));
				
		int fileIndex = file.lastIndexOf("/");
		System.out.println(file.substring(fileIndex + 1));
	}
	static boolean isPalindrome (String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
