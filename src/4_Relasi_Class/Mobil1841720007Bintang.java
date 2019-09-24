
public class Mobil1841720007Bintang {
    
    public String merk;
    private int biaya;

    public Mobil1841720007Bintang() {
        this.merk = merk;
        this.biaya = biaya;
    }

    public String getMerkBintang() {
        return merk;
    }

    public void setMerkBintang(String merk) {
        this.merk = merk;
    }

    public int getBiayaBintang() {
        return biaya;
    }

    public void setBiayaBintang(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilBintang(int hari){
        return biaya * hari;
    }
}
