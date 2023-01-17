package uas_Pbo_AhmadHanif;

public class Chuck extends Burung implements Info {
	
	public Chuck(int jumlah) {
		super(jumlah);
		super.setnama("Chuck");
		super.setWarna("Kuning");
		super.setdamage(3);
		super.setSkill("Bergerak cepat dan menghancurkan kayu");
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
