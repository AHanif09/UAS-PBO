package uas_Pbo_AhmadHanif;

public class Kaca extends Struktur implements Info {

	public Kaca(int jumlah) {
		super(jumlah);
		super.setnama("Kaca");
		super.setWarna("Biru");
		super.sethp(1);
	}

	@Override
	public void info() {
		System.out.println("Nama Struktur: " + super.getnama());
		System.out.println("Warna Struktur: " + super.getWarna());
		System.out.println("Ketahanan Struktur: " + super.gethp());
		System.out.println("Jumlah Struktur: " + super.getJumlah() + "\n");
	}

}
