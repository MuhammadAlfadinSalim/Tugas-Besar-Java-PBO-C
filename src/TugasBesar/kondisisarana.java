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
	
	void getkondisisarana(){
		System.out.print("\n\nJumlah Stop Kontak / Steker : "+kls.getJumlahsteker());
		System.out.print("\nKondisi Stop Kontak / Steker : "+kls.getKondisisteker());
	    	System.out.print("\nPosisi Stop Kontak / Steker : "+kls.getPosisisteker());
		
	}
}

