package ch04;
class Card{
	String kind; int num;
	static int width=100, height=250;
	public void showInfo() {
		System.out.print(kind+"����: "+num);
	}
	public void showSize() {
		System.out.println("ī�������: "+width+"x"+height);
	}
	public static void setSize(int w, int h) {
		width=w; height=h;
		System.out.println("ī�� ������ ����! "+width+"x"+height);
	}
	public Card() {kind="Spade"; num=1;}
	public Card(String kind, int num) {this.kind = kind; this.num = num;}
}
public class CardTest {

	public static void main(String[] args) {
		System.out.println("ī���� ����"+Card.width+", ���̴�"+Card.height);
		Card c1 = new Card("Heart", 7); 
		Card c2 = new Card("Spade", 4);
				System.out.print("c1�� ����: "); c1.showInfo(); c1.showSize();
				System.out.print("c2�� ����: "); c2.showInfo(); c2.showSize();
				Card.setSize(50, 80);
				
				System.out.print("c1�� ����: "); c1.showInfo(); c1.showSize();
				System.out.print("c2�� ����: "); c2.showInfo(); c2.showSize();

	}

}
