package TugasBesar;

public class kenyamanan extends DataKelas implements perhitungan{

	@Override
	void in() {
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

	@Override
	public void proc() {
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

	@Override
	void out() {
		System.out.print("\n\nKebisingan : "+kls.getKebisingan() +"  (" + ""+e1 +")");
		System.out.print("\nBau        : "+kls.getBau() +"  (" + ""+e2 +")");
		System.out.print("\nKebocoran  : "+kls.getKebocoran() +"  (" + ""+e3 +")");
		System.out.print("\nKerusakan  : "+kls.getKerusakan() +"  (" + ""+e4 +")");
		System.out.print("\nKeausan    : "+kls.getKeausan() +"  (" + ""+e5 +")");
		System.out.print("\nJumlah Sesuai = "+n5);
		System.out.print("\nKesesuaian = "+persen5 + "%");
	}
	
	
}