package TugasBesar;
public class kondisiruang extends DataKelas implements perhitungan{
	
	String result, result2, result3, result4, result5; 
	//frame fr = new frame();
	
	@Override
	void in() {
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

	@Override
	public void proc() {
		luasruang = kls.getPanjangruang() * kls.getLebarruang();
		rasioruang = luasruang / kls.getJumlahkursi();
		if (+kls.getPanjangruang() != +kls.getLebarruang()) //1
		{
			bentuk = "Persegi Panjang";
			a1 = x;
			n1 = n1 + 1;
			if (rasioruang >= 0.5) //2
			{
				a2 = x;
				n1 = n1 + 1;	
				if (kls.getJumlahpintu() >= 2) //3
				{
					a3 = x;
					n1 = n1 + 1;
					if (kls.getJumlahjendela() >= 1) //4
					{
						a4 = x;
						n1 = n1 + 1;
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
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
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
					}
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
					if (kls.getJumlahjendela() >= 1) //4
					{
						a4 = x;
						n1 = n1 + 1;
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
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
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
					}
				}
			}
		}
		else // 1 
		{
			bentuk = "Persegi";
			a1 = y;
			n1 = n1 + 0;
			if (rasioruang >= 0.5) //2
			{
				a2 = x;
				n1 = n1 + 1;	
				if (kls.getJumlahpintu() >= 2) //3
				{
					a3 = x;
					n1 = n1 + 1;
					if (kls.getJumlahjendela() >= 1) //4
					{
						a4 = x;
						n1 = n1 + 1;
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
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
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
					}
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
					if (kls.getJumlahjendela() >= 1) //4
					{
						a4 = x;
						n1 = n1 + 1;
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
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
					}
					else //4 
					{
						a4 = y;
						n1 = n1 + 0;
					}
				}
			}
		}
		persen1 = (n1*100)/4;	
	}
		

	@Override
	void out() {
			/*result = "Kondisi CCTV : "+kls.getKondisicctv() +"  (" + ""+a1 +")";
			result2	= "Jumlah CCTV : "+kls.getJumlahcctv() +"  (" + ""+a2 +")";
			result3 = "Posisi CCTV : "+kls.getPosisicctv() +"  (" + ""+a3 +")";
			result3 = "Posisi CCTV : "+kls.getPosisicctv() +"  (" + ""+a4 +")";
			result4 = "Jumlah Sesuai = "+n7;
			result5 = "Kesesuaian = "+persen7 + "%";*/

			System.out.print("\n\nPanjang Ruang : "+kls.getPanjangruang());
			System.out.print("\nLebar Ruang : "+kls.getLebarruang());
			System.out.print("\nBentuk Ruang : "+bentuk +"  (" + ""+a1 +")");
			System.out.print("\nJumlah Kursi : "+kls.getJumlahkursi());
			System.out.print("\nJumlah Pintu : "+kls.getJumlahpintu() +"  (" + ""+a3 +")");
			System.out.print("\nJumlah Jendela : "+kls.getJumlahjendela() +"  (" + ""+a4 +")");
			System.out.print("\nLuas Ruang : "+luasruang);
			System.out.print("\nRasio Ruang : "+rasioruang +"  (" + ""+a2 +")");
			System.out.print("\nJumlah Sesuai = "+n1);
			System.out.print("\nKesesuaian = "+persen1 + "%");
	}
	
}