package ch02;

import java.util.Scanner;

public class 카페메뉴판응용버전 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("커피 주문하세요>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		if (coffee.equals("에스프레소")) {
			int sum = 2000 * a;
			if (a >= 10)
				sum *= 0.95;
			System.out.println(sum + "원입니다.");
		}
		else if (coffee.equals("아메리카노")) {
			int res = 2500 * a;
			if (a >= 10)
				res *= 0.95;
			System.out.println(res + "원입니다.");
		}
		else if (coffee.equals("카푸치노")) {
			int b = 3000 * a;
			if (a >= 10)
				b *= 0.95;
			System.out.println(b + "원입니다.");
		}
		else if (coffee.equals("카페라떼")) {
			int c = 3500 * a;
			if (a >= 10)
				c *= 0.95;
			System.out.println(c + "원입니다.");
		} else 
			System.out.println("잘못된 주문입니다.");
			System.exit(0);
	}
}
