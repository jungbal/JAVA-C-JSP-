package ch02;

import java.util.Scanner;

public class ī��޴��� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ŀ�� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		if(coffee.equals("����������"))
			System.out.println(2000*a + "���Դϴ�.");
			else if(coffee.equals("�Ƹ޸�ī��"))
				System.out.println(2500*a + "���Դϴ�.");
			else if(coffee.equals("īǪġ��"))
				System.out.println(3000*a + "���Դϴ�.");
			else if(coffee.equals("ī���"))
				System.out.println(3500*a + "���Դϴ�.");
			else 
				System.out.println("�߸��� �ֹ��Դϴ�.");
		System.exit(0);

	}

}
