package ch04;

class Rect33{//이정원
	private int w, h;
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public Rect33() {
		w = 1;
		h = 1;
	}
	public Rect33(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	public int area() {
		return w*h;
	}
	public int around() {
		return (w+h)*2;
	}
}
public class RctTest {

	public static void main(String[] args) {
		Rect33 rct1 = new Rect33();
		Rect33 rct2 = new Rect33(10, 20);
		System.out.println("rct1의 넓이 : " + rct1.area() + ", 둘레 : " + rct1.around());
		System.out.println("rct2의 넓이 : " + rct2.area() + ", 둘레 : " + rct2.around());

	}

}
