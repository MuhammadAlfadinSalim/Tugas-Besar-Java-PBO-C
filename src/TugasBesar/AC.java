package TugasBesar;

public class AC extends Sarana implements perhitungan{
	void in (){
		System.out.print("Jumlah ac : ");
		Double jumlahac = scan.nextDouble();
		kls.setJumlahac(jumlahac);
		
		System.out.print("kondisi ac : ");
		String Kondisiac = scan.nextLine();
		kls.setKondisiac(Kondisiac);
		
		System.out.print("posisi ac : ");
		String Posisiac = scan.nextLine();
		kls.setPosisiac(Posisiac);
	}
	public void proc(){
		if (kls.getKondisiac().equalsIgnoreCase("Baik"))
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
					
				}
				else
				{
					e3 = y;
					n5 = n5 + 0;
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
					 
				}
				else
				{
					e3 = y;
					n5 = n5 + 0;
					
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
				}
				else	
				{
					e3 = y;
					n5 = n5 + 0;
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
				}
				else
				{
					e3 = y;
					n5 = n5 + 0;
				}
			}
		persen5 = (n5*100)/5;
	}
	}
	void out(){
		System.out.print("\nPosisi AC : "+kls.getPosisiac());
		System.out.print("\nJumlah AC : "+kls.getJumlahac());
		System.out.print("\nKondisi AC : "+kls.getKondisiac());
	}
}