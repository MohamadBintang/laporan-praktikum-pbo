
public class Anggota1841720007Bintang {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota1841720007Bintang(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    public void setNamaBintang(String nama){
        this.nama = nama;
    }
    
    public void setAlamatBintang(String alamat){
        this.alamat = alamat;
    }
    
    public String getNamaBintang(){
        return nama;
    }
    
    public String getAlamatBintang(){
        return alamat;
    }
    
    public float getSimpananBintang(){
        return simpanan;
    }
    
    public void setorBintang(float uang){
        simpanan +=uang;
    }
    
    public void pinjamBintang(float uang){
        simpanan -=uang;
    }
}
