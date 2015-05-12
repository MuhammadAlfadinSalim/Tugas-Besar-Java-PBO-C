package TugasBesar;

public class lingkungan extends DataKelas implements perhitungan{

	@Override
	void in() {
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

	
	@Override
	public void proc() {
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

	
	@Override
	void out() {
		System.out.print("\n\nSirkulasi Udara : "+kls.getSirkulasi() +"  (" + ""+c1 +")");
		System.out.print("\nNilai Pencahayaan : "+kls.getPencahayaan() +"  (" + ""+c2 +")");
		System.out.print("\nkelembapan : "+kls.getKelembapan() +"  (" + ""+c3 +")");
		System.out.print("\nSuhu : "+kls.getSuhu() +"  (" + ""+c4 +")");
		System.out.print("\nJumlah Sesuai = "+n3);
		System.out.print("\nKesesuaian = "+persen3 + "%");
	}
	
}
