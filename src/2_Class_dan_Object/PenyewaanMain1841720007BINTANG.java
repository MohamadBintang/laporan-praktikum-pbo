import java.util.Scanner;

public class PenyewaanMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Penyewaan sewa = new Penyewaan();
        
        sewa.id=110;
        System.out.print("Masukkan Nama Anda\t : ");
        sewa.namaMember = sc.next();
        System.out.print("Masukkan Nama Game\t : ");
        sewa.namaGame = sc.next();
        System.out.print("Masukkan Lama sewa Game\t : ");
        sewa.lamaSewa = sc.nextInt();
        System.out.print("Harga Per hari\t : ");
        sewa.harga = sc.nextInt();
        sewa.hargaTotal();
        sewa.tampilData();
    }

}
