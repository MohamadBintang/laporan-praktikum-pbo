package Tugas;

public class Laptop1841720007Bintang extends Komputer1841720007Bintang {

    public String jnsBaterai;

    public Laptop1841720007Bintang() {

    }

    public Laptop1841720007Bintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptopBintang() {
        System.out.println("============LAPTOP============");
        super.tampilDataBintang();
        System.out.println("Jenis Baterai         :" + jnsBaterai);
    }
}
