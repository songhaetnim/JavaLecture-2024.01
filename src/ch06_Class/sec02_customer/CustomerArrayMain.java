package ch06_Class.sec02_customer;

public class CustomerArrayMain {

	public static void main(String[] args) {
		Customer james = new Customer();
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(1, "제임스", 27);
		customers[1] = new Customer(2, "마리아", 23);
		customers[2] = new Customer(3, "브라이언", 15);
		
		Customer[] customers2 = {
				new Customer(1, "제임스", 27), new Customer(2, "마리아", 23),
				new Customer(3, "브라이언", 15), new Customer(4, "엠마", 31)
		};
		
		for (int i = 0; i < customers.length; i++)
			System.out.println(customers[i]);
		for (Customer customer: customers)
			System.out.println(customer);
	}

}
// 필드 생산자 만들고 시작
// Customer                //auto_increment > 니가 알아서 해줘라?
// int cid
// String name
// int age
// String email
// LocalDate regDate      // current_date  > 사용자가 입력할것 이름,나이,이멜

// 필요에 맞게 

// 업데이트시
//Customer                //auto_increment > 니가 알아서 해줘라?
//int cid
//String name
//int age
//String email

//DB 테이블당 클래스 하나가 생긴다 서로 주고받기?

// 회원가입시
//String name
//int age
//String email



// Deliverv 
//         int did
//         intcid
//         String addr
//         String tel