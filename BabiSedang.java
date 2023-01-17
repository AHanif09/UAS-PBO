package uas_Pbo_AhmadHanif;

public class BabiSedang extends Babi implements Info {
	
	public BabiSedang(int jumlah) {
		super(jumlah);
		super.setBajuBesi(false);
		super.setTopi(true);
		super.setHp(3);
		super.setUkuran("Sedang");
	}
	
	@Override
	public void info() {
		System.out.println("Babi muda");
		System.out.println("Ukuran : " + super.getUkuran());
		System.out.println("Armor : Topi");	
		System.out.println("hp awal : 2");
		System.out.println("hp armor : 1");
		System.out.println("Jumlah : " + super.getJumlah());
		System.out.println("Ketahanan : "+super.getHp()+"\n");				
	}

}
