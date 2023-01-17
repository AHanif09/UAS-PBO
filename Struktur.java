package uas_Pbo_AhmadHanif;

public abstract class Struktur {
	
	protected String nama;
	protected String warna;
	protected int hp;
	protected int jumlah;
	
	
	public Struktur(int jumlah) {
		this.jumlah=jumlah;
	}
	
	public void setnama(String nama) {
		this.nama=nama;
	}
	
	public String getnama() {
		return nama;
	}
	
	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public void sethp(int hp) {
		this.hp=hp;
	}
	
	public int gethp() {
		return this.hp;
	}
	
	public void setJumlah(int jumlah) {
		this.jumlah=jumlah;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	

}
