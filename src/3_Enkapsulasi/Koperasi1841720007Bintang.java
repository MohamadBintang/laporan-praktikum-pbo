
public class Koperasi1841720007Bintang {
    private int KTP;
    private String Nama;
    private int Limit;
    private int Pinjaman;
    private int Angsuran;
    
    public Koperasi1841720007Bintang(String Nama, int KTP, int Limit){
        this.KTP = KTP;
        this.Nama = Nama;
        this.Limit = Limit;
    }
    
    public int getKTPBintang(){
        return KTP;
    }
    
    public void setKTPBintang(int KTP){
        this.KTP = KTP;
    }
    
    public String getNamaBintang(){
        return Nama;
    }
    
    public void setNamaBintang(String Nama){
        this.Nama = Nama;
    }
    
    public int getLimitBintang(){
        return Limit;
    }
    
    public void setLimitBintang(int Limit){
        this.Limit = Limit;
    }
    
    public int getPinjamanBintang(){
        return Pinjaman;
    }
    
    public int getAngsuranBintang(){
        return Angsuran;
    }
    
    public void setAngsuranBintang(int Angsuran){
        int var = 10 * this.Pinjaman / 100;
        if (var <=Angsuran){
            this.Pinjaman -= Angsuran;
        }else{
            System.out.println("Maaf, Angsuran harus 10% dari jumlah pinjaman");
        }
    }
    
    public void setPinjamanBintang(int NewPinjaman){
        if(NewPinjaman <= Limit){
            this.Pinjaman += NewPinjaman;
        }else{
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        }
    }
}
