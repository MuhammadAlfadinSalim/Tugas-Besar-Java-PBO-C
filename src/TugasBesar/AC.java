package TugasBesar;

public class AC extends Sarana implements perhitungan{
	void in (){
		System.out.print("Jumlah AC : ");
		String jumlahac = scan.nextLine();
		kls.setJumlahac(jumlahac);
		
		System.out.print("kondisi AC : ");
		String Kondisiac = scan.nextLine();
		kls.setKondisiac(Kondisiac);
		
		System.out.print("posisi AC : ");
		String Posisiac = scan.nextLine();
		kls.setPosisiac(Posisiac);
	}
	public void proc(){
		if (kls.getJumlahac().equals("2"))
		{
			e1 = x;
			n5 = n5 + 1;
			if (kls.getKondisiac().equalsIgnoreCase("Baik"))
			{
				e2 = x;
				n5 = n5 + 1;
				if (kls.getPosisiac().equalsIgnoreCase("atap"))
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
				if (kls.getKondisiac().equalsIgnoreCase("Baik"))
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
			if (kls.getJumlahac().equals("2"))
			{
				e2 = x;
				n5 = n5 + 1;
				if (kls.getKondisiac().equalsIgnoreCase("Baik"))
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
				if (kls.getKondisiac().equalsIgnoreCase("Baik"))
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
		persen5 = (n5*100)/3;
	}
	void out(){
		System.out.print("\nPosisi AC : "+kls.getPosisiac() +"  (" + ""+e1 +")");
		System.out.print("\nJumlah AC : "+kls.getJumlahac() +"  (" + ""+e2 +")");
		System.out.print("\nKondisi AC : "+kls.getKondisiac() +"  (" + ""+e3 +")");
		System.out.print("\nJumlah Sesuai = "+n5);
		System.out.print("\nKesesuaian = "+persen5 + "%");
	}
}