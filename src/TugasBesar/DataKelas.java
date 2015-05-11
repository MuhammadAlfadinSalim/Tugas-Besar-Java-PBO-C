package TugasBesar;
import java.util.Scanner;
public class DataKelas {
Kelas kls = new Kelas();
Scanner scan = new Scanner(System.in);
Double luasruang, rasioruang;
String x = "Sesuai", y = "Tidak Sesuai"; 
String a1,a2,a3,a4;
String b1,b2,b3,b4,b5,b6,b7;
String c1,c2,c3,c4;
String d1,d2,d3,d4,d5;
String e1,e2,e3,e4,e5;
String f1,f2,f3,f4;
String bentuk;
Double n1 = 0.0, persen1;
Double n2 = 0.0, persen2;
Double n3 = 0.0, persen3;
Double n4 = 0.0, persen4;
Double n5 = 0.0, persen5;
Double n6 = 0.0, persen6;
//method di bawah ini untuk inputan data . . .

void setidentitasruang(){    //method untuk penghitungan data ruang
	
	System.out.print("Prodi : ");
	String prodi = scan.nextLine();
	kls.setProdi(prodi);
	
	System.out.print("Nama Ruang : ");
	String namaruang = scan.nextLine();
	kls.setNamaruang(namaruang);
	
	System.out.print("Lokasi Ruang : ");
	String lokasiruang = scan.nextLine();
	kls.setLokasiruang(lokasiruang);
}

void procidentitasruang(){
	
}

void getidentitasruang(){
	System.out.print("\nProdi : "+kls.getProdi());
	System.out.print("\nNama Ruang : "+kls.getNamaruang());
	System.out.print("\nLokasi Ruang : "+kls.getLokasiruang());
}	
	
}
