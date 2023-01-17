package uas_Pbo_AhmadHanif;

public class Matilda extends Burung implements Info {
	
	public Matilda(int jumlah) {
		super(jumlah);
		super.setnama("Matilda");
		super.setWarna("Putih");
		super.setdamage(4);
		super.setSkill("Melempar telur peledak");
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
