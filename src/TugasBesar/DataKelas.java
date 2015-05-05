package TugasBesar;
import java.util.Scanner;
public class DataKelas {
Kelas kls = new Kelas();
Scanner scan = new Scanner(System.in);
Double luasruang, rasioruang;
String x = "Sesuai", y = "Tidak Sesuai"; 
String a1,a2,a3,a4;
String b1,b2,b3,b4;
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

void setlingkungankelas(){   //method untuk penentuan lingkungan dalam kelas
	System.out.print("\nSirkulasi Udara (lancar / tidak) : ");
	String sirkulasi = scan.next();
	kls.setSirkulasi(sirkulasi);
	
	System.out.print("Pencahayaan : ");
	Double pencahayaan = scan.nextDouble();
	kls.setPencahayaan(pencahayaan);
	
	System.out.print("Kelembapan : ");
	Double kelembapan = scan.nextDouble();
	kls.setKelembapan(kelembapan);
	
	System.out.print("Suhu : ");
	Double suhu = scan.nextDouble();
	kls.setSuhu(suhu);
}

void setkebersihankelas(){   //method untuk penentuan kebersihan kelas
	System.out.print("\nKondisi Lantai :" );
	String kondisilantai = scan.nextLine();
	kls.setKondisilantai(kondisilantai);
	
	System.out.print("Kondisi Dinding :" );
	String kondisidinding = scan.nextLine();
	kls.setKondisidinding(kondisidinding);
	
	System.out.print("Kondisi Atap :" );
	String kondisiatap = scan.nextLine();
	kls.setKondisiatap(kondisiatap);
	
	System.out.print("Kondisi Pintu :" );
	String kondisipintu = scan.nextLine();
	kls.setKondisipintu(kondisipintu);
	
	System.out.print("Kondisi Jendela :" );
	String kondisijendela = scan.nextLine();
	kls.setKondisijendela(kondisijendela);	
}

void setkenyamanankelas(){   //method untuk penentuan kenyamanan dalam kelas
	System.out.print("\nKebisingan : ");
	String kebisingan = scan.nextLine();
	kls.setKebisingan(kebisingan);
	
	System.out.print("Bau : ");
	String bau = scan.nextLine();
	kls.setBau(bau);
	
	System.out.print("Kebocoran : ");
	String kebocoran = scan.nextLine();
	kls.setKebocoran(kebocoran);
	
	System.out.print("Kerusakan : ");
	String kerusakan = scan.nextLine();
	kls.setKerusakan(kerusakan);
	
	System.out.print("Keausan : ");
	String keausan = scan.nextLine();
	kls.setKeausan(keausan);	
}

void setkeamanankelas(){   //method untuk penentuan keamanan dalam kelas
	System.out.print("\nKekokohan : ");
	String kekokohan = scan.nextLine();
	kls.setKekokohan(kekokohan);
	
	System.out.print("Kunci Pintu : ");
	String kuncipintu = scan.nextLine();
	kls.setKuncipintu(kuncipintu);
	
	System.out.print("Kunci Jendela : ");
	String kuncijendela = scan.nextLine();
	kls.setKuncijendela(kuncijendela);
	
	System.out.print("Bahaya : ");
	String bahaya = scan.nextLine();
	kls.setBahaya(bahaya);	
}

//Method Method Dibawah ini Adalah Method Proses

void procidentitasruang(){
	
}

void prockondisiruang(){
	luasruang = kls.getPanjangruang() * kls.getLebarruang();
	rasioruang = luasruang / kls.getJumlahkursi();
	//String p = "Persegi", pp = "Persegi Panjang";
	if (+kls.getPanjangruang() != +kls.getLebarruang()) //1
	{
		bentuk = "Persegi Panjang";
		a1 = x;
		n1 = n1 + 1;
		//System.out.print("\nBentuk Ruang : "+pp);
		//return x;
		if (rasioruang >= 0.5) //2
		{
			a2 = x;
			n1 = n1 + 1;	
			//return x;
			if (kls.getJumlahpintu() >= 2) //3
			{
				a3 = x;
				n1 = n1 + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
			}
			else //3
			{
				a3 = y;
				n1 = n1 + 0;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
				//return y;
			}
		}
		else // 2 
		{
			a2 = y;
			n1 = n1 + 0;
			if (kls.getJumlahpintu() >= 2) //3
			{
				a3 = x;
				n1 = n1 + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
			}
			else //3
			{
				a3 = y;
				n1 = n1 + 0;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
				//return y;
			}
		}
	}
	else // 1 
	{
		bentuk = "Persegi";
		a1 = y;
		n1 = n1 + 0;
		//return y;
		if (rasioruang >= 0.5) //2
		{
			a2 = x;
			n1 = n1 + 1;	
			//return x;
			if (kls.getJumlahpintu() >= 2) //3
			{
				a3 = x;
				n1 = n1 + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
			}
			else //3
			{
				a3 = y;
				n1 = n1 + 0;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
				//return y;
			}
		}
		else // 2 
		{
			a2 = y;
			n1 = n1 + 0;
			if (kls.getJumlahpintu() >= 2) //3
			{
				a3 = x;
				n1 = n1 + 1;
				//return x;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
			}
			else //3
			{
				a3 = y;
				n1 = n1 + 0;
				if (kls.getJumlahjendela() >= 1) //4
				{
					a4 = x;
					n1 = n1 + 1;
					//return x;
				}
				else //4 
				{
					a4 = y;
					n1 = n1 + 0;
					//return y;
				}
				//return y;
			}
		}
	}
	persen1 = (n1*100)/4;	
}

void prockondisisarana(){
	// Milik Zul
	if(kls.getJumlahsteker() >= 4){
            System.out.print("\n"+x);
        } else {
            System.out.print("\n"+y);
        }
        
        if(kls.getKondisisteker().equals("baik")){
            System.out.print("\n"+x);
        }else {
            System.out.print("\n"+y);
        }
        
        if(kls.getPosisisteker().equals("pojok ruangan")&&kls.getPosisisteker().equals("dekat dosen")){
            System.out.println("\n"+x);
        }else {
            System.out.print("\n"+y);
        }
        
        if(kls.getJumlahkabellcd() >= 1){
            System.out.print("\n"+x);
        } else {
            System.out.print("\n"+y);
        }
        
        if(kls.getKondisikabellcd().equals("baik")){
            System.out.print("\n"+x);
        } else {
            System.out.print("\n"+y);
        }
	
        if(kls.getPosisikabellcd().equals("dekat dosesn")){
            System.out.print("\n"+x);
        } else {
            System.out.print("\n"+y);
        }
        
        if(kls.getJumlahlampu()>=18 && kls.getKondisilampu().equals("baik") && kls.getPosisikabellcd().equals("atap ruangan")){
            System.out.print("\n"+x);
        }else{
            System.out.print("\n"+y);
        }
        
        if(kls.getJumlahkipasangin()>=2 && kls.getKondisikipasangin().equals("baik") && kls.getPosisikipasangin().equals("atap ruangan")){
        System.out.print("\n"+x);
        } else{
            System.out.print("\n"+y);
        }
        
        if(kls.getJumlahac()>=1 &&  kls.getKondisiac().equals("baik") && kls.getPosisiac().equals("Belakang")){
            System.out.print("\n"+x);
        }else{
            System.out.print("\n"+y);
        }
        
        if(kls.getSsid().equals("UMM Hotspot")){
            System.out.print("\n"+x);
        } else{
            System.out.print("\n"+y);
        }
        
        if(kls.getJumlahcctv()> 2 && kls.getKondisicctv().equals("baik")){
            System.out.print("\n"+x);
        }else{
            System.out.print("\n"+y);
        }
        if(kls.getPosisicctv().equals("depan")){
            if(kls.getPosisicctv().equals("belakang")){
                System.out.print("\n"+x);
            }
        }else{
            System.out.print("\n"+y);
        }
        
}
void proclingkungankelas(){
	if (kls.getSirkulasi().equals("lancar"))
	{
		c1 = x;
		n3 = n3 + 1;
		if (+kls.getPencahayaan() >= 250 && +kls.getPencahayaan() <= 350)
		{
			c2 = x;
			n3 = n3 + 1;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				c3 = x;
				n3 = n3 + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
			else
			{
				c3 = y;
				n3 = n3 + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
		}
		else
		{
			c2 = y;
			n3 = n3 + 0;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				c3 = x;
				n3 = n3 + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
			else
			{
				c3 = y;
				n3 = n3 + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
		}
	}
	else
	{
		n3 = n3 + 0;
		c1 = y;
		if (+kls.getPencahayaan() >= 250 && +kls.getPencahayaan() <= 350)
		{
			c2 = x;
			n3 = n3 + 1;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				c3 = x;
				n3 = n3 + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
			else
			{
				c3 = y;
				n3 = n3 + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
		}
		else
		{
			c2 = y;
			n3 = n3 + 0;
			if (+kls.getKelembapan() >= 70 && +kls.getKelembapan() <= 80)
			{
				c3 = x;
				n3 = n3 + 1;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
			else
			{
				c3 = y;
				n3 = n3 + 0;
				if (+kls.getSuhu() >= 25 && +kls.getSuhu() <= 35)
				{
					c4 = x;
					n3 = n3 + 1;
				}
				else
				{
					c4 = y;
					n3 = n3 + 0;
				}
			}
		}
	}
	persen3 = (n3*100)/4;	
			
	
}

void prockebersihankelas(){
	if (kls.getKondisilantai().equalsIgnoreCase("bersih"))
	{
		d1 = x;
		n4 = n4 + 1;
		if (kls.getKondisidinding().equalsIgnoreCase("bersih"))
		{
			d2 = x;
			n4 = n4 + 1;
			if (kls.getKondisiatap().equalsIgnoreCase("bersih"))
			{
				d3 = x;
				n4 = n4 + 1;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
			else
			{
				d3 = y;
				n4 = n4 + 0;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
		}
		else
		{
			d2 = y;
			n4 = n4 + 0;
			if (kls.getKondisiatap().equalsIgnoreCase("bersih"))
			{
				d3 = x;
				n4 = n4 + 1;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
			else
			{
				d3 = y;
				n4 = n4 + 0;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
		}
	}
	else
	{
		d1 = y;
		n4 = n4 + 0;
		if (kls.getKondisidinding().equalsIgnoreCase("bersih"))
		{
			d2 = x;
			n4 = n4 + 1;
			if (kls.getKondisiatap().equalsIgnoreCase("bersih"))
			{
				d3 = x;
				n4 = n4 + 1;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
			else
			{
				d3 = y;
				n4 = n4 + 0;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
		}
		else
		{
			d2 = y;
			n4 = n4 + 0;
			if (kls.getKondisiatap().equalsIgnoreCase("bersih"))
			{
				d3 = x;
				n4 = n4 + 1;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
			else
			{
				d3 = y;
				n4 = n4 + 0;
				if (kls.getKondisipintu().equalsIgnoreCase("bersih"))
				{
					d4 = x;
					n4 = n4 + 1;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
				else
				{
					d4 = y;
					n4 = n4 + 0;
					if (kls.getKondisijendela().equalsIgnoreCase("bersih"))
					{
						d5 = x;
						n4 = n4 + 1;	
					}
					else
					{
						d5 = y;
						n4 = n4 + 0;
					}
				}
			}
		}
	}
	persen4 = (n4*100)/5;	
}

void prockenyamanankelas(){
	if (kls.getKebisingan().equalsIgnoreCase("tidak bising"))
	{
		e1 = x;
		n5 = n5 + 1;
		if (kls.getBau().equalsIgnoreCase("tidak bau"))
		{
			e2 = x;
			n5 = n5 + 1;
			if (kls.getKebocoran().equalsIgnoreCase("tidak bocor"))
			{
				e3 = x;
				n5 = n5 + 1;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
			else
			{
				e3 = y;
				n5 = n5 + 0;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
		}
		else
		{
			e2 = y;
			n5 = n5 + 0;
			if (kls.getKebocoran().equalsIgnoreCase("tidak bocor"))
			{
				e3 = x;
				n5 = n5 + 1;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
			else
			{
				e3 = y;
				n5 = n5 + 0;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
		}
	}
	else
	{
		e1 = y;
		n5 = n5 + 0;
		if (kls.getBau().equalsIgnoreCase("tidak bau"))
		{
			e2 = x;
			n5 = n5 + 1;
			if (kls.getKebocoran().equalsIgnoreCase("tidak bocor"))
			{
				e3 = x;
				n5 = n5 + 1;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
			else
			{
				e3 = y;
				n5 = n5 + 0;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
		}
		else
		{
			e2 = y;
			n5 = n5 + 0;
			if (kls.getKebocoran().equalsIgnoreCase("tidak bocor"))
			{
				e3 = x;
				n5 = n5 + 1;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
			else
			{
				e3 = y;
				n5 = n5 + 0;
				if (kls.getKerusakan().equalsIgnoreCase("tidak rusak"))
				{
					e4 = x;
					n5 = n5 + 1;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
				else
				{
					e4 = y;
					n5 = n5 + 0;
					if (kls.getKeausan().equalsIgnoreCase("tidak aus"))
					{
						e5 = x;
						n5 = n5 + 1;
					}
					else
					{
						e5 = y;
						n5 = n5 + 0;
					}
				}
			}
		}
	}
	persen5 = (n5*100)/5;	
}

void prockeamanankelas(){
	if (kls.getKekokohan().equalsIgnoreCase("kokoh")){
		f1 = x;
		n6 = n6 + 1;
		if (kls.getKuncipintu().equalsIgnoreCase("ada")){
			f2 = x;
			n6 = n6 + 1;
			if (kls.getKuncijendela().equalsIgnoreCase("ada")){
				f3 = x;
				n6 = n6 + 1;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
			else
			{
				f3 = y;
				n6 = n6 + 0;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
		}
		else
		{
			f2 = y;
			n6 = n6 + 0;
			if (kls.getKuncijendela().equalsIgnoreCase("ada")){
				f3 = x;
				n6 = n6 + 1;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
			else
			{
				f3 = y;
				n6 = n6 + 0;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
		}
	}
	else
	{
		f1 = y;
		n6 = n6 + 0;
		if (kls.getKuncipintu().equalsIgnoreCase("ada")){
			f2 = x;
			n6 = n6 + 1;
			if (kls.getKuncijendela().equalsIgnoreCase("ada")){
				f3 = x;
				n6 = n6 + 1;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
			else
			{
				f3 = y;
				n6 = n6 + 0;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
		}
		else
		{
			f2 = y;
			n6 = n6 + 0;
			if (kls.getKuncijendela().equalsIgnoreCase("ada")){
				f3 = x;
				n6 = n6 + 1;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
			else
			{
				f3 = y;
				n6 = n6 + 0;
				if (kls.getBahaya().equalsIgnoreCase("aman")){
					f4 = x;
					n6 = n6 + 1;
				}
				else
				{
					f4 = y;
					n6 = n6 + 0;
				}
			}
		}
	}
	persen6 = (n6*100)/4;
}


//method-method dibawah ini untuk menampilkan output an . . .

void getidentitasruang(){
	System.out.print("\nProdi : "+kls.getProdi());
	System.out.print("\nNama Ruang : "+kls.getNamaruang());
	System.out.print("\nLokasi Ruang : "+kls.getLokasiruang());
	//System.out.print("\nBentuk Ruang : "+kls.getBentukruang());
}	
	
void getkondisiruang(){
	System.out.print("\n\nPanjang Ruang : "+kls.getPanjangruang());
	System.out.print("\nLebar Ruang : "+kls.getLebarruang());
	System.out.print("\nBentuk Ruang : "+bentuk +"  (" + ""+a1 +")");
	System.out.print("\nJumlah Kursi : "+kls.getJumlahkursi());
	System.out.print("\nJumlah Pintu : "+kls.getJumlahpintu() +"  (" + ""+a3 +")");
	System.out.print("\nJumlah Jendela : "+kls.getJumlahjendela() +"  (" + ""+a4 +")");
	System.out.print("\nLuas Ruang : "+luasruang);
	System.out.print("\nRasio Ruang : "+rasioruang +"  (" + ""+a2 +")");
	//System.out.print(prockondisiruang());
	System.out.print("\nJumlah Sesuai = "+n1);
	System.out.print("\nKesesuaian = "+persen1 + "%");
}

void getkondisisarana(){
	System.out.print("\n\nJumlah Stop Kontak / Steker : "+kls.getJumlahsteker());
	System.out.print("\nKondisi Stop Kontak / Steker : "+kls.getKondisisteker());
    	System.out.print("\nPosisi Stop Kontak / Steker : "+kls.getPosisisteker());
	
}

void getlingkungankelas(){
	System.out.print("\n\nSirkulasi Udara : "+kls.getSirkulasi() +"  (" + ""+c1 +")");
	System.out.print("\nNilai Pencahayaan : "+kls.getPencahayaan() +"  (" + ""+c2 +")");
	System.out.print("\nkelembapan : "+kls.getKelembapan() +"  (" + ""+c3 +")");
	System.out.print("\nSuhu : "+kls.getSuhu() +"  (" + ""+c4 +")");
	System.out.print("\nJumlah Sesuai = "+n3);
	System.out.print("\nKesesuaian = "+persen3 + "%");
}

void getkebersihankelas(){
	System.out.print("\n\nKondisi Lantai : "+kls.getKondisilantai() +"  (" + ""+d1 +")");
	System.out.print("\nKondisi Dinding : "+kls.getKondisidinding() +"  (" + ""+d2 +")");
	System.out.print("\nKondisi Atap : "+kls.getKondisiatap() +"  (" + ""+d3 +")");
	System.out.print("\nKondisi Pintu : "+kls.getKondisipintu() +"  (" + ""+d4 +")");
	System.out.print("\nKondisi Jendela : "+kls.getKondisijendela() +"  (" + ""+d5 +")");
	System.out.print("\nJumlah Sesuai = "+n4);
	System.out.print("\nKesesuaian = "+persen4 + "%");
}

void getkenyamanankelas(){
	System.out.print("\n\nKebisingan : "+kls.getKebisingan() +"  (" + ""+e1 +")");
	System.out.print("\nBau        : "+kls.getBau() +"  (" + ""+e2 +")");
	System.out.print("\nKebocoran  : "+kls.getKebocoran() +"  (" + ""+e3 +")");
	System.out.print("\nKerusakan  : "+kls.getKerusakan() +"  (" + ""+e4 +")");
	System.out.print("\nKeausan    : "+kls.getKeausan() +"  (" + ""+e5 +")");
	System.out.print("\nJumlah Sesuai = "+n5);
	System.out.print("\nKesesuaian = "+persen5 + "%");
}

void getkeamanankelas(){
	System.out.print("\n\nKekokohan /t  : "+kls.getKekokohan() +"  (" + ""+f1 +")");
	System.out.print("\nKunci Pintu /t  : "+kls.getKuncipintu() +"  (" + ""+f2 +")");
	System.out.print("\nKunci Jendela /t: "+kls.getKuncijendela() +"  (" + ""+f3 +")");
	System.out.print("\nBahaya /t       : "+kls.getBahaya() +"  (" + ""+f4 +")");
	System.out.print("\nJumlah Sesuai = "+n6);
	System.out.print("\nKesesuaian = "+persen6 + "%");
}
}
