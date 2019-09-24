
public class Penumpang1841720007Bintang {
    private String KTP;
    private String Nama;

    public Penumpang1841720007Bintang(String KTP, String Nama) {
        this.KTP = KTP;
        this.Nama = Nama;
    }

    public String getKTPBintang() {
        return KTP;
    }

    public void setKTPBintang(String KTP) {
        this.KTP = KTP;
    }

    public String getmNamaBintang() {
        return Nama;
    }

    public void setmNamaBintang(String Nama) {
        this.Nama = Nama;
    }

    public String infoBintang() {
        String info = "";
        info += "KTP : " + KTP + "\n";
        info += "Nama : " + Nama + "\n";
        return info;
    }
}

