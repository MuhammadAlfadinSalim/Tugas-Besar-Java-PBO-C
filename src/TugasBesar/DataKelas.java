package TugasBesar;
import java.util.Scanner;
public class DataKelas {
Kelas kls = new Kelas();
Scanner scan = new Scanner(System.in);


//method di bawah ini untuk inputan data . . .

void setdataruang(){    //method untuk penghitungan data ruang
	
	System.out.print("Prodi : ");
	String prodi = scan.nextLine();
	kls.setProdi(prodi);
	
	System.out.print("Nama Ruang : ");
	String namaruang = scan.nextLine();
	kls.setNamaruang(namaruang);
	
	System.out.print("Lokasi Ruang : ");
	String lokasiruang = scan.nextLine();
	kls.setLokasiruang(lokasiruang);
	
	System.out.print("Bentuk Ruang : ");
	String bentukruang = scan.nextLine();
	kls.setBentukruang(bentukruang);
	
	System.out.print("Panjang Ruang : ");
	Double panjangruang = scan.nextDouble();
	kls.setPanjangruang(panjangruang);
	
	System.out.print("Lebar Ruang : ");
	Double lebarruang = scan.nextDouble();
	kls.setLebarruang(lebarruang);
	
	System.out.print("Jumlah Kursi : ");
	int jumlahkursi = scan.nextInt();
	kls.setJumlahkursi(jumlahkursi);
	
	System.out.print("Jumlah Pintu : ");
	int jumlahpintu = scan.nextInt();
	kls.setJumlahpintu(jumlahpintu);
	
	System.out.print("Jumlah Jendela : ");
	int jumlahjendela = scan.nextInt();
	kls.setJumlahjendela(jumlahjendela);

	
	
}

void setkondisisarana(){  //method untuk penentuan kondisi sarana kelas
	System.out.print("Jumlah Stop Kontak/Steker : ");
	int jumlahsteker = scan.nextInt();
	kls.setJumlahsteker(jumlahsteker);
	
	System.out.print("kondisi Steker : ");
	String Kondisisteker = scan.nextLine();
	kls.setKondisisteker(Kondisisteker);
	
	System.out.print("posisi steker ; ");
	String Posisisteker = scan.nextLine();
	kls.setPosisisteker(Posisisteker);
	
	System.out.print("Jumlah lcd : ");
	int jumlahlcd = scan.nextInt();
	kls.setJumlahsteker(jumlahlcd);
	
	System.out.print("kondisi lcd : ");
	String Kondisilcd = scan.nextLine();
	kls.setKondisisteker(Kondisilcd);
	
	System.out.print("posisi lcd ; ");
	String Posisilcd = scan.nextLine();
	kls.setPosisisteker(Posisilcd);
	
	System.out.print("Jumlah lampu : ");
	int jumlahlampu = scan.nextInt();
	kls.setJumlahlampu(jumlahlampu);
	
	System.out.print("kondisi lampu : ");
	String Kondisilampu = scan.nextLine();
	kls.setKondisilampu(Kondisilampu);
	
	System.out.print("posisi lampu ; ");
	String Posisilampu = scan.nextLine();
	kls.setPosisilampu(Posisilampu);
	
	System.out.print("Jumlah kipas angin : ");
	int jumlahkipasangin = scan.nextInt();
	kls.setJumlahkipasangin(jumlahkipasangin);
	
	System.out.print("kondisi lcd : ");
	String Kondisikipasangin = scan.nextLine();
	kls.setKondisisteker(Kondisikipasangin);
	
	System.out.print("posisi kipas angin ; ");
	String Posisikipasangin = scan.nextLine();
	kls.setPosisikipasangin(Posisikipasangin);
	
	System.out.print("Jumlah ac : ");
	int jumlahac = scan.nextInt();
	kls.setJumlahac(jumlahac);
	
	System.out.print("kondisi ac : ");
	String Kondisiac = scan.nextLine();
	kls.setKondisiac(Kondisiac);
	
	System.out.print("posisi ac ; ");
	String Posisiac = scan.nextLine();
	kls.setPosisiac(Posisiac);
	
	System.out.print("Jumlah cctv : ");
	int jumlahcctv = scan.nextInt();
	kls.setJumlahcctv(jumlahcctv);
	
	System.out.print("kondisi cctv : ");
	String Kondisicctv = scan.nextLine();
	kls.setKondisicctv(Kondisicctv);
	
	System.out.print("posisi cctv ; ");
	String Posisicctv = scan.nextLine();
	kls.setPosisicctv(Posisicctv);
	
	
}

void setlingkungankelas(){   //method untuk penentuan lingkungan dalam kelas
	
}


void setkebersihankelas(){   //method untuk penentuan kebersihan kelas
	
	
}


void setkenyamanankelas(){   //method untuk penentuan kenyamanan dalam kelas
	
	
}


void setkeamanankelas(){   //method untuk penentuan keamanan dalam kelas
	
	
}






//method-method dibawah ini untuk menampilkan output an . . .

void getdataruang(){
	Double luasruang, rasioruang;
	System.out.print("\nProdi : "+kls.getProdi());
	System.out.print("\nNama Ruang : "+kls.getNamaruang());
	System.out.print("\nLokasi Ruang : "+kls.getLokasiruang());
	System.out.print("\nBentuk Ruang : "+kls.getBentukruang());
	System.out.print("\nPanjang Ruang : "+kls.getPanjangruang());
	System.out.print("\nLebar Ruang : "+kls.getLebarruang());
	System.out.print("\nJumlah Kursi : "+kls.getJumlahkursi());
	System.out.print("\nJumlah Pintu : "+kls.getJumlahpintu());
	System.out.print("\nJumlah Jendela : "+kls.getJumlahjendela());
	luasruang = kls.getPanjangruang() * kls.getLebarruang();
	System.out.print("\nLuas Ruang : "+luasruang);
	rasioruang = luasruang / kls.getJumlahkursi();
	System.out.print("\nRasio Ruang : "+rasioruang);
}

String getkondisisarana(){
	return "sesuai";
	
}

void getlingkungankelas(){
	
}

void getkebersihankelas(){
	
}

void getkenyamanankelas(){
	
}

void getkeamanankelas(){
	
}
}
