package TugasBesar;
//import java.io.*;
public class CCTV extends Sarana implements perhitungan {

	//public CCTV(String string) {
	//}
	frame fr = new frame();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String result, result2, result3, result4, result5;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	void in() {
		//frame fr;
		
	
		System.out.print("Jumlah cctv : ");
		String jumlahcctv = scan.nextLine();
		kls.setJumlahcctv(jumlahcctv);
		
		System.out.print("kondisi cctv : ");
		String Kondisicctv = scan.nextLine();
		kls.setKondisicctv(Kondisicctv);
		
		System.out.print("posisi cctv : ");
		String Posisicctv = scan.nextLine();
		kls.setPosisicctv(Posisicctv);
	}

	@Override
	public void proc() {
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
		}
		else
		{
			g1 = y;
			n7 = n7 + 0;
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
		}
		persen7 = (n7*100)/3;
	}

	@Override
	void out() {
		result = "Kondisi CCTV : "+kls.getKondisicctv() +"  (" + ""+g1 +")";
		result2	= "Jumlah CCTV : "+kls.getJumlahcctv() +"  (" + ""+g2 +")";
		result3 = "Posisi CCTV : "+kls.getPosisicctv() +"  (" + ""+g3 +")";
		result4 = "Jumlah Sesuai = "+n7;
		result5 = "Kesesuaian = "+persen7 + "%";
		
		System.out.print("\nKondisi CCTV : "+kls.getKondisicctv() +"  (" + ""+g1 +")");
		System.out.print("\nJumlah CCTV : "+kls.getJumlahcctv() +"  (" + ""+g2 +")");
		System.out.print("\nPosisi CCTV : "+kls.getPosisicctv() +"  (" + ""+g3 +")");
		System.out.print("\nJumlah Sesuai = "+n7);
		System.out.print("\nKesesuaian = "+persen7 + "%");
	}

}
