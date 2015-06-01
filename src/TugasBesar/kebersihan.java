package TugasBesar;

public class kebersihan extends DataKelas implements perhitungan{

	@Override
	void in() {
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


	@Override
	public void proc() {
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

	
	@Override
	void out() {
		System.out.print("\n\nKondisi Lantai : "+kls.getKondisilantai() +"  (" + ""+d1 +")");
		System.out.print("\nKondisi Dinding : "+kls.getKondisidinding() +"  (" + ""+d2 +")");
		System.out.print("\nKondisi Atap : "+kls.getKondisiatap() +"  (" + ""+d3 +")");
		System.out.print("\nKondisi Pintu : "+kls.getKondisipintu() +"  (" + ""+d4 +")");
		System.out.print("\nKondisi Jendela : "+kls.getKondisijendela() +"  (" + ""+d5 +")");
		System.out.print("\nJumlah Sesuai = "+n4);
		System.out.print("\nKesesuaian = "+persen4 + "%");
	}


}