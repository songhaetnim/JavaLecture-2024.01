package pp;

public class 백준_주사위문제세개 {

	public static void main(String[] args) {
//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
//또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을
//상금으로 받게 된다.
//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		int dice1 = 1 + (int)(Math.random() * 6);
		int dice2 = 1 +(int)(Math.random() * 6);
		int dice3 = 1 + (int)(Math.random() * 6);
		int prize = 0;

		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println(dice3);
		if (dice1 == dice2 && dice2 == dice3){
		    prize = 10000 + dice1 * 1000;
		} else if (dice1 == dice2 || dice1 == dice3 || dice3 == dice2) {
			if (dice1 == dice2) {
				prize = 1000 + dice1 * 100;
			}else if (dice1 == dice3) {
				prize = 1000 + dice1 * 100;
			}else {
				prize = 1000 + dice3 * 100;
			}
					
		} else{
		   if (dice1 > dice2) {
			   if(dice1 > dice3) {
				   prize = dice1 * 100;
			   } else {
				   prize = dice3 * 100;
			   }
		   }else if(dice2 > dice3){
			   prize = dice2 * 100;
		   }
		
		} 
//		   int maxDice =Math.max(dice1, dice2, dice3);
//		   prize = maxDice * 100;
		System.out.println(prize);
//		System.out.println("{dice1}, {dice2}, {dice3} --> {prize}원");


	}

}
