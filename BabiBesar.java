package uas_Pbo_AhmadHanif;

public class BabiBesar extends Babi implements Info {

	public BabiBesar(int jumlah){
		super(jumlah);
        super.setBajuBesi(true);
        super.setTopi(true);
        super.setHp(6);
        super.setUkuran("Besar");
    }
	
	@Override
	public void info() {
		System.out.println("Babi Dewasa");
		System.out.println("Ukuran : " + super.getUkuran());
		System.out.println("Armor : Topi, Baju Besi");	
		System.out.println("hp awal : 3");
		System.out.println("hp armor : 1 + 2");
		System.out.println("Jumlah : " + super.getJumlah());
		System.out.println("Ketahanan : "+super.getHp()+"\n");	
	}

}
