import java.util.Arrays;

public class ArrayTest {//이정원

	public static void main(String[] args) {
		char[] a1 = { 'J', 'a', 'v', 'a'};
		char[] a2 = Arrays.copyOf(a1, a1.length);
		System.out.println(a2);
		
		String[] sa = {"케이크", "애플", "도넛", "바나나"};
		print(sa);
		Arrays.sort(sa);
		print(sa);
	}
	static void print(Object[] oa) {
		for(Object o : oa) System.out.print(o + " ");
		System.out.println();
	}

}
