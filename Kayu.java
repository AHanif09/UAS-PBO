package uas_Pbo_AhmadHanif;

public class Kayu extends Struktur implements Info {
	
	public Kayu(int jumlah) {
		super(jumlah);
		super.setnama("Kayu");
		super.setWarna("Coklat");
		super.sethp(2);
	}

	@Override
	public void info() {
		System.out.println("Nama Struktur: " + super.getnama());
		System.out.println("Warna Struktur: " + super.getWarna());
		System.out.println("Ketahanan Struktur: " + super.gethp());
		System.out.println("Jumlah Struktur: " + super.getJumlah()+"\n");
	}

}
