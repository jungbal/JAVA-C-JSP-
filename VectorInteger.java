package ch07;

import java.util.ArrayList;
import java.util.Scanner;

public class VectorInteger {//������

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0; i<5; i++) {
			a.add(scanner.nextInt());
		}
		
		int max = 0;
		for(int i=0; i<4; i++) {
			if(a.get(i)>a.get(i+1)) {
				max = a.get(i);
			}
		}
		System.out.println("���� ū ���� " + max);

	}

}
