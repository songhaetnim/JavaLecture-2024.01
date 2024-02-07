package mysql.sec06_users;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptExamp {

	public static void main(String[] args) {
		String pwd = "1234qwerty";
		String hashedpwd = BCrypt.hashpw(pwd,BCrypt.gensalt());
		System.out.println(hashedpwd.length());
		System.out.println(hashedpwd);
		
		// 패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd,hashedpwd);
		System.out.println(result);
		

	}

}
// 암호화 (Crypt)
//평문 plain text  ==> 비문 Cipher text

//복원 가능 ==> 공개키 알고리즘
//       O   <== O
//비복원 ==>  공기키 알고리즘
//        X   <==   