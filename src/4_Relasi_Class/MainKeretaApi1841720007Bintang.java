
public class MainKeretaApi1841720007Bintang {
        public static void main(String[] args) {
        Pegawai1841720007Bintang masinis = new Pegawai1841720007Bintang("11222", "Mohamad Bintang Satriavi");
        Pegawai1841720007Bintang asisten = new Pegawai1841720007Bintang("22211", "Bagong Gong");
        Keretaapi1841720007Bintang k = new Keretaapi1841720007Bintang("Gajayana", "Eksekutif", masinis, asisten);
        System.out.println(k.info());
    }
    
}
