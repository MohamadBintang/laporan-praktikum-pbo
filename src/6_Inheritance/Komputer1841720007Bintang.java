package Tugas;

public class Komputer1841720007Bintang {
    public String merk,jnsProsesor;
    public int kecProsesor, sizeMemory;
    
   public Komputer1841720007Bintang(){
       
   } 
   
   public Komputer1841720007Bintang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
       this.merk = merk;
       this.kecProsesor= kecProsesor;
       this.sizeMemory= sizeMemory;
       this.jnsProsesor= jnsProsesor;
       
   }
   
   public void tampilDataBintang(){
       System.out.println("Nama Merk            :"+merk);
       System.out.println("Kecepatan Prosesor   :"+kecProsesor+"Ghz");
       System.out.println("Ukuran Memory        :"+sizeMemory+"GB");
       System.out.println("Jenis Prosesor       :"+jnsProsesor);
   }
}
