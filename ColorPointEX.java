package ch05;
class Point {
	private int x, y;//������ �����ϴ� x,y��ǥ
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {//���� ��ǥ���
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{//point�� ��ӹ��� colorpoint����
	private String color;//���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();//PointŬ������ showPoint()ȣ��
	}
}
public class ColorPointEX {

	public static void main(String[] args) {
		Point p = new Point();//Point��ü����
		p.set(1, 2);//PointŬ������ set()ȣ��
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); //������ ȣ��
		cp.set(3, 4);//pointŬ������ set()ȣ��
		cp.setColor("red");//colorpointŬ������ setcolor()ȣ��
		cp.showColorPoint();//�÷��� ��ǥ ���
	}

}
