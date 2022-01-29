package hafta1;

import java.util.ArrayList;

public class JavaBasic {
	static void ucgen(int num) {
		for (int i = 0; i < num; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		// ucgen(10);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		list.get(0);

	}

	static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	static void cýkar(int sayi1, int sayi2) {
		System.out.println(sayi1 - sayi2);
	}

}
