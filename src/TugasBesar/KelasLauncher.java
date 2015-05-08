package TugasBesar;

public class KelasLauncher {
	public static void main(String [] tugasbesar){
	DataKelas data = new DataKelas();
	kebersihan bersih = new kebersihan();
	
	data.setidentitasruang();
	//data.setkondisiruang();
	//data.setkondisisarana();
	//data.setlingkungankelas();
	bersih.setkebersihankelas();
	//data.setkenyamanankelas();
	//data.setkeamanankelas();
	
	///////////////////////////////////////////////////////////////
	
	//data.prockondisiruang();
	//data.prockondisisarana();
	//data.proclingkungankelas();
	bersih.prockebersihankelas();
	//data.prockenyamanankelas();
	//data.prockeamanankelas();
	
	///////////////////////////////////////////////////////////////
	
	data.getidentitasruang();
	//data.getkondisiruang();
	//data.getkondisisarana();
	//data.getlingkungankelas();
    bersih.getkebersihankelas();
	//data.getkenyamanankelas();
    //data.getkeamanankelas();
	}
}
