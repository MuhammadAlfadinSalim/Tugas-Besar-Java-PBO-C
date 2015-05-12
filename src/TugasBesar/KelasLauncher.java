package TugasBesar;

public class KelasLauncher {
	public static void main(String [] tugasbesar){
		
	identitasruang identitas = new identitasruang();
	kondisiruang koruang = new kondisiruang();
	kebersihan bersih = new kebersihan();
	lingkungan lingkung = new lingkungan();
	kenyamanan nyaman = new kenyamanan();
	keamanan aman = new keamanan();
	
	///////////////////////////////////////////////////////////////
	identitas.in();
	koruang.in();
	bersih.in();
	lingkung.in();
	nyaman.in();
	aman.in();
	
	///////////////////////////////////////////////////////////////
	identitas.proc();
	koruang.proc();
	bersih.proc();
	lingkung.proc();
	nyaman.proc();
	aman.proc();
	
	///////////////////////////////////////////////////////////////
	identitas.out();
	koruang.out();
	bersih.out();
	lingkung.out();
	nyaman.out();
	aman.out();
	}
}
