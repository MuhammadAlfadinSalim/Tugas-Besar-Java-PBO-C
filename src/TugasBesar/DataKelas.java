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
	String jumlahsteker = scan.nextLine();
	kls.setJumlahsteker(jumlahsteker);
	
	System.out.print("kondisi Steker : ");
	String Kondisisteker = scan.nextLine();
	kls.setKondisisteker(Kondisisteker);
	
	System.out.print("posisi steker ; ");
	String Posisisteker = scan.nextLine();
	kls.setPosisisteker(Posisisteker);
	
	System.out.print("Jumlah Kabel LCD : ");
	
	
	
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
	System.out.print("\nProdi : "+kls.getProdi());
	System.out.print("\nNama Ruang : "+kls.getNamaruang());
	System.out.print("\nLokasi Ruang : "+kls.getLokasiruang());
	System.out.print("\nBentuk Ruang : "+kls.getBentukruang());
	System.out.print("\nPanjang Ruang : "+kls.getPanjangruang());
	System.out.print("\nLebar Ruang : "+kls.getLebarruang());
	System.out.print("\nJumlah Kursi : "+kls.getJumlahkursi());
	System.out.print("\nJumlah Pintu : "+kls.getJumlahpintu());
	System.out.print("\nJumlah Jendela : "+kls.getJumlahjendela());
}

void getkondisisarana(){
	
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
