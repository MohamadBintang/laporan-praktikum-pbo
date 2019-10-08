package Tugas;

public class MainTugas1841720007Bintang {
     public static void main(String[] args) {
        
        PC1841720007Bintang p = new PC1841720007Bintang();
        p.merk = "ASUS";
        p.jnsProsesor = "INTEL";
        p.sizeMemory = 512;
        p.kecProsesor = 25;
        p.ukuranMonitor = 15;
        p.tampilPCBintang();
        
        Mac1841720007Bintang m = new Mac1841720007Bintang();
        m.merk ="MacbookPro";
        m.jnsProsesor ="Intel i5";
        m.sizeMemory = 800;
        m.kecProsesor = 20;
        m.jnsBaterai = "Li-Ion";
        m.security = "Norton";
        m.tampilMacBintang();
                
       Windows1841720007Bintang w = new Windows1841720007Bintang();
       w.merk = "ACER";
       w.jnsProsesor = "INTEL i7";
       w.sizeMemory = 900;
       w.kecProsesor = 20;
       w.fitur       = "Windows 10 Pro";
       w.tampilWindowsBintang();
    }  
}
