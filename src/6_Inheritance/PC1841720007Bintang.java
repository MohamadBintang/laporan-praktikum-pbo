package Tugas;

public class PC1841720007Bintang extends Komputer1841720007Bintang {
        public int ukuranMonitor;
    
    public PC1841720007Bintang(){
        
    }
    
    public PC1841720007Bintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPCBintang(){
        System.out.println("============PC============");
        super.tampilDataBintang();
        System.out.println("Ukuran Monitor        :"+ukuranMonitor+"inc");
    }
}
