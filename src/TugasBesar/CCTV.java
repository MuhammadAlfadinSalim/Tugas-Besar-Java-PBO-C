package TugasBesar;

public class CCTV extends Sarana implements perhitungan {
	void in (){
		System.out.print("Jumlah cctv : ");
		Double jumlahcctv = scan.nextDouble();
		kls.setJumlahcctv(jumlahcctv);
		
		System.out.print("kondisi cctv : ");
		String Kondisicctv = scan.nextLine();
		kls.setKondisicctv(Kondisicctv);
		
		System.out.print("posisi cctv : ");
		String Posisicctv = scan.nextLine();
		kls.setPosisicctv(Posisicctv);
	}
	public void proc(){
		if (kls.getKondisicctv().equalsIgnoreCase("Baik"))
		{
			g1 = x;
			n7 = n7 + 1;
		if (kls.getJumlahcctv().equals("2"))
		{
			g2 = x;
			n7 = n7 + 1;
			if (kls.getPosisicctv().equalsIgnoreCase("Depan atau Belakang"))
		{
			g3 = x;
			n7 = n7 + 1;	
		}
			else
		{
			g3 = y;
			n7 = n7 + 0;
		}
	}
			else
		{
			g2 = y;
			n7 = n7 + 0;
			if (kls.getKebocoran().equalsIgnoreCase("tidak bocor"))
		{
			g3 = x;
			n7 = n7 + 1;		 
		}
			else
		{
			g3 = y;
			n7 = n7 + 0;		
		}
	}
}
	
		else
		{
			g1 = y;
			n7 = n7 + 0;
			if (kls.getBau().equalsIgnoreCase("tidak bau"))
		{
			g2 = x;
			n7 = n7 + 1;
			if (kls.getKebocoran().equalsIgnoreCase("tidak bocor"))
		{
			g3 = x;
			n7 = n7 + 1;
		}
			else	
		{
			g3 = y;
			n7 = n7 + 0;
		}
	}			
			else
		{
			g2 = y;
			n7 = n7 + 0;
			if (kls.getKebocoran().equalsIgnoreCase("tidak bocor"))
		{
			g3 = x;
			n7 = n7 + 1;
		}
			else
		{
			g3 = y;
			n7 = n7 + 0;
		}
	}
		persen5 = (n7*100)/5;
	}
}
	void out(){
		System.out.print("\nPosisi CCTV : "+kls.getPosisicctv());
		System.out.print("\nJumlah CCTV : "+kls.getJumlahcctv());
		System.out.print("\nKondisi CCTV : "+kls.getKondisicctv());
	}
}
