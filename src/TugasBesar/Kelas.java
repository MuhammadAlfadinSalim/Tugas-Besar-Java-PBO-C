package TugasBesar;

public class Kelas {
	
private String prodi, namaruang, bentukruang, lokasiruang; // variable untuk identitas ruang

private Double panjangruang, lebarruang;
private int jumlahkursi, jumlahpintu, jumlahjendela; // variable untuk kondisi ruang

private String jumlahsteker, kondisisteker, posisisteker, jumlahkabellcd,
kondisikabellcd, posisikabellcd, jumlahlampu,
posisilampu, jumlahkipasangin, kondisikipasangin,
posisikipasangin, jumlahac, kondisiac, posisiac, ssid,
bandwidth, jumlahcctv, kondisicctv, posisicctv; // variable untuk kondisi sarana ruang


private String kondisilantai, kondisidinding,
kondisiatap, kondisipintu, kondisijendela; // variable untuk lingkungan ruang

private String sirkulasi;
private Double pencahayaan, kelembapan, suhu; // variable untuk kebersihan ruang

private String kebisingan, bau, kebocoran, kerusakan, keausan; // variable untuk kenyamanan ruang

private String kekokohan, kuncipintu, kuncijendela, bahaya; // variable untuk keamanan ruang


//Setter n Getter untuk identitas ruang kelas
public String getProdi() {
	return prodi;
}
public void setProdi(String prodi) {
	this.prodi = prodi;
}
public String getNamaruang() {
	return namaruang;
}
public void setNamaruang(String namaruang) {
	this.namaruang = namaruang;
}
public String getBentukruang() {
	return bentukruang;
}
public void setBentukruang(String bentukruang) {
	this.bentukruang = bentukruang;
}
public String getLokasiruang() {
	return lokasiruang;
}
public void setLokasiruang(String lokasiruang) {
	this.lokasiruang = lokasiruang;
}


//Setter n Getter untuk Kondisi Ruang Kelas, ini yang dibuat zulfikar
public Double getPanjangruang() {
	return panjangruang;
}
public void setPanjangruang(Double panjangruang) {
	this.panjangruang = panjangruang;
}
public Double getLebarruang() {
	return lebarruang;
}
public void setLebarruang(Double lebarruang) {
	this.lebarruang = lebarruang;
}
public int getJumlahkursi() {
	return jumlahkursi;
}
public void setJumlahkursi(int jumlahkursi) {
	this.jumlahkursi = jumlahkursi;
}
public int getJumlahpintu() {
	return jumlahpintu;
}
public void setJumlahpintu(int jumlahpintu) {
	this.jumlahpintu = jumlahpintu;
}
public int getJumlahjendela() {
	return jumlahjendela;
}
public void setJumlahjendela(int jumlahjendela) {
	this.jumlahjendela = jumlahjendela;
}


//Setter n Getter untuk jumlah,kondisi, dan posisi sarana
public String getJumlahsteker() {
    return jumlahsteker;
}
public void setJumlahsteker(String jumlahsteker) {
    this.jumlahsteker = jumlahsteker;
}
public String getKondisisteker() {
    return kondisisteker;
}
public void setKondisisteker(String kondisisteker) {
    this.kondisisteker = kondisisteker;
}
public String getPosisisteker() {
    return posisisteker;
}
public void setPosisisteker(String posisisteker) {
    this.posisisteker = posisisteker;
}
public String getJumlahkabellcd() {
    return jumlahkabellcd;
}
public void setJumlahkabellcd(String jumlahkabellcd) {
    this.jumlahkabellcd = jumlahkabellcd;
}
public String getKondisikabellcd() {
    return kondisikabellcd;
}
public void setKondisikabellcd(String kondisikabellcd) {
    this.kondisikabellcd = kondisikabellcd;
}
public String getPosisikabellcd() {
    return posisikabellcd;
}
public void setPosisikabellcd(String posisikabellcd) {
    this.posisikabellcd = posisikabellcd;
}
public String getJumlahlampu() {
    return jumlahlampu;
}
public void setJumlahlampu(String jumlahlampu) {
    this.jumlahlampu = jumlahlampu;
}
public String getPosisilampu() {
    return posisilampu;
}
public void setPosisilampu(String posisilampu) {
    this.posisilampu = posisilampu;
}
public String getJumlahkipasangin() {
    return jumlahkipasangin;
}
public void setJumlahkipasangin(String jumlahkipasangin) {
    this.jumlahkipasangin = jumlahkipasangin;
}
public String getKondisikipasangin() {
    return kondisikipasangin;
}
public void setKondisikipasangin(String kondisikipasangin) {
    this.kondisikipasangin = kondisikipasangin;
}
public String getPosisikipasangin() {
    return posisikipasangin;
}
public void setPosisikipasangin(String posisikipasangin) {
    this.posisikipasangin = posisikipasangin;
}
public String getJumlahac() {
    return jumlahac;
}
public void setJumlahac(String jumlahac) {
    this.jumlahac = jumlahac;
}
public String getKondisiac() {
    return kondisiac;
}
public void setKondisiac(String kondisiac) {
    this.kondisiac = kondisiac;
}
public String getPosisiac() {
    return posisiac;
}
public void setPosisiac(String posisiac) {
    this.posisiac = posisiac;
}
public String getSsid() {
    return ssid;
}
public void setSsid(String ssid) {
    this.ssid = ssid;
}
public String getBandwidth() {
    return bandwidth;
}
public void setBandwidth(String bandwidth) {
    this.bandwidth = bandwidth;
}
public String getJumlahcctv() {
    return jumlahcctv;
}
public void setJumlahcctv(String jumlahcctv) {
    this.jumlahcctv = jumlahcctv;
}
public String getKondisicctv() {
    return kondisicctv;
}
public void setKondisicctv(String kondisicctv) {
    this.kondisicctv = kondisicctv;
}
public String getPosisicctv() {
    return posisicctv;
}
public void setPosisicctv(String posisicctv) {
    this.posisicctv = posisicctv;
}


//Setter n Getter untuk lingkungan ruang kelas
public String getKondisilantai() {
	return kondisilantai;
}

public void setKondisilantai(String kondisilantai) {
	this.kondisilantai = kondisilantai;
}

public String getKondisidinding() {
	return kondisidinding;
}

public void setKondisidinding(String kondisidinding) {
	this.kondisidinding = kondisidinding;
}

public String getKondisiatap() {
	return kondisiatap;
}

public void setKondisiatap(String kondisiatap) {
	this.kondisiatap = kondisiatap;
}

public String getKondisipintu() {
	return kondisipintu;
}

public void setKondisipintu(String kondisipintu) {
	this.kondisipintu = kondisipintu;
}

public String getKondisijendela() {
	return kondisijendela;
}

public void setKondisijendela(String kondisijendela) {
	this.kondisijendela = kondisijendela;
}


//Setter n Getter untuk kebersihan ruang kelas
public String getSirkulasi() {
	return sirkulasi;
}
public void setSirkulasi(String sirkulasi) {
	this.sirkulasi = sirkulasi;
}
public Double getPencahayaan() {
	return pencahayaan;
}
public void setPencahayaan(Double pencahayaan) {
	this.pencahayaan = pencahayaan;
}
public Double getKelembapan() {
	return kelembapan;
}
public void setKelembapan(Double kelembapan) {
	this.kelembapan = kelembapan;
}
public Double getSuhu() {
	return suhu;
}
public void setSuhu(Double suhu) {
	this.suhu = suhu;
}


//Setter n Getter untuk kenyamanan ruang Kelas
public String getKebisingan() {
	return kebisingan;
}
public void setKebisingan(String kebisingan) {
	this.kebisingan = kebisingan;
}
public String getBau() {
	return bau;
}
public void setBau(String bau) {
	this.bau = bau;
}
public String getKebocoran() {
	return kebocoran;
}
public void setKebocoran(String kebocoran) {
	this.kebocoran = kebocoran;
}
public String getKerusakan() {
	return kerusakan;
}
public void setKerusakan(String kerusakan) {
	this.kerusakan = kerusakan;
}
public String getKeausan() {
	return keausan;
}
public void setKeausan(String keausan) {
	this.keausan = keausan;
}


//Setter n Getter untuk keamanan ruang kelas
public String getKekokohan() {
	return kekokohan;
}
public void setKekokohan(String kekokohan) {
	this.kekokohan = kekokohan;
}
public String getKuncipintu() {
	return kuncipintu;
}
public void setKuncipintu(String kuncipintu) {
	this.kuncipintu = kuncipintu;
}
public String getKuncijendela() {
	return kuncijendela;
}
public void setKuncijendela(String kuncijendela) {
	this.kuncijendela = kuncijendela;
}
public String getBahaya() {
	return bahaya;
}
public void setBahaya(String bahaya) {
	this.bahaya = bahaya;
}	
	
	
}
