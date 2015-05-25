package TugasBesar;

public class Internet extends Sarana implements perhitungan {

	@Override
	void in() {
		System.out.print("SSID : ");
		String ssid = scan.nextLine();
		kls.setSsid(ssid);
	}

	@Override
	public void proc() {
		if (kls.getSsid().equalsIgnoreCase("UMM Hotspot"))
		{
			f1 = x;
			n6 = n6 + 1;
		}
		else
		{
			f1 = y;
			n6 = n6 + 0;
		}
		persen5 = (n5*100)/1;
	}
	
	@Override
	void out() {
		System.out.print("SSID : "+kls.getSsid() +"  (" + ""+f1 +")");
		System.out.print("\nJumlah Sesuai = "+n6);
		System.out.print("\nKesesuaian = "+persen6 + "%");
	}
}
