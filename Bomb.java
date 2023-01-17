package uas_Pbo_AhmadHanif;

public class Bomb extends Burung implements Info {
	
	public Bomb(int jumlah) {
		super(jumlah);
		super.setnama("Bomb");
		super.setWarna("Hitam");
		super.setdamage(5);
		super.setSkill("Meledak dan menghancurkan batu");
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
