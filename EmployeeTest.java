package ch04;

import java.util.Scanner;

class Employee{
	String name;
	String number;
	int money;
	public Employee() {
		name = "본인이름";  number = "010"; money = 3000;
	}
	public Employee(String name, String number, int money) {
		this.name = name;
		this.number = number;
		this.money = money;
	}
	public void show() {
		System.out.println("이름: "+name+ "전화번호: "+number+"연봉: "+money);
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
			System.out.print("이름, 전화번호, 연봉을 입력>>");
			arr[i] = new Employee(in.next(), in.next(), in.nextInt());
		}
		System.out.println("직원목록");
		for(int i=0; i<arr.length; i++) arr[i].show();
		System.out.println("직원 연봉의 평균: " + Avg(arr));

	}

}
