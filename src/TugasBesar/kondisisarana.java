package TugasBesar;

public class kondisisarana extends DataKelas{

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
	
	void prockondisisarana(){
		// Milik Zul
		if (+kls.getJumlahsteker()>=4&&kls.getKondisisteker().equals("baik")&&kls.getPosisisteker().equals("pojok ruangan")&&kls.getPosisisteker().equals("dekat dosen")){
                    b1 = x;
                    n2 = n2 + 1;
                    
                    if(+kls.getJumlahkabellcd()>=1&&kls.getKondisikabellcd().equals("berfungsi")&&kls.getPosisikabellcd().equals("dekat dosen")){
                        b2 = x;
                        n2 = n2 +1;
                        
                        if(+kls.getJumlahlampu()>=18&&kls.getKondisilampu().equals("baik")&&kls.getPosisilampu().equals("atap ruangan")){
                            b3 = x;
                            n2 = n2 + 1;
                            
                            if(+kls.getJumlahkipasangin()>=2&&kls.getKondisikipasangin().equals("baik")&&kls.getPosisikipasangin().equals("atap ruangan")){
                            b4 = x;
                            n2 = n2 +1;
                            
                            if(+kls.getJumlahac()>=1&&kls.getKondisiac().equals("baik")&&kls.getPosisiac().equals("dibelakang")&&kls.getPosisiac().equals("disamping")){
                                b5 = x;
                                n2 = n2 + 1;
                                
                                if(kls.getSsid().equals("UMMHotspot")){
                                   b6 = x;
                                   n2 = n2 + 1;
                                   
                                   if(+kls.getJumlahcctv()==2&&kls.getKondisicctv().equals("baik")&&kls.getPosisicctv().equals("depan")&&kls.getPosisicctv().equals("belakang")){
                                       b7 = x;
                                       n2 = n2 + 1;
                                   }
                                   
                                   else {
                                       b7 = y;
                                       n2 = n2 + 0;
                                   }
                                }
                                
                                else {
                                    b6 = y;
                                    n2 = n2 + 0;
                                }
                            }
                            else {
                                b5 = y;
                                n2 = n2 + 0;
                            }
                        }
                            else {
                                b4 = y;
                                n2 = n2 + 0;
                            }
                        }
                        else {
                            b3 = y;
                            n2 = n2 + 0;
                        }
                    }
                    else {
                        b2 = y;
                        n2 = n2 + 0;
                    }
                }
                else {
                    b1 = y;
                    n2 = n2 + 0;
                }
		}
	
	void getkondisisarana(){
		System.out.print("\n\nJumlah Stop Kontak / Steker : "+kls.getJumlahsteker() +"  (" + ""+b1 +")");
		System.out.print("\nKondisi Stop Kontak / Steker : "+kls.getKondisisteker()+"  (" + ""+b1 +")");
	    	System.out.print("\nPosisi Stop Kontak / Steker : "+kls.getPosisisteker()+"  (" + ""+b1 +")");
                
                System.out.print("\nJumlah Kabel LCD : "+kls.getJumlahkabellcd() +"  (" + ""+b2 +")");
                System.out.print("\nKondisi Kabel LCD : "+kls.getKondisikabellcd() +"  (" + ""+b2 +")");
                System.out.print("\nPosisi Kabel LCD : "+kls.getPosisikabellcd() +"  (" + ""+b2 +")");
                
                System.out.print("\nJumlah Lampu : "+kls.getJumlahlampu() +"  (" + ""+b3 +")");
                System.out.print("\nKondisi Lampu : "+kls.getKondisilampu() +"  (" + ""+b3 +")");
                System.out.print("\nPosisi Lampu : "+kls.getPosisilampu() +"  (" + ""+b3 +")");
                
                System.out.print("\nJumlah Kipas : "+kls.getJumlahkipasangin() +"  (" + ""+b4 +")");
                System.out.print("\nkondisi Kipas : "+kls.getKondisikipasangin() +"  (" + ""+b4 +")");
                System.out.print("\nPosisi Kipas : "+kls.getPosisikipasangin() +"  (" + ""+b4 +")");
                
                System.out.print("\nJumlah AC : "+kls.getJumlahac() +"  (" + ""+b5 +")");
                System.out.print("\nKondisi AC : "+kls.getKondisiac() +"  (" + ""+b5 +")");
                System.out.print("\nPosisi AC : "+kls.getPosisiac() +"  (" + ""+b5 +")");
                
                System.out.print("\nInternet : "+kls.getSsid() +"  (" + ""+b6 +")");
                
                System.out.print("\nJumlah CCTV : "+kls.getJumlahcctv() +"  (" + ""+b7 +")");
		System.out.print("\nKondisi CCTV : "+kls.getKondisicctv() +"  (" + ""+b7 +")");
                System.out.print("\nPosisi CCTV : "+kls.getPosisicctv() +"  (" + ""+b7 +")");
	}
}

