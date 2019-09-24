
public class MainRental1841720007Bintang {
    public static void main(String[]args){
       Mobil1841720007Bintang m = new Mobil1841720007Bintang();
       m.setMerkBintang("Avanza");
       m.setBiayaBintang(350000);
       Sopir1841720007Bintang s = new Sopir1841720007Bintang();
       s.setNamaBintang("Bintang");
       s.setBiayaBintang(200000);
       Pelanggan1841720007Bintang p = new Pelanggan1841720007Bintang();
       p.setNamaBintang("Bintang");
       p.setMobilBintang(m);
       p.setSopirBintang(s);
       p.setHariBintang(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalBintang());
       
       
    }
}
