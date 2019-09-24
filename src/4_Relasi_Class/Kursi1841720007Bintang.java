
public class Kursi1841720007Bintang {
    private String Nomer;
    private Penumpang1841720007Bintang penumpang;

    public Kursi1841720007Bintang(String Nomer) {
        this.Nomer = Nomer;
    }

    public String getNomerBintang() {
        return Nomer;
    }

    public void setNomerBintang(String Nomer) {
        this.Nomer = Nomer;
    }

    public Penumpang1841720007Bintang getPenumpangBintang() {
        return penumpang;
    }

    public void setPenumpangBintang(Penumpang1841720007Bintang penumpang) {
        this.penumpang = penumpang;
    }

    public String InfoBintang() {
        String info = "";
        info += "Nomer : " + Nomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang : " + penumpang.infoBintang()+ "\n";
        }
        return info;
    }

}
