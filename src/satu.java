import java.util.Scanner;

public class satu {
	public static void main(final String[] alfad) {
		Scanner angka = new Scanner(System.in);
		int x, y;
		System.out.print("\nmasukkan angka pertama : ");
		x = angka.nextInt();
		System.out.print("\nmasukkan angka kedua : ");
		y = angka.nextInt();
		if (x < y) {
			System.out.print("\nAngka Pertama Lebih Kecil dari Angka Kedua");
		}
		if (x > y) {
			System.out.print("\nAngka Pertama Lebih Besar dari Angka Kedua");
		}
		if (x == y) {
			System.out.print("\nAngka Pertama Sama Basarnya dengan Angka Kedua");
		}
	}
}