package TugasBesar;

public class identitasruang extends DataKelas implements perhitungan{

	@Override
	void in() {
		System.out.print("Prodi : ");
		String prodi = scan.nextLine();
		kls.setProdi(prodi);
		
		System.out.print("Nama Ruang : ");
		String namaruang = scan.nextLine();
		kls.setNamaruang(namaruang);
		
		System.out.print("Lokasi Ruang : ");
		String lokasiruang = scan.nextLine();
		kls.setLokasiruang(lokasiruang);
	}

	@Override
	public void proc() {

	}

	@Override
	void out() {
		System.out.print("\nProdi : "+kls.getProdi());
		System.out.print("\nNama Ruang : "+kls.getNamaruang());
		System.out.print("\nLokasi Ruang : "+kls.getLokasiruang());		
	}	
			
	
}