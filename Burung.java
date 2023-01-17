package uas_Pbo_AhmadHanif;

public abstract class Burung {

	protected String nama;
	protected int damage;
	protected String skill;
	protected int jumlah;
	protected String warna;

	public Burung(int jumlah) {
		this.jumlah = jumlah;
	}

	public void setnama(String nama) {
		this.nama = nama;
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

	public void setdamage(int damage) {
		this.damage = damage;
	}

	public int getdamage() {
		return damage;
	}

	public void setjumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public int getjumlah() {
		return jumlah;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}
	


}
