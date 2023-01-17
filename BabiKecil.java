package uas_Pbo_AhmadHanif;

public class BabiKecil extends Babi implements Info{

	public BabiKecil(int jumlah){
		super(jumlah);
        super.setBajuBesi(false);
        super.setTopi(false);
        super.setHp(1);
        super.setUkuran("Kecil");
    }
	
	@Override
	public void info() {
		System.out.println("Anak Babi");
		System.out.println("Ukuran : " + super.getUkuran());
		System.out.println("Armor : Tidak ada");	
		System.out.println("hp awal : 2");
		System.out.println("hp armor : 0");
		System.out.println("Jumlah : " + super.getJumlah());
		System.out.println("Ketahanan : "+super.getHp()+"\n");

	}
}
