
public class Keretaapi1841720007Bintang {

    private String Nama;
    private String Kelas;
    private Pegawai1841720007Bintang masinis;
    private Pegawai1841720007Bintang asisten;

    public Keretaapi1841720007Bintang(String Nama, String Kelas, Pegawai1841720007Bintang masinis) {
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.masinis = masinis;
    }

    public Keretaapi1841720007Bintang(String Nama, String Kelas, Pegawai1841720007Bintang masinis, Pegawai1841720007Bintang asisten) {
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaBintang() {
        return Nama;
    }

    public void setNamaBintang(String Nama) {
        this.Nama = Nama;
    }

    public String getKelasBintang() {
        return Kelas;
    }

    public void setKelasBintang(String Kelas) {
        this.Kelas = Kelas;
    }

    public Pegawai1841720007Bintang getMasinisBintang() {
        return masinis;
    }

    public void setMasinisBintang(Pegawai1841720007Bintang masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720007Bintang getAsisten() {
        return asisten;
    }

    public void setAsistenBintang(Pegawai1841720007Bintang asisten) {
        this.asisten = asisten;
    }

    public String info() {
        String info = "";
        info += "Nama : " + this.Nama + "\n";
        info += "Kelas : " + this.Kelas + "\n";
        info += "\n";
        info += "Masinis : \n" + this.masinis.infoRafi() + "\n";
        if (this.asisten != null) {
            info += "Asisten : \n" + this.asisten.infoRafi() + "\n";
        }
        return info;
    }
}
