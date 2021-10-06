package ch02;

import java.util.Scanner;

public class 카페메뉴판 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("커피 주문하세요>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		if(coffee.equals("에스프레소"))
			System.out.println(2000*a + "원입니다.");
			else if(coffee.equals("아메리카노"))
				System.out.println(2500*a + "원입니다.");
			else if(coffee.equals("카푸치노"))
				System.out.println(3000*a + "원입니다.");
			else if(coffee.equals("카페라떼"))
				System.out.println(3500*a + "원입니다.");
			else 
				System.out.println("잘못된 주문입니다.");
		System.exit(0);

	}

}
