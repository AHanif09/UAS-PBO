package uas_Pbo_AhmadHanif;

public class Red extends Burung implements Info {
	
	public Red(int jumlah) {
		super(jumlah);
		super.setnama("Red");
		super.setWarna("Merah");
		super.setdamage(1);
		super.setSkill("Menghancurkan kendaraan babi");
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
