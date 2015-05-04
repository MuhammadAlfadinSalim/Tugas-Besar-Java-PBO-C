package TugasBesar;
import java.util.Scanner;
public class DataKelas {
Kelas kls = new Kelas();
Scanner scan = new Scanner(System.in);
Double luasruang, rasioruang;
String x = "Sesuai", y = "Tidak Sesuai";
Double n = 0.0, persen;
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

void setkondisiruang(){
	//System.out.print("Bentuk Ruang : ");
	//String bentukruang = scan.nextLine();
	//kls.setBentukruang(bentukruang);
	
	System.out.print("\nPanjang Ruang : ");
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

void setkondisisarana(){
	
	
        //method untuk penentuan kondisi sarana kelas
	System.out.print("\nJumlah Stop Kontak/Steker : ");
	int jumlahsteker = scan.nextInt();
	kls.setJumlahsteker(jumlahsteker);
	
	System.out.print("kondisi Steker : ");
	String Kondisisteker = scan.nextLine();
	kls.setKondisisteker(Kondisisteker);
	
	System.out.print("posisi steker : ");
	String Posisisteker = scan.nextLine();
	kls.setPosisisteker(Posisisteker);
	
	System.out.print("Jumlah lcd : ");
	int jumlahlcd = scan.nextInt();
	kls.setJumlahsteker(jumlahlcd);
	
	System.out.print("kondisi lcd : ");
	String Kondisilcd = scan.nextLine();
	kls.setKondisisteker(Kondisilcd);
	
	System.out.print("posisi lcd : ");
	String Posisilcd = scan.nextLine();
	kls.setPosisisteker(Posisilcd);
	
	System.out.print("Jumlah lampu : ");
	int jumlahlampu = scan.nextInt();
	kls.setJumlahlampu(jumlahlampu);
	
	System.out.print("kondisi lampu : ");
	String Kondisilampu = scan.nextLine();
	kls.setKondisilampu(Kondisilampu);
	
	System.out.print("posisi lampu : ");
	String Posisilampu = scan.nextLine();
	kls.setPosisilampu(Posisilampu);
	
	System.out.print("Jumlah kipas angin : ");
	int jumlahkipasangin = scan.nextInt();
	kls.setJumlahkipasangin(jumlahkipasangin);
	
	System.out.print("kondisi lcd : ");
	String Kondisikipasangin = scan.nextLine();
	kls.setKondisisteker(Kondisikipasangin);
	
	System.out.print("posisi kipas angin : ");
	String Posisikipasangin = scan.nextLine();
	kls.setPosisikipasangin(Posisikipasangin);
	
	System.out.print("Jumlah ac : ");
	int jumlahac = scan.nextInt();
	kls.setJumlahac(jumlahac);
	
	System.out.print("kondisi ac : ");
	String Kondisiac = scan.nextLine();
	kls.setKondisiac(Kondisiac);
	
	System.out.print("posisi ac : ");
	String Posisiac = scan.nextLine();
	kls.setPosisiac(Posisiac);
	
	System.out.print("Jumlah cctv : ");
	int jumlahcctv = scan.nextInt();
	kls.setJumlahcctv(jumlahcctv);
	
	System.out.print("kondisi cctv : ");
	String Kondisicctv = scan.nextLine();
	kls.setKondisicctv(Kondisicctv);
	
	System.out.print("posisi cctv : ");
	String Posisicctv = scan.nextLine();
	kls.setPosisicctv(Posisicctv);
	
	
}

void setkebersihankelas(){   //method untuk penentuan kebersihan kelas
	System.out.print("\nKondisi Lantai :" );
	String kondisilantai = scan.nextLine();
	kls.setKondisilantai(kondisilantai);
	
	System.out.print("\nKondisi Dinding :" );
	String kondisidinding = scan.nextLine();
	kls.setKondisidinding(kondisidinding);
	
	System.out.print("\nKondisi Atap :" );
	String kondisiatap = scan.nextLine();
	kls.setKondisiatap(kondisiatap);
	
	System.out.print("\nKondisi Pintu :" );
	String kondisipintu = scan.nextLine();
	kls.setKondisipintu(kondisipintu);
	
	System.out.print("\nKondisi Jendela :" );
	String kondisijendela = scan.nextLine();
	kls.setKondisijendela(kondisijendela);
	
}


void setlingkungankelas(){   //method untuk penentuan lingkungan dalam kelas
	System.out.print("\nSirkulasi Udara : ");
	String sirkulasi = scan.nextLine();
	kls.setSirkulasi(sirkulasi);
	//System.out.print("\n1. Lancar     2. Tidak Lancar");
	
	System.out.print("\nPencahayaan : ");
	Double pencahayaan = scan.nextDouble();
	kls.setPencahayaan(pencahayaan);
	
	System.out.print("\nKelembapan : ");
	Double kelembapan = scan.nextDouble();
	kls.setKelembapan(kelembapan);
	
	System.out.print("\nSuhu : ");
	Double suhu = scan.nextDouble();
	kls.setSuhu(suhu);
	
}


void setkenyamanankelas(){   //method untuk penentuan kenyamanan dalam kelas
	System.out.print("\nKebisingan : ");
	String kebisingan = scan.nextLine();
	kls.setKebisingan(kebisingan);
	
	System.out.print("\nBau : ");
	String bau = scan.nextLine();
	kls.setBau(bau);
	
	System.out.print("\nKebocoran : ");
	String kebocoran = scan.nextLine();
	kls.setKebocoran(kebocoran);
	
	System.out.print("\nKerusakan : ");
	String kerusakan = scan.nextLine();
	kls.setKerusakan(kerusakan);
	
	System.out.print("\nKeausan : ");
	String keausan = scan.nextLine();
	kls.setKeausan(keausan);
	
}


void setkeamanankelas(){   //method untuk penentuan keamanan dalam kelas
	System.out.print("\nKekokohan : ");
	String kekokohan = scan.nextLine();
	kls.setKekokohan(kekokohan);
	
	System.out.print("\nKunci Pintu : ");
	String kuncipintu = scan.nextLine();
	kls.setKuncipintu(kuncipintu);
	
	System.out.print("\nKunci Jendela : ");
	String kuncijendela = scan.nextLine();
	kls.setKuncijendela(kuncijendela);
	
	System.out.print("\nBahaya : ");
	String bahaya = scan.nextLine();
	kls.setBahaya(bahaya);
	
}

void procidentitasruang(){
	
}

void prockondisiruang(){
	luasruang = kls.getPanjangruang() * kls.getLebarruang();
	rasioruang = luasruang / kls.getJumlahkursi();
	
	if (+kls.getPanjangruang() != +kls.getLebarruang()) //1
	{
		n = n + 1;
		//return x;
		if (rasioruang >= 0.5) //2
		{
			n = n + 1;	
			//return x;
			if (kls.getJumlahpintu() >= 2) //3
			{
				n = n + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
			}
			else //3
			{
				n = n - 1;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
				//return y;
			}
		}
		else // 2 
		{
			n = n + 0;
			if (kls.getJumlahpintu() >= 2) //3
			{
				n = n + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
			}
			else //3
			{
				n = n + 0;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
				//return y;
			}
		}
	}
	else // 1 
	{
		n = n + 0;
		//return y;
		if (rasioruang >= 0.5) //2
		{
			n = n + 1;	
			//return x;
			if (kls.getJumlahpintu() >= 2) //3
			{
				n = n + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
			}
			else //3
			{
				n = n + 0;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
				//return y;
			}
		}
		else // 2 
		{
			n = n + 0;
			if (kls.getJumlahpintu() >= 2) //3
			{
				n = n + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
			}
			else //3
			{
				n = n + 0;
				if (kls.getJumlahjendela() >= 1) //4
				{
					n = n + 1;
					//return x;
				}
				else //4 
				{
					n = n + 0;
					//return y;
				}
				//return y;
			}
		}
	}
	persen = (n*100)/4;	
}

void prockondisisarana(){
	// Milik Zul
	if(kls.getJumlahsteker() >= 4){
            System.out.print("\n"+x);
        }
        String b = "baik";
        kls.setKondisisteker(b);
        if(kls.getKondisisteker().equals(b)){
            System.out.print("\n"+x);
        }
        String c = "pojok ruangan";
        String d = "dekat dosen";
        kls.setPosisisteker(c);
        kls.setPosisisteker(d);
        if(kls.getPosisisteker().equals(c)&&kls.getPosisisteker().equals(d)){
            System.out.println(""+x);
        }
	
}

void proclingkungankelas(){
	if (kls.getSirkulasi().equals("lancar"))
	{
		n = n + 1;
		if (+kls.getPencahayaan() >= 250 && +kls.getPencahayaan() <= 350)
		{
			n = n + 1;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				n = n + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
			else
			{
				n = n + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
		}
		else
		{
			n = n + 0;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				n = n + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
			else
			{
				n = n + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
		}
	}
	else
	{
		n = n + 0;
		if (+kls.getPencahayaan() >= 250 && +kls.getPencahayaan() <= 350)
		{
			n = n + 1;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				n = n + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
			else
			{
				n = n + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
		}
		else
		{
			n = n + 0;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				n = n + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
			else
			{
				n = n + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					n = n + 1;
				}
				else
				{
					n = n + 0;
				}
			}
		}
	}
	persen = (n*100)/4;	
			
	
}

String prockebersihankelas(){
	if (kls.getKondisilantai() == "Bersih" 
		&& kls.getKondisidinding() == "Bersih" 
		&& kls.getKondisiatap() == "Bersih" 
		&& kls.getKondisipintu() == "Bersih" 
		&& kls.getKondisijendela() == "Bersih")
	{
		return x;
	}
	else 
	{
		return y;
	}
}

String prockenyamanankelas(){
	if (kls.getKebisingan() == "tidak bising" 
		&& kls.getBau() == "tidak bau" 
		&& kls.getKebocoran() == "tidak bocor" 
		&& kls.getKerusakan() == "tidak rusak" 
		&& kls.getKeausan() == "tidak aus")
	{
		return x;
	}
	else
	{
		return y;
	}
}

String prockeamanankelas(){
	if (kls.getKekokohan() == "kokoh" 
		&& kls.getKuncipintu() == "ada" 
		&& kls.getKuncijendela() == "ada" 
		&& kls.getBahaya() == "aman")
	{
		return x;
	}
	else
	{
		return y;
	}
}


//method-method dibawah ini untuk menampilkan output an . . .

void getidentitasruang(){
	System.out.print("\nProdi : "+kls.getProdi());
	System.out.print("\nNama Ruang : "+kls.getNamaruang());
	System.out.print("\nLokasi Ruang : "+kls.getLokasiruang());
	//System.out.print("\nBentuk Ruang : "+kls.getBentukruang());
}	
	
void getkondisiruang(){
	System.out.print("\nPanjang Ruang : "+kls.getPanjangruang());
	System.out.print("\nLebar Ruang : "+kls.getLebarruang());
	System.out.print("\nJumlah Kursi : "+kls.getJumlahkursi());
	System.out.print("\nJumlah Pintu : "+kls.getJumlahpintu());
	System.out.print("\nJumlah Jendela : "+kls.getJumlahjendela());
	System.out.print("\nLuas Ruang : "+luasruang);
	System.out.print("\nRasio Ruang : "+rasioruang);
	//System.out.print(prockondisiruang());
	System.out.print("\nJumlah Sesuai = "+n);
	
	System.out.print("\nKesesuaian = "+persen + "%");
}

void getkondisisarana(){
	System.out.print("\nJumlah Stop Kontak / Steker : "+kls.getJumlahsteker());
	System.out.print("\nKondisi Stop Kontak / Steker : "+kls.getKondisisteker());
    	System.out.print("\nPosisi Stop Kontak / Steker : "+kls.getPosisisteker());
	
}

void getlingkungankelas(){
	System.out.print("\nSirkulasi Udara : "+kls.getSirkulasi());
	System.out.print("\nNilai Pencahayaan : "+kls.getPencahayaan());
	System.out.print("\nkelembapan : "+kls.getKelembapan());
	System.out.print("\nSuhu : "+kls.getSuhu());
	System.out.print("\nJumlah Sesuai = "+n);
	System.out.print("\nKesesuaian = "+persen + "%");
}

void getkebersihankelas(){
	System.out.print("\nKondisi Lantai : "+kls.getKondisilantai());
	System.out.print("\nKondisi Dinding : "+kls.getKondisidinding());
	System.out.print("\nKondisi Atap : "+kls.getKondisiatap());
	System.out.print("\nKondisi Pintu : "+kls.getKondisipintu());
	System.out.print("\nKondisi Jendela : "+kls.getKondisijendela());
}

void getkenyamanankelas(){
	System.out.print("\nKebisingan : "+kls.getKebisingan());
	System.out.print("\nBau : "+kls.getBau());
	System.out.print("\nKebocoran : "+kls.getKebocoran());
	System.out.print("\nKerusakan : "+kls.getKerusakan());
	System.out.print("\nKeausan : "+kls.getKeausan());
}

void getkeamanankelas(){
	System.out.print("\nKekokohan : "+kls.getKekokohan());
	System.out.print("\nKunci Pintu : "+kls.getKuncipintu());
	System.out.print("\nKunci Jendela : "+kls.getKuncijendela());
	System.out.print("\nBahaya : "+kls.getBahaya());
}
}
