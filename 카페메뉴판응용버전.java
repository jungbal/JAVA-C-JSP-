package ch02;

import java.util.Scanner;

public class ī��޴���������� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ŀ�� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		if (coffee.equals("����������")) {
			int sum = 2000 * a;
			if (a >= 10)
				sum *= 0.95;
			System.out.println(sum + "���Դϴ�.");
		}
		else if (coffee.equals("�Ƹ޸�ī��")) {
			int res = 2500 * a;
			if (a >= 10)
				res *= 0.95;
			System.out.println(res + "���Դϴ�.");
		}
		else if (coffee.equals("īǪġ��")) {
			int b = 3000 * a;
			if (a >= 10)
				b *= 0.95;
			System.out.println(b + "���Դϴ�.");
		}
		else if (coffee.equals("ī���")) {
			int c = 3500 * a;
			if (a >= 10)
				c *= 0.95;
			System.out.println(c + "���Դϴ�.");
		} else 
			System.out.println("�߸��� �ֹ��Դϴ�.");
			System.exit(0);
	}
}
