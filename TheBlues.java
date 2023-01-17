package uas_Pbo_AhmadHanif;

public class TheBlues extends Burung implements Info {
	
	public TheBlues(int jumlah) {
		super(jumlah);
		super.setnama("The Blues (Jay, Jake dan Jim)");
		super.setWarna("Biru");
		super.setdamage(2);
		super.setSkill("Menghancurkan es");
	}

	@Override
	public void info() {
		System.out.println("Nama Burung: " + super.getnama());
		System.out.println("Warna Burung: " + super.getWarna());
		System.out.println("Damage Burung: " + super.getdamage());
		System.out.println("Jumlah Burung: " + super.getjumlah());
		System.out.println("Kekuatan Spesial: " + super.getSkill()+"\n");
	}

}
