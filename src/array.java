import java.util.Scanner;
public class array {
	public static void main(String [] alfad) {
		Scanner masuk = new Scanner(System.in);
		RuangKelas [] Kelas = new RuangKelas [5];
		int a;
		
		for (int b=0; b<Kelas.length; b++){
			Kelas[b] = new RuangKelas();
			System.out.print("Masukkan Kelas : ");
			Kelas[b].nama = masuk.nextLine();
			System.out.print("Masukkan Panjang : ");
			Kelas[b].panjang = masuk.nextInt();
			System.out.print("Masukkan Lebar : ");
			Kelas[b].lebar = masuk.nextInt();
			System.out.print("Masukkan Jumlah Kursi : ");
			Kelas[b].jumlahKursi = masuk.nextInt();
		}
		for (int b=0; b<Kelas.length; b++){
			System.out.print("\nKelas "+Kelas[b].nama);
			a=Kelas[b].panjang*Kelas[b].lebar/Kelas[b].jumlahKursi;
			System.out.print("\nRasio Kelas "+a);
			
		}
	}
	
}
