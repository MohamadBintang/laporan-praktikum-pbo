import java.util.Scanner;
public class BarangMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Barang brg = new Barang();
        
        System.out.print("Masukkan Kode Barang: ");
        brg.kode = sc.next();
        System.out.print("Masukkan Nama Barang: ");
        brg.namaBarang = sc.next();
        System.out.print("Masukkan Harga Awal: ");
        brg.hargaDasar = sc.nextInt();
        System.out.print("Masukkan Jumlah Diskon: ");
        brg.diskon = sc.nextFloat();
        
        brg.hitungHargaJual(brg.hargaDasar, brg.diskon);
        brg.tampilData();
    }
    
}
