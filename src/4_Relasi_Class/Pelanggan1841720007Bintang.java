
public class Pelanggan1841720007Bintang {

    private String nama;
    private Mobil1841720007Bintang mobil;
    private Sopir1841720007Bintang sopir;
    private int hari;

    public String getNamaBintang() {
        return nama;
    }

    public void setNamaBintang(String nama) {
        this.nama = nama;
    }

    public Mobil1841720007Bintang getMobil() {
        return mobil;
    }

    public void setMobilBintang(Mobil1841720007Bintang mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720007Bintang getSopir() {
        return sopir;
    }

    public void setSopirBintang(Sopir1841720007Bintang sopir) {
        this.sopir = sopir;
    }

    public int getHariBintang() {
        return hari;
    }

    public void setHariBintang(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalBintang(){
        return mobil.hitungBiayaMobilBintang(hari) + sopir.hitungBiayaSopirBintang(hari);
    }
    
}
