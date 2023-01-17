package uas_Pbo_AhmadHanif;

public abstract class Babi {
    private boolean topi;
    private boolean bajuBesi;
    private String ukuran;
    private int hp;
    private int jumlah;

    Babi(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public boolean isTopi() {
        return topi;
    }

    public void setTopi(boolean topi) {
        this.topi = topi;
    }

    public boolean isBajuBesi() {
        return bajuBesi;
    }

    public void setBajuBesi(boolean bajuBesi) {
        this.bajuBesi = bajuBesi;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

}
