
public class Karyawan1841720007Bintang {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public String getNamaBintang() {
        return nama;
    }

    public void setNamaBintang(String nama) {
        this.nama = nama;
    }

    public String getNipBintang() {
        return nip;
    }

    public void setNipBintang(String nip) {
        this.nip = nip;
    }

    public String getGolonganBintang() {
        return golongan;
    }

    public void setGolonganBintang(String golongan) {
        this.golongan = golongan;
            switch(golongan.charAt(0)){
        case'1':this.gaji=5000000;
                break;
        case'2':this.gaji=3000000;
                break;
        case'3':this.gaji=2000000;
                break;
        case'4':this.gaji=1000000;
                break;
        case'5':this.gaji=750000;
                break;
    }
    }
    
    public double getGajiBintang() {
        return gaji;
    }

    public void setGajiBintang(double gaji) {
        this.gaji = gaji;
    }
    
    
}
