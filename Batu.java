package uas_Pbo_AhmadHanif;

public class Batu extends Struktur implements Info {
	
	public Batu(int jumlah) {
		super(jumlah);
		super.setnama("Batu");
		super.setWarna("Abu-abu");
		super.sethp(3);
	}

	@Override
	public void info() {
		System.out.println("Nama Struktur: " + super.getnama());
		System.out.println("Warna Struktur: " + super.getWarna());
		System.out.println("Ketahanan Struktur: " + super.gethp());
		System.out.println("Jumlah Struktur: " + super.getJumlah()+"\n");
	}

}
