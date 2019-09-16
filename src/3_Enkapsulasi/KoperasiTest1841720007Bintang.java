
import java.util.Scanner;

public class KoperasiTest1841720007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan KTP : ");
        int ktp = scint.nextInt();
        System.out.print("Masukkan Limit Pinjaman : ");
        int limit = scint.nextInt();
        Koperasi1841720007Bintang koperasi = new Koperasi1841720007Bintang(nama, ktp, limit);

        System.out.println("Nama Anggota : " + koperasi.getNamaBintang());
        System.out.println("Limit Pinjaman : " + koperasi.getLimitBintang());

        boolean loop = true;

        while (loop) {
            System.out.println("1. Angsuran");
            System.out.println("2. Pinjaman");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = scint.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah Angsuran : ");
                    int a = scint.nextInt();
                    koperasi.setAngsuranBintang(a);
                    System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getAngsuranBintang());
                    break;
                case 2:
                    System.out.println("Masukkan Jumlah Pinjaman");
                    int p = scint.nextInt();
                    koperasi.setPinjamanBintang(p);
                    System.out.println("Jumlah Pinjaman Saat ini : " + koperasi.getPinjamanBintang());
                    break;
                default:
                    loop = false;
                    break;

            }
        }
    }
}
