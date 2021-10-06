package ch05;
class Point {
	private int x, y;//한점을 구성하는 x,y좌표
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {//점의 좌표출력
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{//point를 상속받음 colorpoint선언
	private String color;//점의 색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();//Point클래스의 showPoint()호출
	}
}
public class ColorPointEX {

	public static void main(String[] args) {
		Point p = new Point();//Point객체생성
		p.set(1, 2);//Point클래스의 set()호출
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); //생성자 호출
		cp.set(3, 4);//point클래스의 set()호출
		cp.setColor("red");//colorpoint클래스의 setcolor()호출
		cp.showColorPoint();//컬러와 좌표 출력
	}

}
