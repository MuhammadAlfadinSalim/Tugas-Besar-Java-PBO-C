package TugasBesar;

public class Internet extends Sarana implements perhitungan {
	void in (){
		System.out.print("SSID : ");
		String ssid = scan.nextLine();
		kls.setSsid(ssid);
	}
	public void proc(){
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
	}
	void out(){
		System.out.print("SSID : "+kls.getSsid());
	}
}
