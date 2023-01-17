package uas_Pbo_AhmadHanif;

public class Main {
	public static void main(String[] args) {
		//Burung
		Red red = new Red(2);
		int jumlahRed = red.getjumlah();
		TheBlues blues = new TheBlues(1);
		int jumlahBlues = blues.getjumlah();
		Chuck chuck = new Chuck(1);
		int jumlahChuck = chuck.getjumlah();
		Bomb bomb = new Bomb(1);
		int jumlahBomb = bomb.getjumlah();
		Matilda matilda = new Matilda(2);
		int jumlahMatilda = matilda.getjumlah();
		
		//Babi	
		BabiKecil b1 = new BabiKecil(2);
		BabiSedang b2 = new BabiSedang(1);
		BabiBesar b3 = new BabiBesar(1);
		int totalHpBkecil = (b1.getHp()*b1.getJumlah());
		int totalHpBsedang = (b2.getHp()*b2.getJumlah());
		int totalHpBbesar = (b3.getHp()*b3.getJumlah());
		
		//Struktur
		Kaca kaca = new Kaca(1);
		Kayu kayu = new Kayu(1);
		Batu batu = new Batu(2);
		int totalHpKaca = (kaca.gethp()*kaca.getJumlah());
		int totalHpKayu = (kayu.gethp()*kayu.getJumlah());
		int totalHpBatu = (batu.gethp()*batu.getJumlah());
		
		int total = totalHpBkecil + totalHpBsedang + totalHpBbesar+ totalHpKaca 
					+ totalHpKayu + totalHpBatu;
		
		System.out.println("===========INFO PERMAINAN===========");
		System.out.println("===INFO BURUNG===");
		red.info();
		blues.info();
		chuck.info();
		bomb.info();
		matilda.info();
		System.out.println("===INFO BABI===");
		b1.info();
		b2.info();
		b3.info();
		System.out.println("===INFO STRUKTUR===");
		kaca.info();
		kayu.info();
		batu.info();
		
    	System.out.println("Total Burung: " +
    			"\n " +jumlahRed+ " Red" +
                "\n " +jumlahBlues+ " The Blues" +
                "\n " +jumlahChuck+ " Chuck" +
                "\n " +jumlahBomb+ " Bomb" +
                "\n " +jumlahMatilda+ " Matilda\n"
        );
    	System.out.println("=================MULAI PERMAINAN==================");
  	
        while(jumlahRed>0){
        	int kekuatanBabi=total;
        	System.out.println("Nyawa Babi : "+kekuatanBabi);
        	total-=red.damage;
        	jumlahRed--;
        	System.out.print("Sisa Burung: " +
        			"\n " +jumlahRed+ " Red" +
                    "\n " +jumlahBlues+ " The Blues" +
                    "\n " +jumlahChuck+ " Chuck" +
                    "\n " +jumlahBomb+ " Bomb" +
                    "\n " +jumlahMatilda+ " Matilda\n");
        	kekuatanBabi = total;
        	System.out.println("\nNyawa Babi : "+kekuatanBabi);
        	System.out.println("==============================================");
        }	
        
        while(jumlahBlues>0){
        	int kekuatanBabi=total;
        	System.out.println("Nyawa Babi : "+kekuatanBabi);
        	total-=blues.damage;
        	jumlahBlues--;
        	System.out.print("Sisa Burung: " +
        			"\n " +jumlahRed+ " Red" +
                    "\n " +jumlahBlues+ " The Blues" +
                    "\n " +jumlahChuck+ " Chuck" +
                    "\n " +jumlahBomb+ " Bomb" +
                    "\n " +jumlahMatilda+ " Matilda\n");
        	kekuatanBabi = total;
        	System.out.println("\nNyawa Babi : "+kekuatanBabi);
        	System.out.println("==============================================");
        }	
        
        while(jumlahChuck>0){
        	int kekuatanBabi=total;
        	System.out.println("Nyawa Babi : "+kekuatanBabi);
        	total-=chuck.damage;
        	jumlahChuck--;
        	System.out.print("Sisa Burung: " +
        			"\n " +jumlahRed+ " Red" +
                    "\n " +jumlahBlues+ " The Blues" +
                    "\n " +jumlahChuck+ " Chuck" +
                    "\n " +jumlahBomb+ " Bomb" +
                    "\n " +jumlahMatilda+ " Matilda\n");
        	kekuatanBabi = total;
        	System.out.println("\nNyawa Babi : "+kekuatanBabi);
        	System.out.println("==============================================");
        }	

        while(jumlahBomb>0){
        	int kekuatanBabi=total;
        	System.out.println("Nyawa Babi : "+kekuatanBabi);
        	total-=bomb.damage;
        	jumlahBomb--;
        	System.out.print("Sisa Burung: " +
        			"\n " +jumlahRed+ " Red" +
                    "\n " +jumlahBlues+ " The Blues" +
                    "\n " +jumlahChuck+ " Chuck" +
                    "\n " +jumlahBomb+ " Bomb" +
                    "\n " +jumlahMatilda+ " Matilda\n");
        	kekuatanBabi = total;
        	System.out.println("\nNyawa Babi : "+kekuatanBabi);
        	System.out.println("==============================================");
        }	
        
        while(jumlahMatilda>0){
        	int kekuatanBabi=total;
        	System.out.println("Nyawa Babi : "+kekuatanBabi);
        	total-=matilda.damage;
        	jumlahMatilda--;
        	System.out.print("Sisa Burung: " +
        			"\n " +jumlahRed+ " Red" +
                    "\n " +jumlahBlues+ " The Blues" +
                    "\n " +jumlahChuck+ " Chuck" +
                    "\n " +jumlahBomb+ " Bomb" +
                    "\n " +jumlahMatilda+ " Matilda\n");
        	kekuatanBabi = total;
        	System.out.println("\nNyawa Babi : "+kekuatanBabi);
        	System.out.println("==============================================");
        }	
        
        if(total<=0) {              
            System.out.println("KAMU MENANG!!");
            
        }
        
        else{             
            System.out.println("KAMU KALAH");    
   
        }    
	}
}
