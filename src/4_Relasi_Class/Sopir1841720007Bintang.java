
public class Sopir1841720007Bintang {
    
    public String nama;
    private int biaya;

    public Sopir1841720007Bintang() {
        this.nama = nama;
        this.biaya = biaya;
    }

    public String getNamaBintang() {
        return nama;
    }

    public void setNamaBintang(String nama) {
        this.nama = nama;
    }

    public int getBiayaBintang() {
        return biaya;
    }

    public void setBiayaBintang(int biaya) {
        this.biaya = biaya;
    }
    
    
    public int hitungBiayaSopirBintang(int hari){
        return biaya * hari ;
    }
}
