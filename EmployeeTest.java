package ch04;

import java.util.Scanner;

class Employee{
	String name;
	String number;
	int money;
	public Employee() {
		name = "�����̸�";  number = "010"; money = 3000;
	}
	public Employee(String name, String number, int money) {
		this.name = name;
		this.number = number;
		this.money = money;
	}
	public void show() {
		System.out.println("�̸�: "+name+ "��ȭ��ȣ: "+number+"����: "+money);
	}
}
public class EmployeeTest {
	public static int Avg(Employee[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) sum += arr[i].money;
		return sum/arr.length;
	}
	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		Scanner in = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("�̸�, ��ȭ��ȣ, ������ �Է�>>");
			arr[i] = new Employee(in.next(), in.next(), in.nextInt());
		}
		System.out.println("�������");
		for(int i=0; i<arr.length; i++) arr[i].show();
		System.out.println("���� ������ ���: " + Avg(arr));

	}

}
