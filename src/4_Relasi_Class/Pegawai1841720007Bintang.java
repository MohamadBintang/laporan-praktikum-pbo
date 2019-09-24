
public class Pegawai1841720007Bintang {
    private String NIP;
    private String Nama;

    public Pegawai1841720007Bintang(String NIP, String Nama) {
        this.NIP = NIP;
        this.Nama = Nama;
    }

    public String getNIPBintang() {
        return NIP;
    }

    public void setNIPBintang(String NIP) {
        this.NIP = NIP;
    }

    public String getNamaBintang() {
        return Nama;
    }

    public void setNamaBintang(String Nama) {
        this.Nama = Nama;
    }
    
    public String infoRafi(){
        String info = "";
        info += "NIP : "+this.NIP+"\n";
        info += "Nama : "+this.Nama+"\n";
        return info;
    }
    
}
