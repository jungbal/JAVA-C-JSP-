package ch05;
class Person22{//이정원
	String name;
	String id;
	public Person22(String name) {this.name = name;}
	public Person22() {}
}
class Student22 extends Person22{
	String grade;
	String department;
	public Student22(String name) {
		super(name);
	}
	
}
public class UpcastingEX {
//업캐스팅은 주로 메소드의 매개변수에서 사용됩니다.
	public static void main(String[] args) {
		Person22 p;
		Student22 s = new Student22("이정원");
		p = s;//업캐스팅 : 부모 = 자식;
		System.out.println(p.name);
		
		//p.grade = "A"; 업캐스팅된 레퍼런스는 본인 타입(부모영역)의 메모리부분만 접근가능
		//p.department = "보안";
		Student22 s2 = (Student22)p; //다운캐스팅 : 자식 = 부모;
		s2.grade = "A";
		s2.department = "보안";
		System.out.println(s2.grade + s2.department);
	}

}
