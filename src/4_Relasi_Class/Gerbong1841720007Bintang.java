
public class Gerbong1841720007Bintang {
    private String Kode;
    private Kursi1841720007Bintang[] ArrayKursi;

    public Gerbong1841720007Bintang(String Kode, int Jumlah) {
        this.Kode = Kode;
        this.ArrayKursi = new Kursi1841720007Bintang[Jumlah];
        this.initKursiBintang();
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }

    public Kursi1841720007Bintang[] getArrayKursi() {
        return ArrayKursi;
    }

    public void setmArrayKursi(Kursi1841720007Bintang[] ArrayKursi) {
        this.ArrayKursi = ArrayKursi;
    }

    private void initKursiBintang() {
        for (int i = 0; i < ArrayKursi.length; i++) {
            this.ArrayKursi[i] = new Kursi1841720007Bintang(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode : " + Kode + "\n";
        for (Kursi1841720007Bintang kr : ArrayKursi) {
            info += kr.InfoBintang();
        }
        return info;
    }
    
    public void setPenumpang(Penumpang1841720007Bintang p,int nomor){
        if (this.ArrayKursi[nomor-1].getPenumpangBintang() != null){
            System.out.println("Kursi Tidak tersedia");
        }else 
        this.ArrayKursi[nomor-1].setPenumpangBintang(p);
        
    }

}
