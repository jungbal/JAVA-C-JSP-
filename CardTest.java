package ch04;
class Card{
	String kind; int num;
	static int width=100, height=250;
	public void showInfo() {
		System.out.print(kind+"숫자: "+num);
	}
	public void showSize() {
		System.out.println("카드사이즈: "+width+"x"+height);
	}
	public static void setSize(int w, int h) {
		width=w; height=h;
		System.out.println("카드 사이즈 변경! "+width+"x"+height);
	}
	public Card() {kind="Spade"; num=1;}
	public Card(String kind, int num) {this.kind = kind; this.num = num;}
}
public class CardTest {

	public static void main(String[] args) {
		System.out.println("카드의 폭은"+Card.width+", 높이는"+Card.height);
		Card c1 = new Card("Heart", 7); 
		Card c2 = new Card("Spade", 4);
				System.out.print("c1은 무늬: "); c1.showInfo(); c1.showSize();
				System.out.print("c2은 무늬: "); c2.showInfo(); c2.showSize();
				Card.setSize(50, 80);
				
				System.out.print("c1은 무늬: "); c1.showInfo(); c1.showSize();
				System.out.print("c2은 무늬: "); c2.showInfo(); c2.showSize();

	}

}
