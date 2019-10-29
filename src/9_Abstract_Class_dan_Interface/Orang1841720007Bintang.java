
public class Orang1841720007Bintang {
   private String nama;
   private Hewan1841720007Bintang hewanPeliharaan;
   
   public Orang1841720007Bintang(String nama){
       this.nama = nama;
   }
   public void peliharaanHewan(Hewan1841720007Bintang hewanPeliharaan){
       this.hewanPeliharaan = hewanPeliharaan;
   }
   public void ajakPeliharaanJalanJalan(){
       System.out.println("Namaku " + this.nama);
       System.out.println("Hewan peliharaanku berjalan dengan cara: ");
       this.hewanPeliharaan.bergerakBintang();
       System.out.println("---------------------------------------------");
   }
}
