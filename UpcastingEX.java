package ch05;
class Person22{//������
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
//��ĳ������ �ַ� �޼ҵ��� �Ű��������� ���˴ϴ�.
	public static void main(String[] args) {
		Person22 p;
		Student22 s = new Student22("������");
		p = s;//��ĳ���� : �θ� = �ڽ�;
		System.out.println(p.name);
		
		//p.grade = "A"; ��ĳ���õ� ���۷����� ���� Ÿ��(�θ𿵿�)�� �޸𸮺κи� ���ٰ���
		//p.department = "����";
		Student22 s2 = (Student22)p; //�ٿ�ĳ���� : �ڽ� = �θ�;
		s2.grade = "A";
		s2.department = "����";
		System.out.println(s2.grade + s2.department);
	}

}
