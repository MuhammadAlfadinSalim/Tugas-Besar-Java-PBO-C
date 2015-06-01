package TugasBesar;

public class keamanan extends DataKelas implements perhitungan{

	@Override
	void in() {
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

	@Override
	public void proc() {
		if (kls.getKekokohan().equalsIgnoreCase("kokoh")){
			f1 =x;
			n6 = n6 + 1;
			if (kls.getKuncipintu().equalsIgnoreCase("ada")){
				f2 =x;
				n6 = n6 + 1;
				if (kls.getKuncijendela().equalsIgnoreCase("ada")){
					f3 =x;
					n6 = n6 + 1;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
				else
				{
					f3 =y;
					n6 = n6 + 0;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
			}
			else
			{
				f2 =y;
				n6 = n6 + 0;
				if (kls.getKuncijendela().equalsIgnoreCase("ada")){
					f3 =x;
					n6 = n6 + 1;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
				else
				{
					f3 =y;
					n6 = n6 + 0;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
			}
		}
		else
		{
			f1 =y;
			n6 = n6 + 0;
			if (kls.getKuncipintu().equalsIgnoreCase("ada")){
				f2 =x;
				n6 = n6 + 1;
				if (kls.getKuncijendela().equalsIgnoreCase("ada")){
					f3 =x;
					n6 = n6 + 1;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
				else
				{
					f3 =y;
					n6 = n6 + 0;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
			}
			else
			{
				f2 =y;
				n6 = n6 + 0;
				if (kls.getKuncijendela().equalsIgnoreCase("ada")){
					f3 =x;
					n6 = n6 + 1;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
				else
				{
					f3 =y;
					n6 = n6 + 0;
					if (kls.getBahaya().equalsIgnoreCase("aman")){
						f4 =x;
						n6 = n6 + 1;
					}
					else
					{
						f4 =y;
						n6 = n6 + 0;
					}
				}
			}
		}
		persen6 = (n6*100)/4;
	}

	@Override
	void out() {
		System.out.print("\n\nKekokohan  	: "+kls.getKekokohan() +"  (" + ""+f1 +")");
		System.out.print("\nKunci Pintu  	: "+kls.getKuncipintu() +"  (" + ""+f2 +")");
		System.out.print("\nKunci Jendela	: "+kls.getKuncijendela() +"  (" + ""+f3 +")");
		System.out.print("\nBahaya			: "+kls.getBahaya() +"  (" + ""+f4 +")");
		System.out.print("\nJumlah Sesuai = "+n6);
		System.out.print("\nKesesuaian = "+persen6 + "%");
	}
}