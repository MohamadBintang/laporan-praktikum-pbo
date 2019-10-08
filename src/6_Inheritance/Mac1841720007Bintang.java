package Tugas;

public class Mac1841720007Bintang extends Laptop1841720007Bintang {

    public String security;

    public Mac1841720007Bintang() {

    }

    public Mac1841720007Bintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }

    public void tampilMacBintang() {
        System.out.println("============MAC============");
        super.tampilDataBintang();
        System.out.println("Security         :" + security);
    }
}
