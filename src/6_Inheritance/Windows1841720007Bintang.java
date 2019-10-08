package Tugas;

public class Windows1841720007Bintang extends Laptop1841720007Bintang {

    public String fitur;

    public Windows1841720007Bintang() {

    }

    public Windows1841720007Bintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindowsBintang() {
        System.out.println("============Windows============");
        super.tampilDataBintang();
        System.out.println("Fitur             :" + fitur);
    }
}
